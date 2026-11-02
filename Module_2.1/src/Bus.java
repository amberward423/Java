public class Bus extends Task2 {
    public Bus(String typename) {
        super(typename);
    }

    private int passenger;

    void pass_Entry(int amount) {
        if (amount > 0) {
            passenger += amount;
        }
    }
    int getPassenger() {return passenger;}

    void pass_Exit (int amount){
        if (passenger >= amount) {
            if (amount > 0) {
                passenger -= amount;
            }
        }
    }
}
