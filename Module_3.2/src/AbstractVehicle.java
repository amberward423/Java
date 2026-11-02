public abstract class AbstractVehicle implements Vehicle {
    private String brand;

    public AbstractVehicle(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }

}
