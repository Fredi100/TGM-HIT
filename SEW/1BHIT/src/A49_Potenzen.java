import javax.swing.JOptionPane;
/**
 * Liest zwei Zahlen ein und potenziert diese
 * 
 * @author Alfred Emsenhuber
 * @version 2012-15-3
 */
public class A49_Potenzen {
    public static void main(String[] args){
        int zahl1, zahl2;
        double ergebnis;
        zahl1 = Einlesen.intIntra("Bitte gib eine Zahl ein.");
        zahl2 = Einlesen.intIntra("Bitte gib die Zahl ein mit der die erste Potenziert wird.");
        ergebnis = Mathematik.hoch(zahl1, zahl2);
        JOptionPane.showMessageDialog(null,"Das Ergebnis lautet: " + ergebnis);
    }
}
        