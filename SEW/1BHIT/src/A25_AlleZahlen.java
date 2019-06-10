import javax.swing.JOptionPane;
/**
 * Programm, welches alle Zahlen die sich zwischen den zwei eingegebenen Zahlen befindet angibt.
 * 
 * @author Alfred Emsenhuber
 * @version 2011-12-15
 */
public class A25_AlleZahlen {
    public static void main (String[] args) {
        String eingabe1;
        String eingabe2;
        int zahl1;
        int zahl2;
        int zaehlen;
        eingabe1 = JOptionPane.showInputDialog(null,"Gib bitte eine Zahl ein.");
        eingabe2 = JOptionPane.showInputDialog(null,"Gib nun ein größere Zahl ein.");
        zahl1 = Integer.parseInt(eingabe1);
        zahl2 = Integer.parseInt(eingabe2);
        zaehlen = zahl2 - zahl1;
        System.out.println(zahl1);
        while(zaehlen != 0){
            zahl1 +=1;
            System.out.println(zahl1);
            zaehlen -=1;
        }
    }
}
        