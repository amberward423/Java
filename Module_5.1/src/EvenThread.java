public class EvenThread extends Thread {
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        evenThread.start();
    }

    @Override
    public void run() {
        for(int i = 0; i <= 10; i += 2){
            System.out.println("Even number:" + i);
        }

    }
}
