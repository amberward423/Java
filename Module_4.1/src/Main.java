
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.add(12);
        calculator.add(10);

        System.out.println(calculator.getCurrentValue());


        System.out.println(calculator.reset());


    }
}