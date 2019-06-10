import javax.swing.JOptionPane;
/**
 * Ein Programm das zuerst eine Zahl einliest, dann überprüft ob diese positiv, negativ oder Null ist und das Ergebnis dann ausgibt.
 * 
 * @author Alfred Emsenhuber
 * @version 2011.1.12
 */
public class A28_PositivNegativNull {
    public static void main(String[] args) {
        String eingabe;
        double zahl;
        eingabe = JOptionPane.showInputDialog(null,"Bitte geben sie eine beliebige Zahl ein.");
        zahl = Double.parseDouble(eingabe);
        if(zahl > 0) {
            JOptionPane.showMessageDialog(null,"Die eingegebene Zahl ist positiv");
        }
        else{
            if(zahl == 0) {
                JOptionPane.showMessageDialog(null,"Die eingegebene Zahl ist Null");
            }
            else{
                if(zahl < 0) {
                JOptionPane.showMessageDialog(null,"Die eingegebene Zahl ist negativ");
                }
            }
        }
    }
}
        