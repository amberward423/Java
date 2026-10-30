import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();
    private HashMap<String, Double> prices = new HashMap<>();
    private HashMap<String, String> categories = new HashMap<>();

    void addItem(String item) {
        groceryList.add(item);
    }

    void addItem(String item, double cost, String category) {
        groceryList.add(item);
        prices.put(item, cost);
        categories.put(item,category);
    }
    void addItem(String item, double cost) {
        groceryList.add(item);
        prices.put(item, cost);
    }

    void removeItem(String item) {
        groceryList.remove(item);
    }

    void displayList() {
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println(groceryList.get(i));
        }
    }

    void displayByCategory(String category) {
        for (int i = 0; i < groceryList.size(); i++) {
            if (categories.get(groceryList.get(i)) != null && categories.get(groceryList.get(i)).equals(category)){
                System.out.println(groceryList.get(i));
            }
        }
    }

    boolean checkItem(String item) {
        return groceryList.contains(item);
    }

    double calculateTotalCost() {
        double total = 0.0;
        for (double price : prices.values()) {
            total += price;
        }
        return total;
    }

}
