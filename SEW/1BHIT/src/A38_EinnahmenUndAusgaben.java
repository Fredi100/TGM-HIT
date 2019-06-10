import javax.swing.JOptionPane;
/**
 * Liest eine gewünschte Anzahl an Zahlen ein und addiert sie zu Einnahmen, Ausgaben oder Gratisleistungen.
 * @author Alfred Emsenhuber
 * @version 2012-02-29
 */
public class A38_EinnahmenUndAusgaben {
    public static void main(String[] args){
        // Deklaration
        String eingabe;
        int anzahl, einnahmen = 0, ausgaben = 0, gratis = 0, zahl;
        //Eingabe
        eingabe = JOptionPane.showInputDialog(null, "Gib die Anzahl der Eingaben ein!");
        // Umwandlung
        anzahl = Integer.parseInt(eingabe);
        //Berechnungen
        while(anzahl > 0){
            eingabe = JOptionPane.showInputDialog(null, "Gib eine Zahl ein!");
            zahl = Integer.parseInt(eingabe);
            if(zahl > 0){
                einnahmen = einnahmen + zahl;
            }
            else{
                if(zahl <0){
                    ausgaben = ausgaben + zahl;
                }
                else{
                    gratis = gratis +1;
                }
            }
            anzahl = anzahl -1;
        }
        //Ausgabe
        JOptionPane.showMessageDialog(null, "Einnahmen :" + einnahmen + "\n" +
                                            "Ausgaben :" + ausgaben + "\n" + 
                                            "Gratisleistungen :" + gratis);
    }
}
