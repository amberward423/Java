public class Bus extends AbstractVehicle{
    @Override
    public void start() {
        System.out.println("Bus is starting");

    }

    @Override
    public void stop() {
        System.out.println("Bus is stopping");

    }

    @Override
    public String getInfo() {
        return "This is a bus. It is a " + getBrand();
    }
    public Bus(String brand){
        super(brand);
    }
}
