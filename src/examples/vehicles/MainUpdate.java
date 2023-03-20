package examples.vehicles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import examples.vehicles.model.Vehicle;

public class MainUpdate {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        
        String DATABASE_URL = "jdbc:postgresql://localhost:5432/java_oop";
        String user = "postgres";
        String passwd = "postgres";
        
        Connection connection = DriverManager.getConnection(DATABASE_URL, user, passwd);
        
        String sql = "UPDATE VEHICLES SET model=?, brand=?, price=? WHERE ID=?";
        PreparedStatement ps = connection.prepareStatement(sql);

        Vehicle vehicle = new Vehicle(4, "Argo Trekking", "Fiat", 95000.00);

        ps.setString(1, vehicle.getModel());
        ps.setString(2, vehicle.getBrand());
        ps.setDouble(3, vehicle.getPrice());
        ps.setInt(4, vehicle.getId());
        ps.execute();
    }
}
