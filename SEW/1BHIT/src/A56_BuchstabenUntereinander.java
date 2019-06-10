import javax.swing.JOptionPane;
/**
 * Liest ein Wort ein und gibt jeden einzelnen Buchstaben untereinander wieder aus.
 *    (Bei zu wenig Buchstaben wird eine Fehlermeldung ausgegeben da er den jeweiligen  Buchstaben nicht finden kann,
 *     bei zu vielen werden die Buchstaben die zu viel sind nicht mehr ausgegeben.)
 * 
 * @author Alfred Emsenhuber
 * @version 2012-4-26
 */
public class A56_BuchstabenUntereinander {
    public static void main(String[] args){
        String wort, ausgabe;
        char buchstabe;
        int nummer, zaehler;
        ausgabe = "";
        nummer = 0;
        zaehler = 1;
        wort = JOptionPane.showInputDialog(null,"Bitte gib ein Wort mit 5 Buchstaben ein.");
        while(nummer < 5){
            buchstabe = wort.charAt(nummer);
            ausgabe += zaehler + ". Buchstabe: '" + buchstabe + "'\n";
            zaehler++;
            nummer++;
        }
        JOptionPane.showMessageDialog(null,ausgabe);
    }
}