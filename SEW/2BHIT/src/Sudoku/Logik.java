package Sudoku;

public class Logik {
	
	private String[][][] felder = new String[3][9][9];
	
	public Logik(int level){
		felder = Load.sudoku(level);
	}

	public boolean gueltig(int i, int j){
		boolean state = false;
		if(felder[0][i][j].equals(" ")){
			state = true;
		}
		return state;
	}

	public String schreiben(int i, int j, int wert){
		if(wert == 9){
			felder[1][i][j] = " ";
		}else{
			felder[1][i][j] = "" + (wert + 1);
		}
		return felder[1][i][j];
	}

	public boolean gewonnen(){
		boolean win = true;
		for(int i = 0; i<9; i++){
			for(int j = 0; j<9; j++){
				if(!(felder[1][i][j].equals(felder[2][i][j]))){
					win = false;
				}
			}
		}
		return win;
	}
	public String getWert(int i, int j){
		return felder[1][i][j];
	}
}
