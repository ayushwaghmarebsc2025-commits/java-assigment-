package inventory;

public class Main {

	public static void main(String[] args) 
	{
		InventoryItem item1 = new InventoryItem("Pen", 10);
		InventoryItem item2 = new InventoryItem("Notebook", 20);

		System.out.println("Total items: " + InventoryItem.getTotalItems());

		item1.addToInventory(5);

		System.out.println("After adding 5 pens:");
		System.out.println("Total items: " + InventoryItem.getTotalItems());

		item2.removeFromInventory(10);

		System.out.println("After removing 10 notebooks:");
		System.out.println("Total items: " + InventoryItem.getTotalItems());
		
		

	}

}
