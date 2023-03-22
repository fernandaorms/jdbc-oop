package psets.vehicles;

import psets.vehicles.model.dao.VehicleDAO;
import psets.vehicles.model.domain.Vehicle;

public class MainUpdate {
    public static void main(String[] args) {
       VehicleDAO vehicleDAO = new VehicleDAO();

       Vehicle vehicle = new Vehicle(5, "Duster", "Renault", 86000.00);

       vehicleDAO.update(vehicle);
    }
}
