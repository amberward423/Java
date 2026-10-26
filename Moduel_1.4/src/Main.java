import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);

        String[] f_name = { "Amber", "Erin", "Grant", "Victoria", "Joshua","Jade"};
        String[] l_name = { "Ward", "Wicker", "Avalos", "Odom", "Parker","Smith"};

        System.out.print("How many names? ");
        int name_num = scanner.nextInt();
        for (int i = 0; i < name_num; i++){
            int rand_fname = (int) (Math.random() * 6);
            int rand_lname = (int) (Math.random() * 6);
            System.out.println(f_name[rand_fname]+" "+l_name[rand_lname]);
        }
    }
}