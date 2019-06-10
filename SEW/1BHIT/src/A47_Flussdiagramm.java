import javax.swing.JOptionPane;
/**
 * Liest eine Zahl ein und zeiht ihr solange ein ab bis sie niedriger als null ist.
 * 
 * @author Alfred Emsenhuber
 * @version 2012-15-3
 */
public class A47_Flussdiagramm {
    public static void main (String[] args) {
        int zahl;
        zahl = Einlesen.intIntra("Bitte gib eine Zahl ein.");
        while(zahl > 0){
            JOptionPane.showMessageDialog(null," Derzeitige Zahl: " + zahl);
            zahl--;
        }
        JOptionPane.showMessageDialog(null,"Die Zahl lautet: " + zahl);
    }
}