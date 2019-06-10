import javax.swing.JOptionPane;
/**
 * Diese Klasse berechnet den Flächeninhalt und den Umfang eines Rechtecks mit den Längen 54 und 37
 * 
 * @author Alfred Emsenhuber
 * @version 2011-10-14
 */
public class A16_RechteckMitEingabe {
    public static void main(String[] args) {
        String frage1;
        String frage2;
        int a;
        int b;
        int flaeche;
        int umfang;
        frage1 = JOptionPane.showInputDialog(null, "Gib bitte die Länge ein");
        frage2 = JOptionPane.showInputDialog(null, "Gib bitte die Breite ein");
        a = Integer.parseInt(frage1);
        b = Integer.parseInt(frage2);
        flaeche = a * b;
        umfang = 2 * a + 2 * b;
        
        JOptionPane.showMessageDialog(null, "Das Rechteck hat eine Seitenlänge von " + frage1 + " und " + frage2);
        JOptionPane.showMessageDialog(null, "Der Flächeninhalt beträgt " + flaeche);
        JOptionPane.showMessageDialog(null, "Der Umfang beträgt " + umfang);
    }
}