package AU15_Emsenhuber;

/**
 * Model Klasse mit allen notwendigen Methoden um ein Pascalsches Dreieck zu berechnen und dieses dann als String zurück zu geben.
 * 
 * @author Alfred Emsenhuber
 * @version 2014-03-14
 */
public class AU15_Model {
	
	/**
	 * Default Konstruktor.
	 * (Wäre für dieses Beispiel nicht notwendig da alle Methoden auch statisch funktionieren würden, erleichtert aber den Zugriff auf diese)
	 */
	public AU15_Model(){
		
	}
	
	/**
	 * Erzeugt ein long Array in Form eines Dreiecks und befüllt dieses mit den Werten des Pascalschen Dreiecks
	 * 
	 * @param height Die Zeilenanzahl für das Dreieck
	 * @return
	 */
	public long[][] pascal(int height){
		long[][] dreieck = new long[height][];
		for (int i=0; i<height; i++) {
			dreieck[i] = new long[i+1];
			for(int j=0; j<=i; j++) {
				long ergebnis = 1;
				if(j>0&&j<i){
					long a = zahlenfolge(i);
					long b = zahlenfolge(j);
					long c = zahlenfolge(i-j);
					ergebnis = a/(b*c);		//Formel für das Pascalsche Dreieck
				}
				dreieck[i][j] = ergebnis;
				}
			}
		return dreieck;
	}
	
	/**
	 * Multipliziert alle Zahlen von 1-n miteinander und gibt das Ergebnis zurück.
	 * 
	 * @param n Die Größe der Zahlenfolge
	 * @return Die berechnete Zahlenfolge
	 */
	public static long zahlenfolge(long n){
		long zahl = 1;
		for(int i = 1;i <= n;i++){
			zahl = zahl * i;
		}
		return zahl;
	}
	
	/**
	 * Konvertiert das übergebene Array in einen mit HTML Code versehenen String zum ausgeben.
	 * 
	 * @param dreieck Ein 2-Dimensionale Dreiecks-Array
	 * @param zeilen Die Anzahl der Zeilen des Arrays
	 * @return Den fertigen Text
	 */
	public String arryToString(long[][] dreieck,int zeilen){
		String text = "<center>";
		for(int i=0; i<zeilen; i++){
			for(int j=0; j<=i; j++){
				text += dreieck[i][j] + " ";
			}
			text += "<br>";
		}
		text += "</center>";
		return text;
	}
}
