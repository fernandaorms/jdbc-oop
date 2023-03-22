package psets.vehicles.controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import psets.vehicles.model.dao.VehicleDAO;
import psets.vehicles.model.domain.Vehicle;

public class VBoxMainController implements Initializable  {

    @FXML
    private TableView<Vehicle> tableViewVehicles;

    @FXML
    private TableColumn<Vehicle, Integer> tableColumnVehicleId;

    @FXML
    private TableColumn<Vehicle, String> tableColumnmVehicleModel;

    @FXML
    private TableColumn<Vehicle, String> tableColumnVehicleBrand;

    @FXML
    private TableColumn<Vehicle, Double> tableColumnVehiclePrice;

    private VehicleDAO vehicleDAO = new VehicleDAO();

    private List<Vehicle> listVehicles = vehicleDAO.read();

    private ObservableList<Vehicle> obsservableListVehicles;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        loadTableViewVehicles();
    }
    
    public void loadTableViewVehicles() {
        tableColumnVehicleId.setCellValueFactory(new PropertyValueFactory<>("id"));
        tableColumnmVehicleModel.setCellValueFactory(new PropertyValueFactory<>("model"));
        tableColumnVehicleBrand.setCellValueFactory(new PropertyValueFactory<>("brand"));
        tableColumnVehiclePrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        
        /* Populate TableView */
        obsservableListVehicles = FXCollections.observableArrayList(listVehicles);
        tableViewVehicles.setItems(obsservableListVehicles);
    }
    
}
