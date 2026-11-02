public abstract class AbstractVehicle implements Vehicle,ElectricVehicle {
    private String brand;

    public AbstractVehicle(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }

    @Override
   public void charge(){
        System.out.println("This vehicle cannot be charged.");
    }
}
