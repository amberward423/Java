public class OddThread extends Thread {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        oddThread.start();
    }

    @Override
    public void run() {
        for(int i = 1; i <= 9; i += 2){
            System.out.println("Odd number:" + i);
        }

    }

}
