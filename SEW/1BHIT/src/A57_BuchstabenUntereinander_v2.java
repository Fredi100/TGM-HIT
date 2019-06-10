import javax.swing.JOptionPane;
/**
 * Liest ein Wort ein und gibt jeden einzelnen Buchstaben untereinander wieder aus.
 *    (Bei zu wenig Buchstaben wird eine Fehlermeldung ausgegeben da er den jeweiligen  Buchstaben nicht finden kann,
 *     bei zu vielen werden die Buchstaben die zu viel sind nicht mehr ausgegeben.)
 * 
 * @author Alfred Emsenhuber
 * @version 2012-4-26
 */
public class A57_BuchstabenUntereinander_v2 {
    public static void main(String[] args){
        String text, ausgabe;
        char buchstabe;
        int nummer, zaehler, laenge;
        ausgabe = "";
        nummer = 0;
        zaehler = 1;
        text = JOptionPane.showInputDialog(null,"Bitte gib einen Text ein.");
        laenge = text.length();
        while(nummer < laenge){
            buchstabe = text.charAt(nummer);
            ausgabe += zaehler + ". Buchstabe: '" + buchstabe + "'\n";
            zaehler++;
            nummer++;
        }
        JOptionPane.showMessageDialog(null,ausgabe);
    }
}