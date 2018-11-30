package infiniteTerrainSimulator;

public class Tile extends Grid
{
	//Attributes
	private boolean isEmpty;
	int item;
	
	//Constructors
	
	public Tile()
	{
		
	}
	
	public Tile(int item)
	{
		this.item = item;
	}	
	
	//Methods
	
	public int checkTile()
	{
		if(this.isEmpty == true)
		{
			return 0;
		}
		else
		{
			return item;
		}
	}
	
	public 
	
	public boolean getIsEmpty() 
	{
		return isEmpty;
	}

	public void setIsEmpty(boolean isEmpty)
	{
		this.isEmpty = isEmpty;
	}
}
