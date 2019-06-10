import javax.swing.JOptionPane;
/**
 * Liest das Alter des Benutzers ein und den Preis und berechnet dann ob der 
 * Benutzer eine Ermäßigung bekommt und wie viel.
 * 
 * @author Alfred Emsenhuber
 * @version 2012-26-1
 */
public class Test4 {
    public static void main(String[] args) {
        String eingabe1;
        String eingabe2;
        double alter;
        double preis;
        double endpreis;
        double prozent;
        eingabe1 = JOptionPane.showInputDialog(null,"Gib bitte dein Alter ein.");
        alter = Double.parseDouble(eingabe1);
        while(alter <= 0) {
            eingabe1 = JOptionPane.showInputDialog(null,"Ungültiges Alter, bitte erneut eingeben.");
            alter = Double.parseDouble(eingabe1);
        }
        eingabe2 = JOptionPane.showInputDialog(null,"Bitte Preis eingeben.");
        preis = Double.parseDouble(eingabe2);
        if(alter < 6) {
            endpreis = preis / 2;
            JOptionPane.showMessageDialog(null," Sie sind " + alter + 
                " jahre alt und bekommen daher eine Ermäßigung von 50% " + "/nDer Preis beträgt nun " +
                endpreis + " Euro.");
        }
        else {
            if(alter < 16) {
                prozent = preis / 100 * 20;
                endpreis = preis - prozent;
                JOptionPane.showMessageDialog(null," Sie sind " + alter + 
                    " jahre alt und bekommen daher eine Ermäßigung von 20% " + "/nDer Preis beträgt nun " +
                    endpreis + " Euro.");
            }
            else {
                JOptionPane.showMessageDialog(null,"Sind sind " + alter + " Jahre alt und bekommen daher keine Ermäßigung.");
            }
        }
    }
}