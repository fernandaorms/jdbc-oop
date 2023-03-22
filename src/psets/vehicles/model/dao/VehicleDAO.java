package psets.vehicles.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import psets.vehicles.model.domain.Vehicle;

public class VehicleDAO {
    
    private Connection connection;

    public VehicleDAO() {
        try {
            Class.forName("org.postgresql.Driver");
            String DATABASE_URL = "jdbc:postgresql://localhost:5432/java_oop";
            String user = "postgres";
            String passwd = "postgres";
            this.connection = DriverManager.getConnection(DATABASE_URL, user, passwd);
        } catch (ClassNotFoundException | SQLException exception) {
            Logger.getLogger(VehicleDAO.class.getName()).log(Level.SEVERE, null, exception);
        }
    }

    public List<Vehicle> read() {
        String sql = "SELECT * FROM VEHICLES ORDER BY id";
        
        List<Vehicle> listVehicles = new ArrayList<>();
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Vehicle vehicle = new Vehicle();
                vehicle.setId(rs.getInt("id"));
                vehicle.setModel(rs.getString("model"));
                vehicle.setBrand(rs.getString("brand"));
                vehicle.setPrice(rs.getDouble("price"));
                listVehicles.add(vehicle);
            }
        } catch (SQLException exception) {
            Logger.getLogger(VehicleDAO.class.getName()).log(Level.SEVERE, null, exception);
        }
        return listVehicles;
    }

    public boolean insert(Vehicle vehicle) {
        String sql = "INSERT INTO VEHICLES (model, brand, price) VALUES (?, ?, ?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, vehicle.getModel());
            stmt.setString(2, vehicle.getBrand());
            stmt.setDouble(3, vehicle.getPrice());
            stmt.execute();
            return true;
        } catch (SQLException exception) {
            Logger.getLogger(VehicleDAO.class.getName()).log(Level.SEVERE, null, exception);
            return false;
        }
    }

    public boolean update(Vehicle vehicle) {
        String sql = "UPDATE VEHICLES SET model=?, brand=?, price=? WHERE ID=?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, vehicle.getModel());
            stmt.setString(2, vehicle.getBrand());
            stmt.setDouble(3, vehicle.getPrice());
            stmt.setInt(4, vehicle.getId());
            stmt.execute();
            return true;
        } catch (SQLException exception) {
            Logger.getLogger(VehicleDAO.class.getName()).log(Level.SEVERE, null, exception);
            return false;
        }
    }

    public boolean delete(Integer id) {
        String sql = "DELETE FROM VEHICLES WHERE ID=?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setInt(1, id);
            stmt.execute();
            return true;      
        } catch (SQLException exception) {
            Logger.getLogger(VehicleDAO.class.getName()).log(Level.SEVERE, null, exception);
            return false;
        }
    }
}
