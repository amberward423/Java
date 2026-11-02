public class Motorcycle extends AbstractVehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle is starting.");

    }

    @Override
    public void stop() {
        System.out.println("Motorcycle is stopping");

    }

    @Override
    public String getInfo() {
        return "This is a motorcycle. It is a " + getBrand();
    }
    public Motorcycle(String brand){
        super(brand);
    }
}
