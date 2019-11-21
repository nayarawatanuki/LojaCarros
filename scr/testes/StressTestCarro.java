package testes;

import control.CarrosBLL;
import model.entities.Carros;

public class StressTestCarro {

	public static void main(String[] args) {
		
		Carros carro = new Carros();
		CarrosBLL ctrl = new CarrosBLL();
		
		for(int i = 0; i < 50000; i++) {
			carro.setModelo("Modelo" + i);
			carro.setAno(2016);
			carro.setChassi("BJK4582" + i);
			carro.setCidade("Bragança Paulista");
			carro.setCombustivel("Flex");
			carro.setEstado("SP");
			carro.setKm(12457.89);
			carro.setMarca("Marca" + i);
			carro.setPlaca("BLL" + i);
			carro.setPreco(9999);
			
			ctrl.insertCarros(carro);
		}
	}
}
