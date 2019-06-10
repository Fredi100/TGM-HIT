import javax.swing.JOptionPane;
/**
 * Prüft ob das eingegebene Jahr ein Schaltjahr ist und gibt es dann aus:
 * 
 * @author Alfred Emsenhuber
 * @version 2011-2-23
 */
public class A55_Schaltjahr {
    public static void main (String[] args) {
        String eingabe,einKein;
        int jahr;
        eingabe = JOptionPane.showInputDialog(null,"Bitte gib das Jahr ein das überprüft werden soll.");
        jahr = Integer.parseInt(eingabe);
        if((jahr > 0) && ((jahr % 4 == 0) && (!(jahr % 100 == 0)) || (jahr % 400 == 0))){
            JOptionPane.showMessageDialog(null,"Das eingegebene Jahr " + jahr + " ist ein Schaltjahr.");
        }
        else{
            JOptionPane.showMessageDialog(null,"Das eingegebene Jahr " + jahr + " ist kein Schaltjahr.");
        }
    }
}