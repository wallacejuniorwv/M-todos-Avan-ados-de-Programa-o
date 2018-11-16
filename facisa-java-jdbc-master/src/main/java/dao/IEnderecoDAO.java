package dao;

import java.util.List;

import models.Endereco;

public interface IEnderecoDAO {

	    public void add(Endereco endereco);

	    public void remover(Endereco endereco);

	    public List<Endereco> search(String query);

	    public List<Endereco> all();

}
