package Matchsticks;

public class Model {
	int streichhoelzer;
	
	public Model(){
		streichhoelzer = 13;
	}
	
	public String computer(){
		String text = "";
		int anzahl = (int)(Math.random()*3)+1;
		if(anzahl > streichhoelzer){
			anzahl = streichhoelzer;
			streichhoelzer = 0;
		}else{
			streichhoelzer = streichhoelzer - anzahl;
		}
		if(anzahl == 1){
			text = "Der Computer entnimmt 1 Streichholz. ( " + streichhoelzer + " �brig)";
		}else{
			text = "Der Computer entnimmt " + anzahl + " Streichh�lzer. ( " + streichhoelzer + " �brig)";
		}
		return text;
	}
	
	public void newGame(int anzahl){
		if(anzahl >= 0){
			streichhoelzer = anzahl;
		}else{
			streichhoelzer = 13;
		}
	}
	
	public int checkWin(){
		int win = 0;
		if(streichhoelzer <= 0){
			win = 1;
		}
		return win;
	}
	
	public String nimm(int anzahl){
		String text = "Keine g�ltige Anzahl";
		if(anzahl > 0 && anzahl <= 3){
			if(anzahl > streichhoelzer){
				text = "Nicht gen�gend Streichhoelzer vorhanden";
			}else{
				streichhoelzer = streichhoelzer - anzahl;
				if(anzahl == 1){
					text = "1 Streichholz wurde entnommen. (" + streichhoelzer + " �brig)";
				}
				text = anzahl + " Streichhoelzer wurden entnommen. (" + streichhoelzer + " �brig)";
			}
		}
		return text;
	}
	
	public void setStreichhoelzer(int anzahl){
		if(anzahl > 0){
			this.streichhoelzer = anzahl;
		}
	}
	
	public int getStreichhoelzer(){
		int anzahl = streichhoelzer;
		if(streichhoelzer <= 0){
			anzahl = 0;
		}
		return anzahl;
	}
}
