import javax.swing.JOptionPane;
/**
 * Liest eine Zahl ein und negiert sie
 * 
 * @author Alfred Emsenhuber
 * @version 2012-15-3
 */
public class A45_Flussdiagramm {
    public static void main (String[] args){
        int zahl;
        zahl = Einlesen.intIntra("Bitte gib eine Zahl ein die negiert werden soll.");
        JOptionPane.showMessageDialog(null,"Die Zahl lautet nun: " + zahl);
    }
}