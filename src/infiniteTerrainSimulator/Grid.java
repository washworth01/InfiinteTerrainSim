package infiniteTerrainSimulator;

import java.util.Random;

public class Grid extends Game
{
	//Attributes
	protected Tile[][] gameBoard;
	protected int size = 6;
	protected int numberOfItems = 5;
		
	
	//Constructors
	
	public Grid()
	{
		
	}
	
	//Methods
	
	public void createGrid(int size)
	{
		this.gameBoard = new Tile[size][size];
		distributeItems(numberOfItems);
		return;
		
	}
	
	public void distributeItems(int numberOfItems)
	{
		Random rand = new Random(this.numberOfItems);
		int counter = size;
		while (counter != 0)
		{
			int xSpace = rand.nextInt(this.size);
			int ySpace = rand.nextInt(this.size);
			
			if (gameBoard [xSpace][ySpace] instanceof Item)
			{
				counter--;
			}
		}
	}
}
