//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Theater theater = new Theater();

        Customer customer = new Customer(theater, 56);
        Customer customer2 = new Customer(theater, 45);
        Customer customer3 = new Customer(theater, 5);

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
