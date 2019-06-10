import javax.swing.JOptionPane;
/**
 * Liest zwei zahlen ein, und nimmt dann die erste hoch der zweiten.
 * 
 *@author Alfred Emsenhuber
 *@version 2012-15-3
 */
public class A48_Flussdiagramm {
    public static void main(String[] args) {
        int zahlA, zahlB;
        double ergebnis;
        zahlA = Einlesen.intIntra("Bitte gib die erste Zahl ein.");
        zahlB = Einlesen.intIntra("Bitte gib die zweite Zahl eiin.");
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
        JOptionPane.showMessageDialog(null,"Das Ergebnis lautet " + ergebnis + " weil die erste Zahl hoch der zweiten genommen wurde.");
    }
}
