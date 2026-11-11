public class SumThread extends Thread {
    private int[] numbers;
    private int startIndex;
    private int endIndex;
    private int sum;


    public SumThread(int[]numbers, int startIndex, int endIndex){
        this.numbers = numbers;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public void run(){
        sum = 0;
        for(int i = startIndex; i < endIndex; i++){
            sum += numbers[i];
        }
    }
    public int getSum(){
        return sum;
    }

}
