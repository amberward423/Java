import java.util.Random;
public class ParallelNumberSummation {
    public static void main(String[] args) {
        Random random = new Random();
        int[] randomIntegers = new int[100000];
        int numOfProcessors = Runtime.getRuntime().availableProcessors();
        for (int i = 0; i < 100000; i++) {
          randomIntegers[i] = random.nextInt(101);
        }
        System.out.println("Number of processors: " + numOfProcessors);
        int numPerThread = 100000/ numOfProcessors;
        System.out.println("Numbers per thread: " + numPerThread);


    }
}
