public class Calculator {
    private int number = 0;

    public void add(int value) {
    ///Experiment 1 — Let ChatGPT write the method body
        if (value < 0) {
            throw new IllegalArgumentException("Negative integers are not allowed.");
        }
        number += value;
    }

    public int reset() {
   ///Experiment 2 — Let ChatGPT finish the method with the provided info.
        number = 0;
        return number;
    }

    public int getCurrentValue() {
  ///Experiment 3 — Let ChatGPT write the whole method body based off a comment I entered.
        return number;
    }
}