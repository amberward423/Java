public class VehicleDemo {
    public static void main(String[] args) {
        Car myCar;
        myCar = new Car("Toyota");

        Bus myBus;
        myBus = new Bus("Honda");

        Motorcycle myMotorcycle;
        myMotorcycle = new Motorcycle("Ford");

        myCar.start();
        myBus.start();
        myMotorcycle.start();

        System.out.println(myCar.getInfo());
        System.out.println(myBus.getInfo());
        System.out.println(myMotorcycle.getInfo());

    }
}
