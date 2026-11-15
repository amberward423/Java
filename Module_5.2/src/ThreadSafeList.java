import java.util.ArrayList;

public class ThreadSafeList {
    private ArrayList<String> list = new ArrayList<>();

    public synchronized void add(String item){
         list.add(item);
    }
    public synchronized int size(){
        return list.size();
    }
    public synchronized void remove(String item){
         list.remove(item);
    }

}
