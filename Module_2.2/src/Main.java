public class Main {
    public static void main(String[] args){
        GroceryListManager manager = new GroceryListManager();
        manager.addItem("Oat Milk");
        manager.addItem("Bread");
        manager.addItem("Ground Beef");
        manager.displayList();
        System.out.println("Do you have Ground Beef in the list : " + manager.checkItem("Ground Beef"));
        manager.removeItem("Bread");
        manager.displayList();
        System.out.println("Do you have Bread in the list : " + manager.checkItem(" Bread"));
    }

}

