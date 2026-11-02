public abstract class AbstractVehicle implements Vehicle,ElectricVehicle {
    private String brand;
    private double fuelEfficiency;

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

    @Override
    public double calculateFuelEfficiency(){
        return fuelEfficiency;
    }

    public void setFuelEfficiency(double amount){
        this.fuelEfficiency = amount;

    }

}
