package infiniteTerrainSimulator;

public class Player extends Tile
{
	int playerXPosition;
	int playerYPosition;
	
	
	Player(int playerXPosition, int playerYPosition)
	{
		this.playerXPosition = playerXPosition;
		this.playerYPosition = playerYPosition;
	}
	
	public void playerMovement(String direction)
	{
		if (direction.toString().equals("West"))
		{
			this.playerXPosition--;
		}
		else if(direction.toString().equals("East"))
		{
			this.playerXPosition++;
		}
		else if(direction.toString().equals("South"))
		{
			this.playerYPosition--;
		}
		else if(direction.toString().equals("North"))
		{
			this.playerYPosition++;
		}
			
	}
}
