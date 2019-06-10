import javax.swing.JOptionPane;
/**
 * Diese Klasse rechnet jede Grundrechnungsart mit den Zahlen 60 und 7
 * 
 * @author Alfred Emsenhuber
 * @version 2011-10-13
 */
public class A13_RechnungMitEingabe {
    public static void main(String[] args) {
        String frage1;
        String frage2;
        int zahl1; //Diese Deklaration erstellt die Variable zahl1
        int zahl2; //Diese Deklaration erstellt die Variable zahl2
        int summe; //Diese Deklaration erstellt die Variable summe
        int differenz; //Diese Deklaration erstellt die Variable differenz
        int produkt; //Diese Deklaration erstellt die Variable produkt
        int quotient; //Diese Deklaration erstellt die Variable quotient
        int restderdivision; //Diese Deklaration erstellt die Variable restderdivision
        frage1 = JOptionPane.showInputDialog(null,"Gib hier die erste Zahl ein.");
        frage2 = JOptionPane.showInputDialog(null,"Gib hier die zweite Zahl ein:");
        zahl1 = Integer.parseInt(frage1); //Diese Variable enthält den Wert der Variable der ersten Deklaration
        zahl2 = Integer.parseInt(frage2);//Diese Variable enthält den Wert der Variable der zweiten Deklaration
        summe = zahl1 + zahl2; //Diese Variable addiert die Werte der ersten zwei Variablen
        differenz = zahl1 - zahl2; //Diese Variable subtrahiert die Werte der ersten zwei Variablen
        produkt = zahl1 * zahl2; //Diese Variable multipliziert die Werte der ersten zwei Variablen
        quotient = zahl1 / zahl2; //Diese Variable dividiert die Werte der ersten zwei Variablen
        restderdivision = zahl1 % zahl2; //Diese Variable enthält den Rest der vorherigen Division
        
        JOptionPane.showMessageDialog(null, "Das Ergebnis von " + zahl1 + " plus " + zahl2 + " ist " + summe); //Dieser Befehl gibt die addition als Text aus
        JOptionPane.showMessageDialog(null, "Das Ergebnis von " + zahl1 + " minus " + zahl2 + " ist " + differenz); //Dieser Befehl gibt die subtraktion als Text aus
        JOptionPane.showMessageDialog(null, "Das Ergebnis von " + zahl1 + " mal " + zahl2 + " ist " + produkt); //Dieser Befehl gibt die multiplikation als Text aus
        JOptionPane.showMessageDialog(null, "Das Ergebnis von " + zahl1 + " dividiert durch " + zahl2 + " ist " + quotient + " und " + restderdivision + " Rest"); //Dieser Befehl gibt die division inklusieve Rest aus
    }
}