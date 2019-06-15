package testes;

import control.CarrosBLL;
import model.entities.Carros;

public class StressTestCarro {

	public static void main(String[] args) {
		
		Carros carro = new Carros();
		CarrosBLL ctrl = new CarrosBLL();
		
		for(int i = 0; i < 50000; i++) {
			carro.setModelo("Modelo Teste" + i);
			carro.setAno(2016);
			carro.setChassi("BJK4582");
			carro.setCidade("Bragança Paulista");
			carro.setCombustivel("Flex");
			carro.setEstado("SP");
			carro.setKm(12457.89);
			carro.setMarca("Teste Marca");
			carro.setPlaca("BLL7896");
			carro.setPreco(23600);
			
			ctrl.insertCarros(carro);
		}
	}
}
