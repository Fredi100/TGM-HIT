import javax.swing.JOptionPane;
/**
 * Dieses Programm berechnet einige Dinge und gibt die Ergebnisse plus den Rechenweg aus.
 * 
 * @author Alfred Emsenhuber 
 * @version 2011-12-1
 */
public class A21_FloatBerechnungen {
    public static void main(String[] args) {
        int a, b;
        float p, q, x, y, z;
        a = 22;
        b = 7;
        x = a/b;              //Berechnet den Wert von x mit ganzen Zahlen
        y = (float) a/b;      //Berechnet den Wert von y mit Dezimalzahlen
        z = 7.3f;
        q = a*z + b;
        p = a/b + z;
        JOptionPane.showMessageDialog(null,"Erste Rechnung:\nx = a / b\n" + a + " / " + b + " = " + x);  //Gibt 3.0 aus da mit ganzen Zahlen gerechnet wurde.
        JOptionPane.showMessageDialog(null,"Zweite Rechnung:\ny = a / b\n" + a + " / " + b + " = " + y);  // Gibt 3.142897 da diesmal die Zahlen zum rechnen zuerst in Float umgewandelt wurden
        JOptionPane.showMessageDialog(null,"Dritte Rechnung:\nq = a * z + b\n" + a + " * " + z + " + " + b + " = " + q);  // Gibt 167.6 aus
        JOptionPane.showMessageDialog(null,"Vierte Rechnung:\np = a / b + z\n" + a + " / " + b + " + " + z + " = " + p);  // Gibt 10.3 aus
    }
}