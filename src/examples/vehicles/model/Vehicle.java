package examples.vehicles.model;

public class Vehicle {
    private Integer id;
    private String model;
    private String brand;
    private Double price;

    public Vehicle() {
    }

    public Vehicle(String model, String brand, Double price) {
        this.model = model;
        this.brand = brand;
        this.price = price;
    }

    public Vehicle(Integer id, String model, String brand, Double price) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "id=" + id + ", model=" + model + ", brand=" + brand + ", price=" + price;
    }
}
