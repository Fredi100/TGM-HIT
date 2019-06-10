import javax.swing.JOptionPane;
/**
 * Wandelt eine Zahl in das zugehörigen Unicode Zeichen um
 * 
 * @author Alfred Emsnehuber
 * @version 2011-12-1
 */
public class A22_UnicodeWert {
    public static void main(String[] args) {
        int zahl;
        char zeichen;
        zahl = 45;
        zeichen = (char) 45;
        JOptionPane.showMessageDialog(null,"Die Zahl " + zahl + " hat im Unicode das Zeichen " + zeichen);
    }
}
        