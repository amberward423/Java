import java.util.ArrayList;
import java.util.Map;

public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();
    private HashMap<String, Double> prices = new HashMap<>();

    void addItem(String item){
        groceryList.add(item);
    }

    void addItem(String item ,double cost){
        groceryList.addItem(item,cost);
    }
    void addItem(String item ,double cost,String category){
        groceryList.addItem(item,cost,category);
    }

    void removeItem(String item){
        groceryList.remove(item);
    }
    void displayList(){
        for(int i = 0; i < groceryList.size(); i++){
            System.out.println(groceryList.get(i));
        }
    }
    void displayByCategory(String category){
        for(int i = 0; i < groceryList.size(); i++){
            System.out.println(groceryList.get(i));
        }
    }
    boolean checkItem(String item){
        return groceryList.contains(item);
    }
    calculateTotalCost(){

    }

}
