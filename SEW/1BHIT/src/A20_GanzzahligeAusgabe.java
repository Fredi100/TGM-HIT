import javax.swing.JOptionPane;
/**
 * Diese Programm berechnet den Flächeninhalt und den Umfang eines gleichseitigen Dreiecks.
 * 
 * @author Alfred Emsenhuber
 * @version 2011-11-10
 */
public class A20_GanzzahligeAusgabe {
    public static void main(String[] args) {
        String eingabe;        //Deklariert eine String-Variable mit dem Namen eingabe
        double seitenlaenge;   //Deklariert eine double-Variable mit dem Namen seitenlaenge
        double umfang;         //Deklariert eine double-Variable mit dem Namen umfang
        double flaeche;        //Deklariert eine double-Variable mit dem Namen flaeche
        double wurzel;
        double drei;
        int ausgabeFlaeche;
        int ausgabeUmfang;
        drei = 3;
        wurzel = Math.sqrt(drei);
        eingabe = JOptionPane.showInputDialog(null,"Gib hier bitte die Seitenlänge des gleichseitigen " + 
        "Dreiecks in Millimeter ein");   //Fordert den Benutzer auf die Seitenlänge des Dreiecks einzugeben
        seitenlaenge = Double.parseDouble(eingabe);   //Wandelt die String-Variable in eine double-Variable um
        umfang = 3 * seitenlaenge;   //Enthält die Formel mit der dann der Umfang berechnet wird
        flaeche = seitenlaenge * seitenlaenge * wurzel / 4;  //Enthält die Formel für die Fläche
        ausgabeFlaeche = (int) flaeche;
        ausgabeUmfang = (int) umfang;
        
        JOptionPane.showMessageDialog(null,"Die eingegebene Seitenlänge beträgt: " + seitenlaenge + "mm");          //Öffnet ein Fenster in dem dem Benutzer ein Text angezeigt wird der die Seitenlänge enthält
        JOptionPane.showMessageDialog(null,"Der Umfang beträgt bei einer Seitenlänge von " + seitenlaenge + "mm " + ausgabeUmfang + "mm");               //Öffnet ein Fenster in dem der Rechenweg und das Ergebnis für den Umfang angezeigt wird
        JOptionPane.showMessageDialog(null,"Die Fläche beträgt bei einer Seitenlänge von " + seitenlaenge + "mm " + ausgabeFlaeche + "mm²");    //Öffnet ein Fenster in dem der Rechenweg und das Ergebnis für die Fläche angezeigt wird
    }
}
        