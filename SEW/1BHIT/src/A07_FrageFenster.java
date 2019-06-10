import javax.swing.JOptionPane;
/**
 * Klasse die eine Frage stellt und die Antwort ausgibt
 * 
 * @author Alfred Emsenhuber
 * @version 2011-10-12
 */
public class A07_FrageFenster {
    public static void main(String[] args) {
        String textSpeicher;    // Hier wird eine Textvariable deklariert
        // In der folgenden zeile wird ein Fenster zum eingeben angezeigt.
        textSpeicher = JOptionPane.showInputDialog(null, "Gib einen Text ein");
        JOptionPane.showMessageDialog(null,"Der eingegebene Text lautet ");
        JOptionPane.showMessageDialog(null,textSpeicher );
    }
}