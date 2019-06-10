import javax.swing.JOptionPane;
/**
 * Generiert eine Zufallszahl zwischen 1 und einem eingegebenen Wert.
 * @author Alfred Emsenhuber   
 * @version 2012-02-13
 */
public class A31_Zufall{
    public static void main(String[] args) {
        // Deklaration der Variablen
        String eingabe;
        double zufall;
        int zahl, zufallG;
        eingabe = JOptionPane.showInputDialog(null, "Gib eine Zahl ein!"); //Liest eine Zahl ein.
        zahl = Integer.parseInt(eingabe); // Wandelt die eingabe in eine in um
        // Berechnung
        zufall = Math.random();
        zufall = zufall * zahl +1;
        zufallG = (int)zufall;
        // Ausgabe
        JOptionPane.showMessageDialog(null, "Die ermittelte Zufallszahl zwischen 1 und " + zahl + " ist " + zufallG);
    }
}
