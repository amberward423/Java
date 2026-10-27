public class CoffeeMakerDriver {
    public static void main(String[] args) {
        Task3 myCoffeeMaker;
        myCoffeeMaker = new Task3();
        myCoffeeMaker.pressOnOff();
        System.out.println("Coffee maker is on.");

        myCoffeeMaker.setCoffeeType("espresso");
        myCoffeeMaker.setcoffeeAmount(50);
        System.out.println( "Coffee amount is " + myCoffeeMaker.getcoffeeAmount() + " ml.");

        System.out.println( "Coffee type is " + myCoffeeMaker.getCoffeeType() +".");

        myCoffeeMaker.pressOnOff();
        System.out.println("Coffee maker is off.");

    }
}
