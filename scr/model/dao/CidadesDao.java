package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.entities.Cidades;

public class CidadesDao {
	
	public List<Cidades> getTodasCidades() {
		Connection connection = MySqlConnection.getConnection();
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM lojacarros.municipio");
			List<Cidades> cidades = new ArrayList<Cidades>();
			while(rs.next()) {
				Cidades cid = toCidades(rs);
				cidades.add(cid);
			}
			return cidades;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	private Cidades toCidades(ResultSet rs) throws SQLException {
		Cidades cid = new Cidades();
		cid.setId(rs.getInt("id"));
		cid.setCodigo(rs.getInt("codigo"));
		cid.setCidade(rs.getString("cidade"));
		cid.setUf(rs.getString("uf"));
		return cid;
	}
	

}
