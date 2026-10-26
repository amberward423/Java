import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many integers? ");
        int size = scanner.nextInt();

        int[] num = new int[size];

        System.out.println("Enter the integers:");

        for (int i = 0; i < size; i++) {
            num[i] = scanner.nextInt();
        }
        int maxSum = num[0];
        int start = 0;
        int end = 0;
        for (int i = 0; i < size; i++){
            int current_sum = 0;
            for( int j = i; j < size; j++){
                current_sum += num[j];
                if (current_sum > maxSum ){
                    maxSum = current_sum;
                    start = i;
                    end = j;

                }
            }

        }
        System.out.println("Max sum: "+ maxSum);
        System.out.println("Start: "+ (start + 1));
        System.out.println("End: "+ (end + 1));



    }
}
