import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a weight in grams:  ");
        int grams = Integer.parseInt(scanner.nextLine());

        int talents = (grams / 9071);

        int pounds = (grams /453);

        double lot = (grams / 13.28);

        System.out.println( grams + " grams is " + talents + " talents, "+ pounds+ " pounds, "+ lot + " lots.");

    }
}