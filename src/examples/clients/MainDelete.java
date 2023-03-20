package examples.clients;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MainDelete {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        
        String DATABASE_URL = "jdbc:postgresql://localhost:5432/java_oop";
        String user = "postgres";
        String passwd = "postgres";
        
        Connection connection = DriverManager.getConnection(DATABASE_URL, user, passwd);
        
        String sql = "DELETE FROM CLIENTS WHERE ID=4";
        PreparedStatement ps = connection.prepareStatement(sql);
                
        ps.execute();
    }
}
