package jdbc;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import dao.IHistoricoDAO;
import factories.ConnectionsFactory;
import models.Historico;

public class JDBCHistoricoDAO implements IHistoricoDAO {

	private List<Historico> historicos = new ArrayList<Historico>();

	private Connection connection;

	public JDBCHistoricoDAO() {
		connection = ConnectionsFactory.getInstance().getConnection();
	}

	public void add(Historico historico) {
		historicos.add(historico);

		try {
			connection.createStatement()
					.executeUpdate("INSERT INTO historicos (data, valor, revenda) VALUES ('" + historico.getData()
							+ "', '" + historico.getValor() + "', '" + historico.getRevenda() + "', 'DEV')");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		// public class Historico {
		// private Date data;
		// private String Valor;
		// private Revenda revenda;

	}

	@Override
	public void remover(Historico historico) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Historico> search(String query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Historico> all() {
		// TODO Auto-generated method stub
		return null;
	}

}
