import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.parseInt(scanner.nextLine());

        int sum = (first+second+third);
        float avg = ((first + second + third) /3.0f);
        int prd =(first*second*third);

        System.out.println("The sum of the numbers is " + sum);
        System.out.println("The average of the numbers is " + avg);
        System.out.println("The product of the numbers is " + (prd));


    }
}
/*
The sum and product(prd) were easy to determine and so was the average initially. However, I got caught up in the division. To fix this and get an
answer according to what was required I knew we needed a float because I remember that floats worked with decimals and
according to basic math 3+4 = 7 and 7+6=13 and 13 divided by 3 is not simply 4. This gives need for the float. after some testing I realized that just putting float infront is not enough
there has to be conversion which is why there is an f after the 4.0 to state that, the equation is working with a float and not int.
 */