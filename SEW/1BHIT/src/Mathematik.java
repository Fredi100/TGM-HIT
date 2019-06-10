import javax.swing.JOptionPane;
/**
 * Hilfsmethoden für Mathematische aufgaben.
 * 
 * @author Alfred Emsenhuber
 * @version 2011-3-8
 */
public class Mathematik {
    /**
     * Methode um die größte von drei eingegebenen Zahlen zu bestimmen
     * 
     * @version 2011-3-8
     */
    public static int maximum (int wert1, int wert2, int wert3) {
        int zahl1, zahl2, zahl3, ausgabe;
        ausgabe = 0;
        zahl1 = wert1;
        zahl2 = wert2;
        zahl3 = wert3;
        if(zahl1 > zahl2){
            if(zahl1 > zahl3) {
                ausgabe = zahl1;
            }
        }
        if(zahl2 > zahl1){
            if(zahl2 > zahl3){
                ausgabe = zahl2;
            }
        }
        if(zahl3 > zahl1){
            if(zahl3 > zahl2){
                ausgabe = zahl3;
            }
        }
        return ausgabe;
    }
    /**
     * Methode um zufällig eine Zahl zwischen zwei definierten Werten zu erhalten
     * 
     * @version 2012-3-8
     */
    public static int zufall (double min, double max) {
        double zufall, zufallzahl;
        int ausgabe;
        zufall = Math.random();
        zufallzahl = max - min;
        zufallzahl = zufall * zufallzahl + 1 + min;
        ausgabe = (int)zufallzahl;
        return ausgabe;
    }
    /**
     * Nimmt die erste Zahl hoch der zweiten
     * 
     * @author Alfred Emsenhuber
     * @version 2012-15-3
     */
    public static double hoch (int zahlA, int zahlB) {
        double ergebnis;
        ergebnis = 1;
        while(zahlB != 0){
            if(zahlB > 0){
                ergebnis = ergebnis * zahlA;
                zahlB--;
            }
            else{
                ergebnis = ergebnis / zahlA;
                zahlB++;
            }
        }
        return ergebnis;
    }
}
        