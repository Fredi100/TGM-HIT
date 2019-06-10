import javax.swing.JOptionPane;
/**
 * Programm, welches einen beliebige ganze Zahl einem anderem Zahlensystem angibt
 * 
 * @author Alfred Emsenhuber
 * @version 2011-12-15
 */
public class P02_Zahlensystem {
    public static void main (String[] args) {
        String eingabeZahl;
        String eingabeBasis;
        double zahl;
        double basis;
        int ganzeBasis;
        int ganzeZahl;
        char ergebnis;
        eingabeZahl = JOptionPane.showInputDialog(null,"Gib eine beliebige Zahl ein.");
        eingabeBasis = JOptionPane.showInputDialog(null,"Gib die Basis des Zahlensystems " +
            "ein in das die vorherige Zahl umgewandelt werden soll.");
        zahl = Double.parseDouble(eingabeZahl);
        basis = Double.parseDouble(eingabeBasis);
        ganzeBasis = (int)basis;
        ganzeZahl = (int)zahl;
        ergebnis = Character.forDigit(ganzeZahl, ganzeBasis);
        JOptionPane.showMessageDialog(null,"Eingegebene Ziffer: " + eingabeZahl +
            "\nGanzzahlige Ziffer: " + ganzeZahl + 
            "\nZiffer im Zahlensystem zur Basis \"" + eingabeBasis + "\": " + ergebnis);
    }
}
        
        