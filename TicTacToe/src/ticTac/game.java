package ticTac;

public class game {
	public int GameCounter;
	

	public boolean gameStatus(String tf1, String tf2, String tf3, String tf4, String tf5, String tf6, String tf7, String tf8, String tf9)
	{
		Boolean gameFinished = false;
		String pruefen1 = tf1 + tf2 + tf3;
		String pruefen2 = tf4 + tf5 + tf6;
		String pruefen3 = tf7 + tf8 + tf9;
		String pruefen4 = tf1 + tf4 + tf7;
		String pruefen5 = tf2 + tf5 + tf8;
		String pruefen6 = tf3 + tf6 + tf9;
		String pruefen7 = tf1 + tf5 + tf9;
		String pruefen8 = tf3 + tf5 + tf7;

		for(int i = 0; i<9; i++)
		{
			String pruefenfunktion = "pruefen" + i;
			pruefenSwitch(pruefenfunktion);
		}
		//String playerWinMessage = "Player .. wins!";
		
		return gameFinished;
	}
	
	public boolean pruefenSwitch(String varPruefen)
	{

		Boolean gameFinished = false;
		
		switch(varPruefen)
		{
		case ("XXX"):
				gameFinished = true;			
				break;
		case ("OOO"):
				gameFinished = true;
		System.out.println("CHECK");
				break;
		}
		return gameFinished;
		
	}


}
