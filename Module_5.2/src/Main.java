
public class Main {
    public static void main(String[] args) {
        Theater theater = new Theater();

        Customer customer = new Customer(theater, 56);
        Customer customer2 = new Customer(theater, 45);
        Customer customer3 = new Customer(theater, 5);

        ThreadSafeList threadSafeList = new ThreadSafeList();
        ListTest test1 = new ListTest(threadSafeList);
        ListTest test2 = new ListTest(threadSafeList);
        ListTest test3 = new ListTest(threadSafeList);

        test1.start();
        test2.start();
        test3.start();

        try {
            test1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            test2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            test3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(threadSafeList.size());

        customer.start();

        customer2.start();

        customer3.start();

        try {
            customer.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            customer2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            customer3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(theater.getSeats());
    }

}
