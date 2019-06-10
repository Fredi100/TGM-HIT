import javax.swing.JOptionPane;
/**
 * Dieses Programm berechnet den Flächeninhalt und den Umfang eines Kreises.
 * 
 * @author Alfrd Emsenhuber
 * @version 2011-10-27
 */

public class A14_Kreisberechnung {
    public static void main(String[] args) {
        String eingabe1; //Deklariert eine String-Variable
        int radius;      //Deklariert eine Int-Variable
        double pi;       //Deklariert eine Double-Variable
        double flaeche;  //Deklariert eine Double-Variable
        double umfang;   //Deklariert eine Double-Variable
        eingabe1 = JOptionPane.showInputDialog(null, "Gib hier den Radius des Kreises ein");
        radius = Integer.parseInt(eingabe1); //Wandelt die String-Variable in eine Int-Variable um
        pi = 3.14159;                        //Einh�lt den Wert f�r die Variable pi
        umfang = 2 * radius * pi;            //Einth�lt den Wert f�r die Variable umfang
        flaeche = radius * radius * pi;      //Enth�lt den Wert f�r die Variable flaeche
        JOptionPane.showMessageDialog(null, "Der Fl�cheninhalt eines Kreises mit dem Radius " + radius + 
            " betr�gt " + flaeche);
        JOptionPane.showMessageDialog(null, "Der Umfang des Kreises mit dem Radius " + radius + " betr�gt " +
            + umfang );
    }
}