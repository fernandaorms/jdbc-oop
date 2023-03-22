package psets.vehicles;

import java.util.List;


import psets.vehicles.model.dao.VehicleDAO;
import psets.vehicles.model.domain.Vehicle;

public class MainSelect {
    
    public static void main(String[] args) {
        VehicleDAO vehicleDAO = new VehicleDAO();

        List<Vehicle> listVehicles = vehicleDAO.read();

        for (Vehicle vehicle : listVehicles)
            System.out.println(vehicle);
    }
}
