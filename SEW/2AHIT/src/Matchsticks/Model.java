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
			text = "Der Computer entnimmt 1 Streichholz. ( " + streichhoelzer + " Übrig)";
		}else{
			text = "Der Computer entnimmt " + anzahl + " Streichhölzer. ( " + streichhoelzer + " Übrig)";
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
		String text = "Keine gültige Anzahl";
		if(anzahl > 0 && anzahl <= 3){
			if(anzahl > streichhoelzer){
				text = "Nicht genügend Streichhoelzer vorhanden";
			}else{
				streichhoelzer = streichhoelzer - anzahl;
				if(anzahl == 1){
					text = "1 Streichholz wurde entnommen. (" + streichhoelzer + " Übrig)";
				}
				text = anzahl + " Streichhoelzer wurden entnommen. (" + streichhoelzer + " Übrig)";
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
