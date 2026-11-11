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
        int numPerThread = 100000 / numOfProcessors;
        System.out.println("Numbers per thread: " + numPerThread);
        SumThread[] threads = new SumThread[numOfProcessors];

        for (int i = 0; i < numOfProcessors; i++) {
         int startIndex = numPerThread * i;
         int endIndex = numPerThread + startIndex;
         threads[i] = new SumThread(randomIntegers,startIndex,endIndex);
        }
        for (int i = 0; i < numOfProcessors; i++){
            threads[i].start();
        }
        for(int i = 0; i < numOfProcessors; i++){
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        int totalSum = 0;
        for(int i = 0; i < numOfProcessors; i++){
            totalSum += threads[i].getSum();
        }
        System.out.println("Total sum: "+ totalSum);
    }
}
