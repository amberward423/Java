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
        manager.addItem("Bread",1.99);
        manager.addItem("Milk",2.89);
        manager.addItem("Ground Beef",8.99);
        manager.calculateTotalCost();
        System.out.print("Cost of Items on your list: " + manager.calculateTotalCost() + " euros.");
        manager.addItem("Pulla",3.00,"baked goods");
        manager.addItem("Ground Beef",8.99,"Meat");
        manager.addItem("Bread",1.99, "baked goods");
        manager.addItem("Milk",2.89,"Dairy");
        manager.displayByCategory("baked goods");
        manager.addItem("Apples",2.00,"Fruit", 6);
        manager.addItem("Oranges",2.00,"Fruit", 0);
        manager.updateQuantity("Oranges",4);
        manager.displayAvailableItems();








    }

}

