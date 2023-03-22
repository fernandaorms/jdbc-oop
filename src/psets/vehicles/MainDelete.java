package psets.vehicles;

import psets.vehicles.model.dao.VehicleDAO;

public class MainDelete {
    public static void main(String[] args)  {
        VehicleDAO vehicleDAO = new VehicleDAO();

        vehicleDAO.delete(5);
    }
}
