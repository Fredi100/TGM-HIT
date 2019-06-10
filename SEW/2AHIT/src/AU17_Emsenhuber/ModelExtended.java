package AU17_Emsenhuber;

/**
 * Eine erweiterte Model Klasse
 * K�mmert sich um den Spielverlauf
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
	 * Erweitert die urspr�ngliche Methode damit der Computer einen Wert von 1-5 w�hlen kann
	 */
	@Override
	public int getAuswahl(){
		double zufallszahl = Math.random()*5+1;
		return (int) zufallszahl;
	}
	
	/**
	 * Erweitert die urspr�ngliche Methode um ein paar M�gliche ausg�nge
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
