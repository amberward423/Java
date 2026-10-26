import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int score = 0;

        while (score != 10) {
             score = 0;
            for (int i = 0; i < 10; i++) {
                int rand_num1 = (int) (Math.random() * 10) + 1;
                int rand_num2 = (int) (Math.random() * 10) + 1;
                int product = rand_num1 * rand_num2;
                System.out.printf("Solve the following: %d  * %d = ", rand_num1,rand_num2);
                int ans = Integer.parseInt(scanner.nextLine());
                if (ans == product) {
                    score += 1;
                    System.out.println("Correct.");
                } else {
                    System.out.println("Incorrect. Try again.");
                }
            }
            if (score != 10) {
                System.out.println("You did not pass, please try again.");
            }
        }

        System.out.println("You Passed! Great Job!");;
    }
}