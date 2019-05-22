create database lojaCarros;
use lojaCarros;

create table carro(
    id int primary key auto_increment not null,
    modelo varchar(50),
    marca varchar(50),
    ano int,
    cidade varchar(50),
    estado varchar(2),
    placa varchar(50),
    chassi varchar(50),
    km double,
    preco double,
    combustivel varchar(25),
    ativo tinyint(1) default 1
);

create table gerente(
    gerid int primary key auto_increment not null,
    gernome varchar(50),
    gerregistro varchar(20)  
);

create table cliente(
    cliid int primary key auto_increment not null,
    clinome varchar(50),
    cliemail varchar(20),
    clitelefone varchar(20),
    clisenha varchar(30)
);

create table contraproposta(
    id int primary key auto_increment not null,
    valor double,
    idCliente int,
    idCarro int,
    FOREIGN KEY ( `idCliente` ) REFERENCES `cliente` ( `id` ),
    FOREIGN KEY ( `idCarro` ) REFERENCES `carro` ( `id` )
);

/*insert into carro(modelo) values("Gol");
insert into cliente(nome) values("Joao");
insert into contraproposta(valor, idCliente, idCarro) values(50000, 1, 1);

select * from contraproposta;*/


CREATE PROCEDURE inserir_Carros(IN pmodelo varchar(50),
    IN pmarca varchar(50),
    IN pano int,
    IN pcidade varchar(50),
    IN pestado varchar(2),
    IN pplaca varchar(50),
    IN pchassi varchar(50),
    IN pkm double,
    IN ppreco double,
    IN pcombustivel varchar(25))
BEGIN
    insert into carro(modelo, marca, ano, cidade, estado, placa, chassi, km, preco, combustivel)
        values(pmodelo, pmarca, pano, pcidade, pestado, pplaca, pchassi, pkm, ppreco, pcombustivel);
END $$
DELIMITER ;

CREATE PROCEDURE alterar_Carros(IN pid int
    IN pmodelo varchar(50),
    IN pmarca varchar(50),
    IN pano int,
    IN pcidade varchar(50),
    IN pestado varchar(2),
    IN pplaca varchar(50),
    IN pchassi varchar(50),
    IN pkm double,
    IN ppreco double,
    IN pcombustivel varchar(25))
BEGIN
    update carro set modelo = pmodelo, marca = pmarca, ano = pano, cidade = pcidade, estado = pestado,
    placa = pplaca, chassi = pchassi, km = pkm, preco = ppreco, combustivel = pcombustivel
    where id = pid;
END $$
DELIMITER ;

CREATE PROCEDURE excluir_Carros(IN pid int)
BEGIN
    update carro set ativo = 0 where id = pid;
END $$
DELIMITER ;

CREATE PROCEDURE buscar_Carros(IN filter varchar(45))
BEGIN
    IF filter LIKE '' THEN
		SELECT id, modelo, marca, ano, cidade, estado, placa, chassi, km, preco, combustivel 
			FROM carro 
				WHERE ativo IS TRUE;
	ELSE
		SELECT id, modelo, marca, ano, cidade, estado, placa, chassi, km, preco, combustivel
			FROM carro
				WHERE 
					(modelo LIKE CONCAT('%', filter,'%') OR
					marca LIKE CONCAT('%', filter,'%') OR
					ano LIKE CONCAT('%', filter,'%') OR
					cidade LIKE CONCAT('%', filter,'%') OR
					estado LIKE CONCAT('%', filter,'%') OR
					placa LIKE CONCAT('%', filter,'%') OR
					chassi LIKE CONCAT('%', filter,'%') OR
					km LIKE CONCAT('%', filter,'%') OR
					preco LIKE CONCAT('%', filter,'%') OR
					combustivel LIKE CONCAT('%', filter,'%')) AND ativo IS TRUE;
	END IF;
END $$
DELIMITER ;