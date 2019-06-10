import javax.swing.JOptionPane;
/**
 * Programm das den einen Eingegebenen Wert mit mit zwei hoch einer 
 * weiteren eingegebenen Zahl multipliziert.
 * 
 * @author Alfred Emsenhuber
 * @version 22.12.2011
 */
public class A26_Skalieren {
    public static void main(String[] args) {
        String eingabe1;
        String eingabe2;
        double zahl1;
        double zahl2;
        int wert1;
        int skalierung2;
        double skalierung1;
        eingabe1 = JOptionPane.showInputDialog(null,"Gib bitte eine Zahl ein.");
        eingabe2 = JOptionPane.showInputDialog(null,"Gib nun Skalierung ein.");
        zahl1 = Double.parseDouble(eingabe1);
        zahl2 = Double.parseDouble(eingabe2);
        wert1 = (int)zahl2;
        skalierung1 = Math.scalb(zahl1,wert1);
        skalierung2 = (int)skalierung1;
        JOptionPane.showMessageDialog(null,"Eingelesener Wert: " + eingabe1 + "\nEingelesene Skalierung: " +
            eingabe2 + "\nSkalierung mit 2^" + wert1 + " ( \"dezimal\"): " + skalierung1 +
            "\nSkalierung mit 2^" + wert1 + " (\"ganzzahlig\"): " + skalierung2);
    }
}
        