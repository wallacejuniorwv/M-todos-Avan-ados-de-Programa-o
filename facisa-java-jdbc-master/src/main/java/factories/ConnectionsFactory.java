package factories;

import connections.MySqlJDBCConnector;

import java.sql.Connection;

public class ConnectionsFactory {

    private static ConnectionsFactory instance = null;

    private Connection mysqlConn;

    public ConnectionsFactory(){
        try {
            mysqlConn = new MySqlJDBCConnector("localhost", "atividade", "root", "")
                    .getCurrentConnection();
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static ConnectionsFactory getInstance(){
        if(instance == null){
            instance = new ConnectionsFactory();
        }

        return instance;
    }

    public Connection getConnection(){
        return mysqlConn;
    }


}
