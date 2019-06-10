import javax.swing.JOptionPane;
/**
 * Diese Klasse berechnet den Flächeninhalt und den Umfang eines Rechtecks mit den Längen 54 und 37
 * 
 * @author Alfred Emsenhuber
 * @version 2011-10-14
 */
public class A11_Rechteckv1 {
    public static void main(String[] args) {
        int a;
        int b;
        int flaeche;
        int umfang;
        a = 54;
        b = 37;
        flaeche = a * b;
        umfang = 2 * a + 2 * b;
        
        JOptionPane.showMessageDialog(null, "Das Rechteck hat eine Seitenlänge von 54 und 37.");
        JOptionPane.showMessageDialog(null, "Der Flächeninhalt beträgt " + flaeche);
        JOptionPane.showMessageDialog(null, "Der Umfang beträgt " + umfang);
    }
}