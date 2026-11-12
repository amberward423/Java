public class Customer extends Thread{
   private Theater theater;
   private int seats;

        public Customer(Theater theater, int seats){
            this.theater = theater;
            this.seats = seats;
        }

    @Override
    public void run(){
       theater.reservation(seats);
    }


}
