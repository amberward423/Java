import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Enter coefficient a:  ");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter coefficient b:  ");
        double b = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter coefficient c:  ");
        double c = Double.parseDouble(scanner.nextLine());


        double d = (b*b)-4*a*c;

        if(d < 0) {
            System.out.println("There are no real roots. ");

        } else if (d==0) {
            double x = ((-b + Math.sqrt(d))/2*a);
            System.out.println("There is one real root, it is  " + x);
        }
        else {
            double x1 = ((-b + Math.sqrt(d))/2*a);
            System.out.println("There are two real roots, the first one is " + x1);
            double x2 = ((-b - Math.sqrt(d))/2*a);
            System.out.println("There are two real roots, the second one is " + x2);
        }
    }
}