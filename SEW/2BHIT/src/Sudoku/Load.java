package Sudoku;

public class Load {

	public static String[][][] sudoku(int level){
		String[][][] felder = new String[3][9][9];
		felder[0] = Load.angabe(level);
		felder[1] = Load.angabe(level);
		felder[2] = Load.loesung(level);
		return felder;
	}
	
	public static String[][] angabe(int level){
		String[][] felder = new String[9][9];
		String levelAngaben[] = new String[20];
		//levelAngaben[0] = " 54937862938642517267158934319725648456381279782649513486571293725893164391426875";
		levelAngaben[0] = " 5   78  9      172    8 3   9  56   5 381 7   26  5   8 5    372      4  14   7 ";
		int x = 0;
		for(int i = 0; i<9; i++){
			for(int j = 0; j<9; j++){
				felder[i][j] = "" + levelAngaben[level].charAt(x);
				x++;
			}
		}
		return felder;
	}
	
	public static String[][] loesung(int level){
		String[][] felder = new String[9][9];
		String levelLoesung[] = new String[20];
		levelLoesung[0] = "154937862938642517267158934319725648456381279782649513486571293725893164391426875";
		int x = 0;
		for(int i = 0; i<9; i++){
			for(int j = 0; j<9; j++){
				felder[i][j] = "" + levelLoesung[level].charAt(x);
				x++;
			}
		}
		return felder;
	}
	
}
