import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many integers? ");
        int size = scanner.nextInt();

        int[] num = new int[size];

        int[] unique = new int[size];
        int count = 0;

        System.out.println("Enter the integers:");

        for (int i = 0; i < size; i++) {
            num[i]= scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            boolean match = false;
            for (int j = 0; j < count; j++) {
                if (num[i] == unique[j]) {
                    match = true;
                }

            }
            if(match == false){
                unique[count]=num[i];
                count += 1;

            }
        }
        for(int i = 0; i < count; i++){
            System.out.println(unique[i]);
        }
    }
}