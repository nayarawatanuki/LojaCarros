package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.dao.GerenteDAO;
import model.entities.Gerente;

public class GerenteBLL {
	GerenteDAO cd = new GerenteDAO();

	
	public boolean adicionar(Gerente Gerente) throws SQLException {
		return cd.insertGerente(Gerente);
	}
	
	public boolean excluir(Gerente Gerente) throws SQLException {
		return cd.deleteGerente(Gerente);
	}
	
	public boolean alterar(Gerente Gerente) throws SQLException {
		return cd.updateGerente(Gerente);
	}
	
	public ArrayList<Gerente> buscar(String filtro) throws SQLException{
		return cd.selectGerente(filtro);
	}
}
