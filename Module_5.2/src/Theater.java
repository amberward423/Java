public class Theater {
    private int seats = 100;

    public synchronized void reservation(int amount) {
        if(amount <= seats){
            seats -= amount;
            System.out.println("Reservation successful.");
        }
        else{
            System.out.println("Reservation failed.");
        }

    }
    public int getSeats(){
        return seats;
    }
}
