package Singleton;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class ConnectionSingleton {

	private Connection conexao;
	private String url =  "jdbc:postgreesql://localhost:5432/teste";
	private String user = "admin";
	private String senha = "102030";
	private static ConnectionSingleton instancy;
	
	private ConnectionSingleton() {
		try {
			Class.forName("org.postgresql.Driver");
			JOptionPane.showMessageDialog(null, "Driver Ok!");
		} 
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Driver não encontrado.");
		}
		try {
			this.conexao = DriverManager.getConnection(url, user, senha);
			JOptionPane.showMessageDialog(null, "Conexão Ok!");
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	public static ConnectionSingleton getInstancy() {
		if (instancy == null) {
			instancy = new ConnectionSingleton();
		}
		return instancy;
		}
	public Connection getConexao() {
		return this.conexao;
	}
}

//Fonte: https://www.youtube.com/watch?v=5FgzzT2OEhI

