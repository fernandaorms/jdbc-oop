package examples.clients;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import examples.clients.model.Client;

public class MainInsert {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        
        String DATABASE_URL = "jdbc:postgresql://localhost:5432/java_oop";
        String user = "postgres";
        String passwd = "postgres";
        
        Connection connection = DriverManager.getConnection(DATABASE_URL, user, passwd);
        
        String sql = "INSERT INTO CLIENTS (firstName, cpf, phone) VALUES (?, ?, ?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        
        Client cliente = new Client("Client 4", "444.444.444-44", "(44) 4444-4444");
        
        ps.setString(1, cliente.getFirstName());
        ps.setString(2, cliente.getCpf());
        ps.setString(3, cliente.getPhone());
        ps.execute();
    }
}
