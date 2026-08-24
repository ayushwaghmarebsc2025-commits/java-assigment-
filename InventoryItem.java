package inventory;

public class InventoryItem {

    static int totalItems = 0;

    String itemName;
    int quantity;

    
    public InventoryItem(String itemName, int quantity) 
    {
        this.itemName = itemName;
        this.quantity = quantity;
        totalItems = totalItems + quantity;
    }

    
    public static int getTotalItems() 
    {
        return totalItems;
    }

    
    public void addToInventory(int amount)
    {
        quantity = quantity + amount;
        totalItems = totalItems + amount;
    }

   
    public void removeFromInventory(int amount) 
    {
        quantity = quantity - amount;
        totalItems = totalItems - amount;
    }
}