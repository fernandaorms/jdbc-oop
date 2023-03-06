package examples.clients;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import examples.clients.model.Client;

public class MainSelect {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        
        String DATABASE_URL = "jdbc:postgresql://localhost:5432/java_oop";
        String user = "postgres";
        String passwd = "postgres";
        
        Connection connection = DriverManager.getConnection(DATABASE_URL, user, passwd);
        
        String sql = "SELECT * FROM CLIENTS ORDER BY id";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
            Client cliente = new Client();
            cliente.setId(rs.getInt("id"));
            cliente.setFirstName(rs.getString("firstName"));
            cliente.setCpf(rs.getString("cpf"));
            cliente.setPhone(rs.getString("phone"));
            System.out.println(cliente);
        }
    }
}
