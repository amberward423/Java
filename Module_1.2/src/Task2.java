import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a length of triangle side 1:  ");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter a length of triangle side 2:  ");
        int second = Integer.parseInt(scanner.nextLine());


        double third = Math.sqrt((first*first)+(second*second));


        System.out.println("The length of the hypotenuse is " + third);



    }
}