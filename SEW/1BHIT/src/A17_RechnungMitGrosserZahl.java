import javax.swing.JOptionPane;
/**
 * Diese Programm liest eine große Zahl ein und quadriert sie
 * 
 * @author Alfred Emsenhuber
 * @version 2011-11-10
 */
public class A17_RechnungMitGrosserZahl{
    public static void main(String[] args) {
        String eingabe;
        long zahl;
        long ergebnis;
        eingabe = JOptionPane.showInputDialog(null,"Gib hier eine lange Zahl ein.");
        zahl = Long.parseLong(eingabe);
        ergebnis = zahl * zahl;
        JOptionPane.showMessageDialog(null,"Die eingegebene Zahl lautet: " + eingabe);
        JOptionPane.showMessageDialog(null,eingabe + " hoch zwei ergibt: " + ergebnis);
    }
}