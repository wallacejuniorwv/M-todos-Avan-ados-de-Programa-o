package builders;

import connections.Connection;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

abstract class QueryBuilder implements IQueryBuilder {

    protected String table;

    protected ArrayList<String> columns;

    protected ArrayList<HashMap<String, String>> wheres;

    protected Connection connection;

    protected QueryBuilder(){}

    public QueryBuilder(Connection connection){
        this.connection = connection;
    }

    @Override
    public Connection getConnection() {
        return connection;
    }

    public IQueryBuilder table(String table) {
        this.table = table;

        return this;
    }

    public IQueryBuilder select(String column) {
        columns.add(column);

        return this;
    }

    public IQueryBuilder selectAll() {
        columns.add("*");

        return this;
    }

    public IQueryBuilder where(String field, String value) {
        HashMap<String, String> entry = new HashMap<String, String>();

        entry.put("field", field);
        entry.put("condition", "and");
        entry.put("value", value);

        wheres.add(entry);

        return this;
    }

    public IQueryBuilder orWhere(String field, String value) {
        HashMap<String, String> entry = new HashMap<String, String>();

        entry.put("field", field);
        entry.put("condition", "or");
        entry.put("value", value);

        wheres.add(entry);

        return this;
    }

}
