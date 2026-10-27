public class Task3 {

        boolean coffeeOn = false;
        int coffeeAmount = 10;
        private String coffeeType = "normal";



    void pressOnOff(){
            coffeeOn = !coffeeOn;
        }
        boolean isOn(){
            return coffeeOn;
        }
        void setcoffeeAmount(int newcoffeeAmount){
            if (isOn() == true && newcoffeeAmount >= 10 && newcoffeeAmount <= 80){
                coffeeAmount = newcoffeeAmount;
            }
        }
        int getcoffeeAmount(){
            return coffeeAmount;
        }
        void setCoffeeType(String newCoffeeType){
            if (isOn() == true && (newCoffeeType.equals("normal") || newCoffeeType.equals("espresso"))){
               coffeeType = newCoffeeType;
            }
        }
        String getCoffeeType(){
          return coffeeType;
        }

}
