import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Enter a number: ");
        int num1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter a number: ");
        int num2 = Integer.parseInt(scanner.nextLine());

        for (int i = num1; i <= num2; i++) {
            boolean isPrime = true;
            if (i < 2) {
                isPrime = false;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println(i);
            }
        }
    }
};