package jdbc;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import dao.IBandeiraDAO;
import factories.ConnectionsFactory;
import models.Bandeira;
import models.Pessoa;

public class JDBCBandeiraDAO implements IBandeiraDAO {

	private List<Bandeira> bandeiras = new ArrayList<Bandeira>();

	private Connection connection;

	public void JDBCBandeiraDAO() {
		connection = ConnectionsFactory.getInstance().getConnection();
	}

	public void add(Bandeira bandeira) {
		bandeiras.add(bandeira);

		try {
			connection.createStatement().executeUpdate("INSERT INTO bandeiras (tipo) VALUES ('" + bandeira.getTipo());
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	@Override
	public void remover(Bandeira bandeira) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Bandeira> search(String query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bandeira> all() {
		// TODO Auto-generated method stub
		return null;

	}
}
