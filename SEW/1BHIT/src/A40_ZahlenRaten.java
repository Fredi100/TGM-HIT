import javax.swing.JOptionPane;
/**
 * Ein Spiel in dem man eine Zahl raten muss die der Computer zufällig auswählt.
 * 
 * @author Alfred Emsenhuber
 * @version 2012-3-7
 */
public class A40_ZahlenRaten {
    public static void main(String[] args){
        String eingabe;
        double hoehe;
        double zufall;
        int zahlzufall;
        int zahleingabe;
        int zaehlen;
        eingabe = JOptionPane.showInputDialog(null,"Bitte gib die maximale Zahl ein die der Computer wählen kann.");
        hoehe = Double.parseDouble(eingabe);
        while(hoehe < 5){
            eingabe = JOptionPane.showInputDialog(null,"Die Zahl sollte größer als 5 sein da es sonst zu leicht ist.");
            hoehe = Double.parseDouble(eingabe);
        }
        zufall = Math.random();
        zufall = zufall * hoehe + 1;
        zahlzufall = (int) zufall;
        eingabe = JOptionPane.showInputDialog(null,"Bitte rate jetzt eine Zahl zwischen 1 und " + hoehe + ".");
        zahleingabe = Integer.parseInt(eingabe);
        zaehlen = 1;
        if(zahleingabe <= 0 ){
            JOptionPane.showMessageDialog(null,"Ohh, schade, du hast das Spiel abgebrochen.");
        }
        else{
            while(zahleingabe != zahlzufall){
                if(zahleingabe < zahlzufall){
                    JOptionPane.showMessageDialog(null,"Meine Zahl ist größer als deine, versuch`s ruhig nocheinmal.");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Meine Zahl ist kleiner als deine, aber du kannst es ja gerne nochmal versuchen.");
                }
                eingabe = JOptionPane.showInputDialog(null,"Gib hier einfach die nächste Zahl ein, vielleicht klappt es diesmal.");
                zahleingabe = Integer.parseInt(eingabe);
                zaehlen++;
            }
            JOptionPane.showMessageDialog(null,"Das war die richitge Zahl, du hast " + zaehlen + " Versuche gebraucht.");
        }
    }
}
        