public class ElectricMotorcycle extends AbstractVehicle{
    @Override
    public void start() {
        System.out.println("Electric Motorcycle is starting");

    }

    @Override
    public void stop() {
        System.out.println("Electric Motorcycle is stopping");

    }

    @Override
    public String getInfo() {
        return "This is an Electric Motorcycle. It is an " + getBrand();
    }
    @Override
    public void charge() {
        System.out.println("Electric Motorcycle is charging.");
    }
    public ElectricMotorcycle(String brand){
        super(brand);
    }
}
