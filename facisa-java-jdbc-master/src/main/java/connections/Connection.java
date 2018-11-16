package connections;

import builders.IQueryBuilder;

import java.sql.SQLException;

public interface Connection {

    public java.sql.Connection getCurrentConnection() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException;

    public IQueryBuilder getQueryBuilder();
}
