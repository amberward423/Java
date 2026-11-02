public class CarDriver {
    public static void main(String[] args) {
        Task2 myCar;
        SportsCar mySportsCar;
        Bus myBus;

        myCar = new Task2("Toyota Corolla");
        myCar.fillTank();
        mySportsCar = new SportsCar("Porsche");
        myBus = new Bus("Magic Schoolbus");


        for (int i = 0; i < 6; i++) {
            myCar.accelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        while (myCar.getSpeed() > 0) {
            myCar.decelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        myCar.settargetSpeed(55);
        System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        myCar.turnOnOff();
        myCar.speedAdjust();
        System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");

        myCar.emptytank();
        System.out.println(myCar.isOn() + " Cruise control is on.");
        myCar.speedAdjust();
        System.out.println(myCar.isOn() + " Cruise control is off.");
        System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        myCar.isOn();

        mySportsCar.fillTank();
        mySportsCar.accelerate(10);
        System.out.println(mySportsCar.getTypeName() + ": speed is " + mySportsCar.getSpeed() + " km/h");
        mySportsCar.decelerate(10);
        System.out.println(mySportsCar.getTypeName() + ": speed is " + mySportsCar.getSpeed() + " km/h");
        mySportsCar.gasConsumption(30);
        mySportsCar.getGasolineLevel();
        System.out.println(mySportsCar.getTypeName() + " gasoline level :" + mySportsCar.getGasolineLevel());


        myBus.pass_Entry(5);
        System.out.println(myBus.getTypeName() + " amount of passengers " + myBus.getPassenger());
        myBus.pass_Exit(3);
        System.out.println(myBus.getTypeName() + " amount of passengers " + myBus.getPassenger());





    }
    }

/* To answer your question:
I would say that you should modify the driver file first to test and ensure things work properly first because it
could have saved a lot of time in the backend. I edited beforehand and spent a lot of time hopping between files when I could have just
done this in the beginning.
 */