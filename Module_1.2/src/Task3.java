import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a weight in grams:  ");

        int grams = Integer.parseInt(scanner.nextLine());

        int talents = grams / 907;

        int pounds = grams /453;

        float lot = grams /13.28f;

        System.out.printf(" %d grams is %d talents, %d pounds, %4.2f lots.", grams,talents,pounds, lot);

    }
}