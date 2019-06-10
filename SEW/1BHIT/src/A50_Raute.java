import javax.swing.JOptionPane;
/**
 * 
 * 
 * @author Alfred Emsenhuber
 * @version 2012-3-22
 */
public class A50_Raute {
    public static void main(String[] args){
        int zeilen, spalten;
        String text;
        zeilen = Einlesen.intIntra("Bitte gib an wie viele Zeilen es haben soll.");
        spalten = Einlesen.intIntra("Bitte gib an wie viele Spalten es haben soll.");
        text = Muster.rechteck(zeilen,spalten);
        JOptionPane.showMessageDialog(null,text);
    }
}
