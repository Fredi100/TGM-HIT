import javax.swing.JOptionPane;
/**
 * Gibt ein Dreieck mit veränderbarer Zeilenanzahl mithilfe einer eigenen Methode aus.
 * 
 * @author Alfred Emsenhuber
 * @version 2012-4-29
 */
public class A51_Dreiecksmuster {
    public static void main(String[] args){
        String text;
        int zeilen;
        zeilen = Einlesen.intIntra("Bitte gib die Anzahl an Zeilen ein.");
        Muster.dreieckLinksAusgabe(zeilen);
        
        zeilen = Einlesen.intIntra("Bitte gib die Anzahl an Zeilen ein.");
        text = Muster.dreieckLinks(zeilen);
        JOptionPane.showMessageDialog(null,text);
    }
}