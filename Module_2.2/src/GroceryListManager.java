import java.util.ArrayList;

public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();

    void addItem(String item){
        groceryList.add(item);
    }
    void removeItem(String item){
        groceryList.remove(item);
    }
    void displayList(){
        for(int i = 0; i < groceryList.size(); i++){
            System.out.println(groceryList.get(i));
        }
    }
    boolean checkItem(String item){
        return groceryList.contains(item);
    }

}
