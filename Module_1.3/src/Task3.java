import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Enter a number: ");
        int num1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter a number: ");
        int num2 = Integer.parseInt(scanner.nextLine());

        for (int i = num1; i <= num2; i++){
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0){
                System.out.println ("This is not a prime number.");
            }
            else{
                System.out.println ("This is a prime number.");
            }
        }

    }
};
