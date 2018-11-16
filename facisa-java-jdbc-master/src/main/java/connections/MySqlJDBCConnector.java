package connections;

import builders.IQueryBuilder;
import builders.MySqlQueryBuilder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlJDBCConnector implements connections.Connection {

    private Connection connection = null;

    private String host;
    private String database;
    private String username;
    private String password;

    public MySqlJDBCConnector(String host, String database, String username, String password){
        this.host = host;
        this.database = database;
        this.username = username;
        this.password = password;
    }

    public Connection getCurrentConnection() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

        connection = DriverManager
                .getConnection("jdbc:mysql://" + host + "/" + database + "?user=" + username + "&password=" + password);

        return connection;
    }

    @Override
    public IQueryBuilder getQueryBuilder() {
        return new MySqlQueryBuilder(this);
    }
}
