package builders;

import connections.Connection;

import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class MySqlQueryBuilder extends QueryBuilder {

    public MySqlQueryBuilder(Connection connection){
        super(connection);
    }

    public ResultSet get() {


        try {
            Statement statement = getConnection()
                    .getCurrentConnection()
                    .createStatement();



            for(HashMap<String, String> field: wheres) {
                String fieldName = field.get("field");
                String condition = field.get("condition");
                String value = field.get("value");

                

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return new ResultSet();
    }
}
