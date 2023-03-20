package examples.vehicles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import examples.vehicles.model.Vehicle;

public class MainSelect {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");

        String DATABASE_URL = "jdbc:postgresql://localhost:5432/java_oop";
        String user = "postgres";
        String passwd = "postgres";

        Connection connection = DriverManager.getConnection(DATABASE_URL, user, passwd);

        String sql = "SELECT * FROM VEHICLES ORDER BY id";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while(rs.next()){
            Vehicle vehicle = new Vehicle();
            vehicle.setId(rs.getInt("id"));
            vehicle.setModel(rs.getString("model"));
            vehicle.setBrand(rs.getString("brand"));
            vehicle.setPrice(rs.getDouble("price"));
            System.out.println(vehicle);
        }
    }
}
