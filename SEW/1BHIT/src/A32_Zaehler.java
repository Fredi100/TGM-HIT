import javax.swing.JOptionPane;
/**
 * Eine ganze Zahl wird eingelesen und die Summe aller Zahlen von 0 bis zu der eingegebenen Zahl werden addiert.
 * @author Alfred Emsenhuber
 * @version 2012-02-15
 */
public class A32_Zaehler{
    public static void main(String [] args){
        // Deklaration
        String eingabe;
        int maxZahl, summe = 0, zaehler = 0;
        eingabe = JOptionPane.showInputDialog(null, "Gib eine maximale Zahl ein!"); //Liest eine Zahl ein
        maxZahl = Integer.parseInt(eingabe); // Wandelt die eingabe in eine int um.
        //Berechnung
        while(zaehler <= maxZahl){
            System.out.println("Summe: " + summe + "\tZähler: " + zaehler);
            summe = summe + zaehler;
            zaehler++;
        }
        JOptionPane.showMessageDialog(null, "Die Summe der Zahlen beträgt: " + summe);
    }
}