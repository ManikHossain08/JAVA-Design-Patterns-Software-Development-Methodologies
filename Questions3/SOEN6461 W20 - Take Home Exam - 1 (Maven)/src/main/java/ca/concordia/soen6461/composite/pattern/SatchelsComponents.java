package ca.concordia.soen6461.composite.pattern;

import java.util.ArrayList;
import java.util.List;


public class SatchelsComponents implements SatchelsItem{

	String itemName;
	List<SatchelsItem> composites = new ArrayList<SatchelsItem>();
	
	public SatchelsComponents(String name) {
		super();
		this.itemName = name;
	}
	
	public void AddComponent(SatchelsItem com) {
		composites.add(com);
	}
	
	@Override
	public int countTotalItem() {
		int total = 0;
		System.out.println("Composite Name: "+ itemName);
		for (SatchelsItem satchelsItem : composites) {
			// all are components, this is recursion
			total = total + satchelsItem.countTotalItem();
		}
		return total;
	}

}
