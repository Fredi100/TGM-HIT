package Sudoku_Extended.model;

/**
 * Sudoku Klasse, enth�lt einen Konstruktor, eine schreiben Methode, eine gewonnen Methode und eine getLittleField Methode.
 * Vorhandene Variablen sind gamedata mit dem erstellten Level, die Konstante LEVEL, und die Konstante LOESUNG.
 * 
 * @author Niklas Hohenwarter
 * @author Alfred Emsenhuber
 * @version 2013-5-27
 */
public class Sudoku {
	
	private char[][][] gamedata = new char[2][9][9];
	public static final int LEVEL = 0;
	public static final int LOESUNG = 1;
	
	/**
	 * Erstellt ein Sudoku Objekt mit dem ausgew�hlten Level als Parameter und l�dt anhand dieser Auswahl das jeweilige Level aus Load.
	 * 
	 * @param level �bergibt die Nummer des ausgew�hlten Levels
	 */
	public Sudoku(int level){
		
		for(int i = 0; i < gamedata.length; i++){
			gamedata[i] = Load.loadData(level, i);
		}
		
	}
	
	/**
	 * Schreibt in die Variable gamedata an der Stelle x, and der Stelle y den jeweiligen Wert der �bergeben Wurde.
	 * 
	 * @param x Die �bergeben X Koordinate des zu beschreibenden Feldes
	 * @param y Die �bergeben Y Koordinate des zu beschreibenden Feldes
	 * @param wert Der jeweilige Wert des in das �bergebene Feld geschrieben werden soll
	 */
	public void schreiben(int x, int y, char wert){
			gamedata[LEVEL][x][y] = wert;
	}
	
	/**
	 * �berpr�ft ob der Spieler das komplette Sudoku gel�st hat und �bergibt dann win.
	 * Wenn der Spieler das komplette Sudoku gel�st hat, bleibt win auf true.
	 * Wenn der SPieler das Sudoku noch nicht gel�st hat, wird win auf false gesetzt.
	 * 
	 * @return win Ob der SPieler gewonnen hat oder nicht
	 */
	public boolean gewonnen(){
		boolean win = true;
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++){
				if(!(gamedata[LEVEL][i][j] == gamedata[LOESUNG][i][j])){
					win = false;
					break;
				}
			}
		}
		
		return win;
	}
	
	/**
	 * Holt sich je nach �bergebner Zahl das jeweilige 3x3 Feld aus dem Level heraus und gibt dieses zur�ck.
	 * 
	 * @param field Das jeweilige 3x3 Feld das zur�ckgegeben werden soll
	 * @return gamedata[LEVEL][field] Das ausgew�hlte Feld
	 */
	public char[] getLittleField(int field){
		return gamedata[LEVEL][field];
	}

}
