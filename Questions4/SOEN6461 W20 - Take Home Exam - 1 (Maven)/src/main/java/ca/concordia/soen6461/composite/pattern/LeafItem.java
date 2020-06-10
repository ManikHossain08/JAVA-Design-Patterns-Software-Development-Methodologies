package ca.concordia.soen6461.composite.pattern;

public class LeafItem implements Items{

	public int number;
	public String itemName;

	public LeafItem(int itemNumber, String itemName) {
		super();
		this.number = itemNumber;
		this.itemName = itemName;
	}
	
	@Override
	public int showItem() {
		System.out.println("Leaf Item Name: " + itemName + ", This Item Count: " + number);
		return number;
	}

}
