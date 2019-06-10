import javax.swing.JOptionPane;
/**
 * Klasse die eine Frage stellt und die Antwort ausgibt
 * 
 * @author Alfred Emsenhuber
 * @version 2011-10-12
 */
public class A08_GrussMitEingabe {
    public static void main(String[] args) {
        String tageszeit;
        String name;    // Hier wird eine Textvariable deklariert
        // In der folgenden zeile wird ein Fenster zum eingeben angezeigt.
        tageszeit = JOptionPane.showInputDialog(null, "Tageszeit");
        name = JOptionPane.showInputDialog(null, "Name");
        JOptionPane.showMessageDialog(null,tageszeit + name );
    }
}