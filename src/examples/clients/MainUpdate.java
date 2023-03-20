package examples.clients;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import examples.clients.model.Client;

public class MainUpdate {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        
        String DATABASE_URL = "jdbc:postgresql://localhost:5432/java_oop";
        String user = "postgres";
        String passwd = "postgres";
        
        Connection connection = DriverManager.getConnection(DATABASE_URL, user, passwd);
        
        String sql = "UPDATE CLIENTS SET firstName=?, cpf=?, phone=? WHERE ID=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        
        Client cliente = new Client(1, "Cliente 0", "000.000.000-00", "(00) 0000-0000");
        
        ps.setString(1, cliente.getFirstName());
        ps.setString(2, cliente.getCpf());
        ps.setString(3, cliente.getPhone());
        ps.setInt(4, cliente.getId());
        ps.execute();
    }
}
