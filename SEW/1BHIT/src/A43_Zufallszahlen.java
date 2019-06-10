import javax.swing.JOptionPane;
/**
 * Ein Spiel in dem man eine Zahl raten muss die der Computer zufällig auswählt.
 * 
 * @author Alfred Emsenhuber
 * @version 2012-3-8
 */
public class A43_Zufallszahlen {
    public static void main(String[] args){
        double max;
        double min;
        int zahlzufall;
        int zahleingabe;
        int zaehlen;
        max = Einlesen.doubleIntra("Bitte gib die maximale Zahl ein die der Computer wählen kann.");
        while(max < 5){
            max = Einlesen.doubleIntra("Die Zahl sollte größer als 5 sein da es sonst zu leicht ist.");
        }
        min = Einlesen.doubleIntra("Bitte gib die minimale Zahl ein die der Computer wählen kann.");
        while(min >= max){
            min = Einlesen.doubleIntra("Die Zahl sollte kleiner sein als " + max);
        }
        zahlzufall = Mathematik.zufall(min, max);
        zahleingabe = Einlesen.intIntra("Bitte rate jetzt eine Zahl zwischen " + min + " und " + max + ".");
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
                zahleingabe = Einlesen.intIntra("Gib hier einfach die nächste Zahl ein, vielleicht klappt es diesmal.");
                zaehlen++;
            }
            JOptionPane.showMessageDialog(null,"Das war die richitge Zahl, du hast " + zaehlen + " Versuche gebraucht.");
        }
    }
}