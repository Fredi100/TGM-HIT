import javax.swing.JOptionPane;
/**
 * Ein Programm das eine Zahl einliest, ihren Kehrwert berechnet und ausgibt. 
 * Wenn die eingelesene Zahl 0 sein sollte wird eine Schleife gestartet in der der Einleseprozess, 
 * sowie eine Umwandlung neu gestartet werden.
 *  
 * @author Alfred Emsenhuber
 * @version 2011-12-02
 */
public class A24_Kehrwert {
    public static void main(String[] args) {
        String eingabe; 
        int zahl; 
        double kehrWert; 
        eingabe = JOptionPane.showInputDialog(null,"Bitte eine ganze Zahl eingeben."); 
        zahl = Integer.parseInt(eingabe);
        while(zahl == 0) {
            eingabe = JOptionPane.showInputDialog(null,"Fehler! Division durch 0 nicht möglich. Bitte eine andere Zahl eingeben.");
            zahl = Integer.parseInt(eingabe);
        }
        kehrWert = (double) 1 / zahl; 
        JOptionPane.showMessageDialog(null,"Der Kehrwert der Zahl " + zahl + " beträgt " + kehrWert + " ");
    }
}