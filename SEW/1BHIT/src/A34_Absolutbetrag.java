import javax.swing.JOptionPane;
/**
 * Der Absolutbetrag einer ganzen eingegebenen Zahl wird berechnet.
 * @author Alfred Emsenhuber
 * @version 2011-02-16
 */
public class A34_Absolutbetrag{
    public static void main(String[] args){
        // Deklaration
        String eingabe;
        int zahl, betrag;
        eingabe = JOptionPane.showInputDialog(null, "Gib eine Zahl ein!"); //Liest eine Zahl als String ein
        zahl = Integer.parseInt(eingabe); // Wnadelt die eingabe in eine int um
        if(zahl<0){ // Solange Zahl kleiner als 0
            betrag = zahl * (-1); // Zahl * -1
        }else{ // Wenn zahl größer 0
            betrag = zahl; // Zahl wird nicht verändert, l
        }
        // Ausgebe
        JOptionPane.showMessageDialog(null, "Eingegebene Zahl: " + zahl + "\nBerechneter Betrag: " + betrag);
    }
}
