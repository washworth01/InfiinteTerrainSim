package infiniteTerrainSimulator;

import java.util.Random;

public class Item extends Tile
{
	String itemName;
	
	public Item(int item, String itemName) 
	{
		super(item);
		this.itemName = itemName;
	}
	
	public int getItemIdentifier()
	{
		return item;
	}
}
