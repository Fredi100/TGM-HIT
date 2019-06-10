package Minesweeper;

public class Model {
	private int[][] feld;
	public Model(){
		feld = new int[10][10];
		fillMine();
		fillOther();
	}
	public void fillMine(){
		for(int i = 0; i < 10; i++){
			int zeile =(int)(Math.random()*10);
			int spalte =(int)(Math.random()*10);
			if(feld[zeile][spalte] == 9){
				i--;
			}else{
				feld[zeile][spalte] = 9;
			}
		}
	}
	public void fillOther(){
		int zahl = 0;
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				if(feld[i][j] != 9){
					if(i == 0 && j == 0){ //obere linke Ecke
						if(feld[i][j+1] == 9){
							zahl++;
						}
						if(feld[i+1][j] == 9){
							zahl++;
						}
						if(feld[i+1][j+1] == 9){
							zahl++;
						}
					}// obere linke Ecke ende
					if(i == 0 && j == 9){ //obere rechte Ecke
						if(feld[i][j-1] == 9){
							zahl++;
						}
						if(feld[i+1][j] == 9){
							zahl++;
						}
						if(feld[i+1][j-1] == 9){
							zahl++;
						}
					}// obere rechte Ecke ende
					if(i == 9 && j == 0){ //untere linke Ecke
						if(feld[i][j+1] == 9){
							zahl++;
						}
						if(feld[i-1][j] == 9){
							zahl++;
						}
						if(feld[i-1][j+1] == 9){
							zahl++;
						}
					}// untere linke Ecke ende
					if(i == 9 && j == 9){ //untere rechte Ecke
						if(feld[i][j-1] == 9){
							zahl++;
						}
						if(feld[i-1][j] == 9){
							zahl++;
						}
						if(feld[i-1][j-1] == 9){
							zahl++;
						}
					}// untere rechte Ecke ende
					if(i == 0 && j <= 8 && j > 0){ //oben
						if(feld[i][j-1] == 9){
							zahl++;
						}
						if(feld[i][j+1] == 9){
							zahl++;
						}
						if(feld[i+1][j-1] == 9){
							zahl++;
						}
						if(feld[i+1][j] == 9){
							zahl++;
						}
						if(feld[i+1][j+1] == 9){
							zahl++;
						}
					}// oben ende
					if(i == 9 && j <= 8 && j > 0){ //unten
						if(feld[i][j-1] == 9){
							zahl++;
						}
						if(feld[i][j+1] == 9){
							zahl++;
						}
						if(feld[i-1][j-1] == 9){
							zahl++;
						}
						if(feld[i-1][j] == 9){
							zahl++;
						}
						if(feld[i-1][j+1] == 9){
							zahl++;
						}
					}// unten ende
					if(j == 0 && i <= 8 && i > 0){ //links 
						if(feld[i-1][j] == 9){
							zahl++;
						}
						if(feld[i+1][j] == 9){
							zahl++;
						}
						if(feld[i-1][j+1] == 9){
							zahl++;
						}
						if(feld[i][j+1] == 9){
							zahl++;
						}
						if(feld[i+1][j+1] == 9){
							zahl++;
						}
					}// links ende
					if(j == 9 && i <= 8 && i > 0){ //rechts 
						if(feld[i-1][j] == 9){
							zahl++;
						}
						if(feld[i+1][j] == 9){
							zahl++;
						}
						if(feld[i-1][j-1] == 9){
							zahl++;
						}
						if(feld[i][j-1] == 9){
							zahl++;
						}
						if(feld[i+1][j-1] == 9){
							zahl++;
						}
					}// rechts ende
					if(i <= 8 && i > 0 && j <= 8 && j > 0){ //mitte 
						if(feld[i+1][j] == 9){
							zahl++;
						}
						if(feld[i+1][j-1] == 9){
							zahl++;
						}
						if(feld[i+1][j+1] == 9){
							zahl++;
						}
						if(feld[i-1][j-1] == 9){
							zahl++;
						}
						if(feld[i-1][j+1] == 9){
							zahl++;
						}
						if(feld[i-1][j] == 9){
							zahl++;
						}
						if(feld[i][j-1] == 9){
							zahl++;
						}
						if(feld[i][j+1] == 9){
							zahl++;
						}
					}// mitte ende
					feld[i][j] = zahl;
					zahl = 0;
				}
			}
		}
	}
	public int getFeld(int i,int j){
		return feld[i][j];	
	}
}
