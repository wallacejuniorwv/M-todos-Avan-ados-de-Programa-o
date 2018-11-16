package jdbc;

import java.sql.Connection;
import java.util.List;

import dao.IEnderecoDAO;
import factories.ConnectionsFactory;
import models.Endereco;


public class JDBCEnderecoDAO implements IEnderecoDAO {
		
		  private Connection connection;

		    public JDBCEnderecoDAO(){
		        connection = ConnectionsFactory.getInstance().getConnection();
		    }

		    public void add(Endereco endereco){
		        endereco.add(endereco);

		        try {
		            connection
		                    .createStatement()
		                    .executeUpdate("INSERT INTO endereco (cidade, estado) VALUES ('"
		                            + endereco.getCidade() + "', '"
		                            + endereco.getEstado());
		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }

		    
		
	}

	@Override
	public void remover(Endereco endereco) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Endereco> search(String query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Endereco> all() {
		// TODO Auto-generated method stub
		return null;
	}

}
