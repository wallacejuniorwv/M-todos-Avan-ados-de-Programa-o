package dao;

import java.util.List;

import models.Bandeira;

public interface IBandeiraDAO {

	    public void add(Bandeira bandeira);

	    public void remover(Bandeira bandeira);

	    public List<Bandeira> search(String query);

	    public List<Bandeira> all();

}
