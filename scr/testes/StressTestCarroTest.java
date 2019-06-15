package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import control.CarrosBLL;
import model.entities.Carros;

class StressTestCarroTest {

	Carros carro = new Carros("modelo", "marca", 2019, "cidade", "es", "placa", "chassi",
			25357.9, 21000, "combustivel");
	
	@Test
	void test() {
		
		CarrosBLL ctrl = new CarrosBLL();
		
		for(int i = 0; i < 4000; i++) {
			ctrl.insertCarros(carro);
		}
	}

}
