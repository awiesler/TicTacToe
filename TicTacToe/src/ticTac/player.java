package ticTac;

public class player {
	public int GameCounter;
	private String x = "X";
	private String o = "O";
	private String e = "";
	
	game backend = new game();
	
	public String turn() {
		GameCounter++;
		
		if(GameCounter % 2 == 0) {
				return o;
		}
		else {
				return x;
		}
	}

	public int getGameCounter() {
		return GameCounter;
	}

	public void setGameCounter(int gameCounter) {
		GameCounter = gameCounter;
	}
}