public class Task3 {

        boolean coffeeOn = false;
        int channel = 0;
        void pressOnOff(){
            coffeeOn = !coffeeOn;
        }
        boolean isOn(){
            return coffeeOn;
        }
        void setChannel(int newChannel){
            channel = newChannel;
        }
        int getChannel(){
            return channel;
        }


}
