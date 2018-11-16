package jdbc;

import dao.IPessoaDAO;
import factories.ConnectionsFactory;
import models.Pessoa;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class JDBCPessoaDAO implements IPessoaDAO {

    private List<Pessoa> pessoas = new ArrayList<Pessoa>();

    private Connection connection;

    public JDBCPessoaDAO(){
        connection = ConnectionsFactory.getInstance().getConnection();
    }

    public void add(Pessoa pessoa){
        pessoas.add(pessoa);

        try {
            connection
                    .createStatement()
                    .executeUpdate("INSERT INTO pessoas (nome, cpf, idade, profissao) VALUES ('"
                            + pessoa.getNome() + "', '"
                            + pessoa.getCpf() + "', '"
                            + pessoa.getIdade() + "', 'DEV')");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void remover(Pessoa pessoa){
        pessoas.remove(pessoa);
    }

    public List<Pessoa> search(String query){
        return pessoas;
    }

    public List<Pessoa> all(){
        return pessoas;
    }
}
