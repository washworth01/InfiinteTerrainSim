package infiniteTerrainSimulator;

import infiniteTerrainSimulator.Game;
public class Main {

	public static void main(String[] args)
	{
		Game.listOfItems.add(new Item(0, "Book"));
		Game.listOfItems.add(new Item(1, "Boulder"));
		Game.listOfItems.add(new Item(2, "Chest"));
		Game.listOfItems.add(new Item(3, "Tree"));
		Game.listOfItems.add(new Item(4, "Body"));
	}
}
