import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a temperature in Fahrenheit and we will convert it to Celsius:  ");
        int temp = Integer.parseInt(scanner.nextLine());
        float celsius = ((temp-32) * 5/9f);
        System.out.println("The converted temperature is " + celsius);

     }
    }
