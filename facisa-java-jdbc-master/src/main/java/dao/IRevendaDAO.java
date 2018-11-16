package dao;

import java.util.List;

import models.Revenda;

public interface IRevendaDAO {
	

    public void add(Revenda revenda);

    public void remover(Revenda revenda);

    public List<Revenda> search(String query);

    public List<Revenda> all();

}
