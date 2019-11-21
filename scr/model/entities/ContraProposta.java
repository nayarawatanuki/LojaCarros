package model.entities;

public class ContraProposta {
	private String cliente;
	private String carro;
	private double valor;
	
	public ContraProposta() {}
	public ContraProposta(double valor) {
		this.valor = valor;
		this.cliente = cliente;
	}
	
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getCarro() {
		return carro;
	}
	public void setCarro(String carro) {
		this.carro = carro;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
}
