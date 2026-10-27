public class Television {

        boolean tvOn = false;
        int channel = 0;
        void pressOnOff(){
            tvOn = !tvOn;
        }
        boolean isOn(){
            return tvOn;
        }
        void setChannel(int newChannel){
            channel = newChannel;
        }
        int getChannel(){
            return channel;
        }
}
