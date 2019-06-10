package AU17_Emsenhuber;

/**
 * Eine erweiterte Model Klasse
 * Kümmert sich um den Spielverlauf
 * 
 * @author xXFredi100Xx
 * @verison 2014-03-21
 */
public class ModelExtended extends Model{
	
	/**
	 * Ruft den Super Konstruktor auf
	 */
	public ModelExtended(){
		super();
	}
	
	/**
	 * Erweitert die ursprüngliche Methode damit der Computer einen Wert von 1-5 wählen kann
	 */
	@Override
	public int getAuswahl(){
		double zufallszahl = Math.random()*5+1;
		return (int) zufallszahl;
	}
	
	/**
	 * Erweitert die ursprüngliche Methode um ein paar Mögliche ausgänge
	 */
	@Override
	public int selectWinner(int player, int pc){
		int i = 2;
		if(player == pc){
			++draws;
			++games;
		}else if(player == 1 && (pc == 3 || pc == 4)){
			++wins;
			++games;
			--i;
		}else if(player == 2 && (pc == 1 || pc == 4)){
			++wins;
			++games;
			--i;
		}else if(player == 3 && (pc == 2 || pc == 5)){
			++wins;
			++games;
			--i;
		}else if(player == 4 && (pc == 3 || pc == 5)){
			++wins;
			++games;
			--i;
		}else if(player == 5 && (pc == 1 || pc ==2 )){
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
}
