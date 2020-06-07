package ticTac;

public class game {
	
	private Boolean gameFinished;

	public boolean gameStatus(String tf1, String tf2, String tf3, String tf4, String tf5, String tf6, String tf7, String tf8, String tf9)
	{	
		

		if(tf1 == "X" && tf2 == "X" && tf3 == "X" || tf1 == "O" && tf2 == "O" && tf3 == "O") {
			gameFinished = true;
		}
		else if(tf4 == "X" && tf5 == "X" && tf6 == "X" || tf4 == "O" && tf5 == "O" && tf6 == "O") {
			gameFinished = true;
		}
		else if(tf7 == "X" && tf8 == "X" && tf9 == "X" || tf7 == "O" && tf8 == "O" && tf9 == "O") {
			gameFinished = true;
		}
		else if(tf1 == "X" && tf4 == "X" && tf7 == "X" || tf1 == "O" && tf4 == "O" && tf7 == "O") {
			gameFinished = true;
		}
		else if(tf2 == "X" && tf5 == "X" && tf8 == "X" || tf2 == "O" && tf5 == "O" && tf8 == "O") {
			gameFinished = true;
		}
		else if(tf3 == "X" && tf6 == "X" && tf9 == "X" || tf3 == "O" && tf6 == "O" && tf9 == "O") {
			gameFinished = true;
		}
		else if(tf1 == "X" && tf5 == "X" && tf9 == "X" || tf1 == "O" && tf5 == "O" && tf9 == "O") {
			gameFinished = true;
		}
		else if(tf3 == "X" && tf5 == "X" && tf7 == "X" || tf3 == "O" && tf5 == "O" && tf7 == "O") {
			gameFinished = true;
		}
		else {
			gameFinished = false;
		}
		
		return gameFinished;
	}
	
	public Boolean getGameFinished() {
		return gameFinished;
	}
}
