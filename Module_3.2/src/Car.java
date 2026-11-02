public class Car extends AbstractVehicle{
    @Override
    public void start() {
        System.out.println("Car is starting");

    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }

    @Override
    public String getInfo() {
        return "This is a car. It is a " + getBrand();
    }
    public Car(String brand){
        super(brand);
    }
}
