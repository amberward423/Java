import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
       long previous = 0;
       long current = 1;


        try {
            FileWriter writer = new FileWriter("fibonacci.csv");
            for (int i = 0; i < 60; i++){
                writer.write(String.valueOf(previous)+ "\n");
                long next = previous + current;

                previous = current;

                current = next;

            }
            writer.close();
        } catch (IOException e) {
            System.out.println("There is an error");
        }

    }


}