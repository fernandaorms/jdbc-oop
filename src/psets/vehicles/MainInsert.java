package psets.vehicles;

import java.sql.SQLException;
import psets.vehicles.model.dao.VehicleDAO;
import psets.vehicles.model.domain.Vehicle;

public class MainInsert {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        VehicleDAO vehicleDAO = new VehicleDAO();

        Vehicle vehicle = new Vehicle("Pulse", "Fiat", 92000.00);

        vehicleDAO.insert(vehicle);
    }
}
