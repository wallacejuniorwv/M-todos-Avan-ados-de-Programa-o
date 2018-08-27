package Singleton;

import java.sql.Connection;

public class main {
	
	
	
	public static void main(String[] args) {
		
		ConnectionSingleton conSing = ConnectionSingleton.getInstancy();
		Connection conexao = conSing.getConexao();
	}

}
