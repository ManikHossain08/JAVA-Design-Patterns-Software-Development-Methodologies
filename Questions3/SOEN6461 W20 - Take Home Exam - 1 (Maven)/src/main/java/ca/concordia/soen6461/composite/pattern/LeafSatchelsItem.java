package ca.concordia.soen6461.composite.pattern;

public class LeafSatchelsItem implements SatchelsItem{

	public int number;
	public String itemName;

	public LeafSatchelsItem(int itemNumber, String itemName) {
		super();
		this.number = itemNumber;
		this.itemName = itemName;
	}
	
	@Override
	public int countTotalItem() {
		System.out.println("Leaf Item in Satchels: " + itemName + "  , Item Count: " + number);
		return number;
	}

}
