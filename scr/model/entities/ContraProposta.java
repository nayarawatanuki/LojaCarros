package model.entities;

public class ContraProposta {
	private Cliente cliente;
	private Carros carro;
	private double valor;
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Carros getCarro() {
		return carro;
	}
	public void setCarro(Carros carro) {
		this.carro = carro;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
}
