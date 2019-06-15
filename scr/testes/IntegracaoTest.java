package testes;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import control.GerenteBLL;
import junit.framework.TestCase;
import model.entities.Gerente;

class IntegracaoTest extends TestCase {
	
	@Test
	void testInserir() throws SQLException {
		
		Gerente gerente = new Gerente();
		gerente.setGerid(1);
		gerente.setGernome("Alice");
		gerente.setGerregistro("BP1762451");
		
		System.out.println("Incluindo um gerentee no Sistema..."); 
		
		GerenteBLL gerentebll = new GerenteBLL();
		gerentebll.insertGerente(gerente);
		
		Assert.assertTrue( gerentebll.insertGerente(gerente));
		
		System.out.println("Gerente incluído com sucesso: " + gerente.getGernome());

	}
	
	@Test
	void testConsultar() throws SQLException {
		
		Gerente gerente = new Gerente();
		gerente.setGerid(1);
		gerente.setGernome("Alice");
		gerente.setGerregistro("BP1762451");
		
		System.out.println("Consultando um gerente no Sistema...");
		
		GerenteBLL gerentebll = new GerenteBLL();
		gerentebll.selectGerente(gerente.getGernome());
		 
		System.out.println("Gerente consultado com sucesso ");
	}
	
	@Test
	void testRemover() throws SQLException {
		
		Gerente gerente = new Gerente();
		gerente.setGerid(1);
		gerente.setGernome("Pedro");
		gerente.setGerregistro("BP1775552");
		
		System.out.println("Excluindo um gerente no Sistema...");
		
		GerenteBLL gerentebll = new GerenteBLL();
		gerentebll.deleteGerente(gerente);
		
		System.out.println("Consultando o gerente no Sistema...");
		ArrayList gerentes = gerentebll.selectGerente(gerente.getGernome());
		
		Assert.assertTrue(gerentes.isEmpty());
		System.out.println("Gerente excluído com sucesso ");
	}
}
