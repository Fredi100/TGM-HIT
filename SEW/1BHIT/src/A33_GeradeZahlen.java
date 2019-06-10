import javax.swing.JOptionPane;
/**
 * Eine ganze Zahl wird eingelesen und alle gerade Zahlen von 0 bis zu dieser Zahl werden ausgegeben.
 * @author Alfred Emsenhuber
 * @version 2012-02-16
 */
public class A33_GeradeZahlen {
    public static void main(String[] args) {
        // Deklaration
        String eingabe;
        int maxZahl, zaehler, gerade;
        eingabe = JOptionPane.showInputDialog(null, " Gib eine maximale Zahl ein!"); //Liest eine Zahl ein
        maxZahl = Integer.parseInt(eingabe); //Wandelt die eingabe in eine int um
        zaehler = 0;
        gerade = 2;
        while(gerade<maxZahl){
            zaehler++; // Zähler wird um 1 erhöht
            System.out.println("ausgegebene Zahl: " + zaehler + ". \t gerade Zahl: " + gerade); // Zähler und gerade Zahl werden ausgegeben
            gerade = gerade + 2 ; // Gerade wird um 2 erhöht
        }
    }
}