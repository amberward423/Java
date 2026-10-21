import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Enter a binary number:  ");
        String bi = (scanner.nextLine());
        int dec = 0;

    for (int i = 0; i < bi.length();i++){
       if (bi.charAt(i) != '0' && bi.charAt(i) != '1'){
           System.out.println("Invalid input");
           return;
       }
       else {
            if(bi.charAt(i) == '1'){
                dec +=(int)(Math.pow(2,bi.length()-1-i));
            }
       }
    }
        System.out.println("Your converted number is " + dec);

    }
}
