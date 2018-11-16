package builders;

import connections.Connection;

public interface IQueryBuilder {

    IQueryBuilder table(String table);

    IQueryBuilder select(String column);

    IQueryBuilder selectAll();

    IQueryBuilder where(String field, String value);

    IQueryBuilder orWhere(String field, String value);

    ResultSet get();

    Connection getConnection();
}
