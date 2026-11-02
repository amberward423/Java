public class SportsCar extends Task2 {
    public SportsCar(String typename){
        super(typename);

    }


    public void accelerate(double amount){
        super.accelerate(amount *2);

    }

    public void decelerate(double amount){
        super.decelerate(amount * 2);

    }

    public void gasConsumption(double amount){
        super.gasConsumption(amount*2);
    }

}
