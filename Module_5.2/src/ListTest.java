public class ListTest extends Thread {

    private ThreadSafeList threadSafeList;

    public ListTest(ThreadSafeList threadSafeList) {
        this.threadSafeList = threadSafeList;
    }

    @Override
    public void run() {
        threadSafeList.add("Amber");
        System.out.println(threadSafeList.size());
        threadSafeList.remove("Amber");

    }

}
