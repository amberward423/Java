import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many integers? ");
        int size = scanner.nextInt();

        int[] num = new int[size];

        System.out.println("Enter the integers:");

        for (int i = 0; i < size; i++) {
            num[i] = scanner.nextInt();
        }
    }
};