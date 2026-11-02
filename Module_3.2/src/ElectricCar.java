public class ElectricCar extends AbstractVehicle {
    @Override
    public void start() {
        System.out.println("Electric Car is starting");

    }

    @Override
    public void stop() {
        System.out.println("Electric Car is stopping");

    }

    @Override
    public String getInfo() {
        return "This is an Electric Car. It is a " + getBrand();
    }
    @Override
    public void charge() {
        System.out.println("Electric Car is charging.");
    }

    public ElectricCar(String brand){
        super(brand);
    }
}
