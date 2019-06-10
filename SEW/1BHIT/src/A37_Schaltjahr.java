import javax.swing.JOptionPane;
/**
 * Prüft ob das eingegebene Jahr ein Schaltjahr ist und gibt es dann aus:
 * 
 * @author Alfred Emsenhuber
 * @version 2011-2-23
 */
public class A37_Schaltjahr {
    public static void main (String[] args) {
        String eingabe,einKein;
        int jahr;
        eingabe = JOptionPane.showInputDialog(null,"Bitte gib das Jahr ein das überprüft werden soll.");
        jahr = Integer.parseInt(eingabe);
        while (jahr >= 0 ){
            if(jahr % 4 == 0) {
                if(jahr % 100 == 0){
                    if(jahr % 400 == 0){
                        einKein = "ein";
                    }
                    else{
                        einKein = "kein";
                    }
                }
                else{
                    einKein = "ein";
                }
            }
            else{
                einKein = "kein";
            }
            JOptionPane.showMessageDialog(null,"Das eingegebene Jahr " + jahr + " ist " + einKein + " Schaltjahr.");
            eingabe = JOptionPane.showInputDialog(null,"Bitte gib ein neues Jahr zum Prüfen ein oder eine negative Zahl um das Programm zu beenden.");
            jahr = Integer.parseInt(eingabe);
        }
    }
}