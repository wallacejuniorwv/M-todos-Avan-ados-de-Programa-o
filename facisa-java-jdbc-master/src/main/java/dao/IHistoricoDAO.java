package dao;

import java.util.List;

import models.Historico;

public interface IHistoricoDAO {
	
	  public void add(Historico historico);

	    public void remover(Historico historico);

	    public List<Historico> search(String query);

	    public List<Historico> all();

}
