package AU17_Emsenhuber;

/**
 * Kümmert sich um alle Berechnungen
 * 
 * @author xXFredi100Xx
 * @version 2014-03-21
 */
public class Model {
	protected int wins;
	protected int draws;
	protected int loses;
	protected int games;
	
	/**
	 * Initialisiert alle int Variablen
	 */
	public Model(){
		wins = 0;
		draws = 0;
		loses = 0;
		games = 0;
	}
	
	/**
	 * Errechnet eine Auswahl des PC's und gibt diese zurück
	 * @return Die Auswahl des Pc's
	 */
	public int getAuswahl(){
		double zufallszahl = Math.random()*3+1;
		return (int) zufallszahl;
	}
	
	/**
	 * Bekommt die Auswahl des Spielers und des PCs und ermittelt damit den Gewinner
	 * 
	 * @param player Die Auswahl des Spielers als int
	 * @param pc Die Auswahl des Computers als int
	 * @return Den Gewinner als int
	 */
	public int selectWinner(int player, int pc){
		int i = 2;
		if(player == pc){
			++draws;
			++games;
		}else if(player > pc || player < pc-1){
			++wins;
			++games;
			--i;
		}else{
			++loses;
			++games;
			++i;
		}
		return i;
	}
	
	/**
	 * Returned die Anzahl der Siege
	 * 
	 * @return Die Anzahl der Siege als int
	 */
	public int getWins(){
		return wins;
	}
	
	/**
	 * Returned die Anzahl der Unentschieden
	 * 
	 * @return Die Anzahl der Unentschieden als int
	 */
	public int getDraws(){
		return draws;
	}
	
	/**
	 * Returned die Anzahl der Niederlagen
	 * 
	 * @return Die Anzahl der Niederlagen als int
	 */
	public int getLoses(){
		return loses;
	}
	
	/**
	 * Returned die Anzahl der gespielten Spiele
	 * 
	 * @return Die Anzahl der gespielten Spiele als int
	 */
	public int getGames(){
		return games;
	}
}
