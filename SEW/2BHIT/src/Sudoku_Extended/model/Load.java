package Sudoku_Extended.model;

/**
 * Enth�lt Hilfsmittel zum laden der Sudokus.
 * 
 * @author Niklas Hohenwarter
 * @author Alfred Emsenhuber
 * @version 2013-5-27
 */
public class Load {

	/**
	 * Ruft die Methode zum laden des Levels oder der L�sung.
	 * 
	 * @param level, die Nummer des Levels
	 * @param i, Level oder L�sung
	 * @return das char Array mit der Angbae/L�sung einer load-Methode
	 * @since 2013-5-27
	 */
	public static char[][] loadData(int level, int i){
		
		switch(i){
			case Sudoku.LEVEL:
				return loadLevel(level);
			case Sudoku.LOESUNG:
				return loadLoesung(level);
			default:
				return null;
		}
		
	}
	
	/**
	 * Bekommt das level �bergeben und gibt es als zweidimensionales Char-Array zur�ck
	 * 
	 * @param level, das ausgew�hlte level
	 * @return das Level als char-Array
	 * @since 2013-5-27
	 */
	private static char[][] loadLevel(int level) {
		char[][] felder = new char[9][9];
		String levelAngaben[] = new String[9];
		levelAngaben[0] = "  7   82    283   8      54 92    68 3  6  7 57    43 13      6   846    68   9  ";
		levelAngaben[1] = "   93   56 52      7  6 8  7     39  5 8 9 1  91     6  6 4  5      17 49   58   ";
		levelAngaben[2] = "   4    8 2  6   3 48  7         8618   9   4271         9  65 3   8  1 9    4   ";
		levelAngaben[3] = " 3   7  8     2 17 2   53   8   1 46    5    68 2   5   58   2 26 7     8  9   4 ";
		levelAngaben[4] = "    3  4  2 1    6 9 4    71      9 9 8 7 4 1 3      25    2 7 8    3 4  1  7    ";
		levelAngaben[5] = " 6 5   74   8 1    3   685   9 5   64 5   1 97   1 3   437   9    2 4   19   3 2 ";
		levelAngaben[6] = "  73 6 2   1  7     9 1  8  8      5 4 8 2 9 3      6  4  3 7     2  3   9 7 58  ";
		levelAngaben[7] = "     15    398  6 21    7  3   1 24           47 9   8  3    85 4  156    13     ";
		levelAngaben[8] = " 183    2    8  6424 9      63 4        7        8 75      7 3684  3    1    582 ";
		
		
		int x = 0;
		for(int i = 0; i < felder.length; i++){
			for(int j = 0; j < felder[i].length; j++){
				felder[i][j] = levelAngaben[level].charAt(x);
				x++;
			}
		}
		return felder;	
		
	}
	
	/**
	 * L�dt die L�sung und gibt sie als zweidimensionales char-Array zur�ck
	 * 
	 * @param level, das ausgew�hlte Level
	 * @return das Level als zweidimensionales char-Array
	 * @since 2013-5-27
	 */
	private static char[][] loadLoesung(int level) {
		char[][] felder = new char[9][9];
		String levelLoesung[] = new String[9];
		levelLoesung[0] = "917645823654283791823197654492371568138465972576289431134756286529846317768312945";
		levelLoesung[1] = "418937625695248173372165849784561392356829417291437586876243159532961784914758623";
		levelLoesung[2] = "396425718127968453548137692549273861836591274271486359187932654342685719965714823";
		levelLoesung[3] = "634197258598632417127485369582971346374856921681234758415863729269745183873912546";
		levelLoesung[4] = "815736249724189536693425187124658397958372461736941852563482971897613245214579368";
		levelLoesung[5] = "168532974957841632234976851319457826465328179782619345243781695586294713197563428";
		levelLoesung[6] = "857396124421587936639214587981463275645872193372951468542638719768219354193745826";
		levelLoesung[7] = "468731592753982461219465783359816247128374596647592138673924185249815637581376924";
		levelLoesung[8] = "618354972395782164247961538763541829528679413419382756295487136846231957173695824";
		
		int x = 0;
		for(int i = 0; i < felder.length; i++){
			for(int j = 0; j < felder[i].length; j++){
				felder[i][j] = levelLoesung[level].charAt(x);
				x++;
			}
		}
		return felder;		
	}

}
