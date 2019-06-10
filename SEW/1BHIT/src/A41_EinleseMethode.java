import javax.swing.JOptionPane;
/**
 * Liest eine gewünschte Anzahl an Zahlen ein und addiert sie zu Einnahmen, Ausgaben oder Gratisleistungen.
 * @author Alfred Emsenhuber
 * @version 2012-02-29
 */
public class A41_EinleseMethode {
    public static void main(String[] args){
        int anzahl, einnahmen = 0, ausgaben = 0, gratis = 0, zahl;
        anzahl = Einlesen.intIntra("Gib die Anzahl der Eingaben ein.");
        while(anzahl > 0){
            zahl = Einlesen.intIntra("Gib eine Zahl ein.");
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
