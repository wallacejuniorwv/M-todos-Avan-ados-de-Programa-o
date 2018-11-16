package jdbc;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import dao.IRevendaDAO;
import factories.ConnectionsFactory;
import models.Pessoa;
import models.Revenda;

public class JDBCRevendaDAO implements IRevendaDAO {

	private List<Revenda> revendas = new ArrayList<Revenda>();

	private Connection connection;

	public JDBCRevendaDAO() {
		connection = ConnectionsFactory.getInstance().getConnection();
	}

	public void add(Revenda revanda) {
		Revenda revenda = null;
		revendas.add(revenda);

		try {
			connection.createStatement().executeUpdate("INSERT INTO revendas (razaoSocial, endereco) VALUES ('"
					+ revenda.getRazaoSocial() + "', '" + revenda.getEndereco());
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	@Override
	public void remover(Revenda revenda) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Revenda> search(String query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Revenda> all() {
		// TODO Auto-generated method stub
		return null;
	}

}
