package ca.concordia.soen6461.composite.pattern;

import java.util.ArrayList;
import java.util.List;


public class ItemCollections implements Items{

	String itemName;
	List<Items> composites = new ArrayList<Items>();
	
	public ItemCollections(String name) {
		super();
		this.itemName = name;
	}
	
	public void AddItem(Items com) {
		composites.add(com);
	}
	
	@Override
	public int showItem() {
		int total = 0;
		System.out.println("Composite Name: "+ itemName);
		for (Items satchelsItem : composites) {
			// all are components, this is recursion
			total = total + satchelsItem.showItem();
		}
		return total;
	}

}
