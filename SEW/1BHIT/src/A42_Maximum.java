import javax.swing.JOptionPane;
/**
 * Programm welches drei Zahlen einliest und dann die nhöchste bestimmt.
 * 
 * @author Alfred Emsenhuber
 * @version 2012-3-8
 */
public class A42_Maximum {
    public static void main(String[] args) {
        int zahl1, zahl2, zahl3, ausgabe;
        zahl1 = Einlesen.intIntra("Bitte gib die erste Zahl ein.");
        zahl2 = Einlesen.intIntra("Bitte gib die zweite Zahl ein.");
        zahl3 = Einlesen.intIntra("bitte gib die dritte Zahl ein.");
        ausgabe = Mathematik.maximum(zahl1, zahl2, zahl3);
        JOptionPane.showMessageDialog(null,"Von den eingegebenen Zahlen " + zahl1 + " ," + zahl2 + " und " + zahl3 + " ist " + ausgabe + " die größte.");
    }
}