package Model;

public class Carros {
	
	private String modelo;
	private String marca;
	private String ano;
	
	private String cidade;
	private String estado;
	private String placa;
	private String chassi;
	private String km;
	private double preco;
	private String combustivel;
	
	
	
	public Carros(String modelo, String marca, String ano, String cidade, String estado, String placa, String chassi, String km, double preco, String combustivel) {
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.cidade = cidade;
		this.estado = estado;
		this.placa = placa;
		this.chassi = chassi;
		this.km = km;
		this.preco = preco;
		this.combustivel = combustivel;
	}

	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getAno() {
		return ano;
	}
	
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getChassi() {
		return chassi;
	}
	
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	
	public String getKm() {
		return km;
	}
	
	public void setKm(String km) {
		this.km = km;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getCombustivel() {
		return combustivel;
	}
	
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	
	

}
