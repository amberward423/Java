
public class Task2 {

    private double speed;
    private double gasolineLevel;
    private String typeName;
    private double tmaxcapacity;


    public Task2(String typeName) {
        speed = 0; gasolineLevel = 0;
        this.typeName = typeName;

    }

    public Task2(double tmaxcapacity,double speed){
        this.tmaxcapacity = tmaxcapacity;
        this.speed = speed;
        gasolineLevel = 0;
    }



    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 10;
        else
            speed = 0;
    }
    void decelerate(int amount) {
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
    double getGasolineLevel() {
        return gasolineLevel;
    }

}
