package dao;

import models.Pessoa;

import java.util.List;

public interface IPessoaDAO {

    public void add(Pessoa pessoa);

    public void remover(Pessoa pessoa);

    public List<Pessoa> search(String query);

    public List<Pessoa> all();

}
