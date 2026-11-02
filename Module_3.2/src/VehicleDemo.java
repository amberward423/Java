public class VehicleDemo {
    public static void main(String[] args) {
        Car myCar;
        myCar = new Car();

        Bus myBus;
        myBus = new Bus();

        Motorcycle myMotorcycle;
        myMotorcycle = new Motorcycle();

        myCar.start();
        myBus.start();
        myMotorcycle.start();

        System.out.println(myCar.getInfo());
        System.out.println(myBus.getInfo());
        System.out.println(myMotorcycle.getInfo());

    }
}
