public class CarDriver {
    public static void main(String[] args) {
        Task2 myCar;

        myCar = new Task2("Toyota Corolla");
        myCar.fillTank();

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
    }
    }

/* To answer your question:
I would say that you should modify the driver file first to test and ensure things work properly first because it
could have saved a lot of time in the backend. I edited beforehand and spent a lot of time hopping between files when I could have just
done this in the beginning.
 */