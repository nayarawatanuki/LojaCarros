package control;

import java.util.List;

import model.dao.CidadesDao;
import model.entities.Cidades;

public class CidadesBLL {
	
	CidadesDao dao = new CidadesDao();
	
	public List<Cidades> getTodasCidades() {
		return dao.getTodasCidades();
	}

}
