
public class Task2 {

    private double speed;
    private double gasolineLevel;
    private String typeName;
    private double tmaxcapacity;
    private double targetSpeed;
    boolean cruiseControl = false;


    public Task2(String typeName) {
        speed = 0;
        gasolineLevel = 0;
        this.typeName = typeName;

    }

    public Task2(double tmaxcapacity, double speed) {
        this.tmaxcapacity = tmaxcapacity;
        this.speed = speed;
        gasolineLevel = 0;
    }


    public void accelerate(double amount) {
        if (amount > 0)
            speed = Math.max(0, speed + amount);
        else
            speed = 0;
    }

    void decelerate(double amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }

    double getSpeed() {
        return speed;
    }

    String getTypeName() {
        return typeName;
    }

    void fillTank() {
        gasolineLevel = 100;
    }
  void emptytank(){
        gasolineLevel = 0;
  }
    double getGasolineLevel() {
        return gasolineLevel;
    }

    void turnOnOff() {
        cruiseControl = !cruiseControl;
    }

    boolean isOn() {
        return cruiseControl;
    }

    void settargetSpeed(int newSpeed) {
        if (newSpeed >= 10 && newSpeed <= 80) {
            targetSpeed = newSpeed;
        }
    }

    double gettargetSpeed() {
        return targetSpeed;
    }


    void speedAdjust() {
        if (cruiseControl == true) {
            if (gasolineLevel == 0) {
                cruiseControl = false;
                System.out.println("You need to refuel before you can continue.");
                return;
            }
            while (speed != targetSpeed) {
                    if (speed < targetSpeed) {
                    double x = targetSpeed - speed;
                    accelerate(x);
                    } else {
                        if (speed > targetSpeed) {
                            double x = speed - targetSpeed;
                            decelerate(x);
                        }
                    }
                }
            }
        }
    }



