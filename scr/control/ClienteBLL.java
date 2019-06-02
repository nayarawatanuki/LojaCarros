package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.dao.ClienteDAO;
import model.entities.Cliente;

public class ClienteBLL {

	ClienteDAO cd = new ClienteDAO();

	
	public boolean adicionar(Cliente cliente) throws SQLException {
		return cd.insertCliente(cliente);
	}
	
	public boolean excluir(Cliente cliente) throws SQLException {
		return cd.deleteCliente(cliente);
	}
	
	public boolean alterar(Cliente cliente) throws SQLException {
		return cd.updateCliente(cliente);
	}
	
	public ArrayList<Cliente> buscar(String filtro) throws SQLException{
		return cd.selectCliente(filtro);
	}
}
