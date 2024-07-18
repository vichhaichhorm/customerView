import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnector {
    private Connection connection;

    public DatabaseConnector() {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/customers", "postgres", "052003");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ResultSet getCustomers() {
        try {
            Statement statement = connection.createStatement();
            return statement.executeQuery("SELECT * FROM customers");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
