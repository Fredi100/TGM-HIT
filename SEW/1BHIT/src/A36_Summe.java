import javax.swing.JOptionPane;
/**
 * Berechnet die Summe aller geraden Zahlen zwischen 2 eingegebenen Zahlen.
 * @author Niklas Hohenwarter
 * @version 2012-02-16
 */
public class A36_Summe{
    public static void main(String[]args){
        //Deklaration
        String eingabe1, eingabe2;
        int zahl1, zahl2, summe, zaehler, maxZahl, minZahl, rest;
        // Eingabe
        eingabe1=JOptionPane.showInputDialog(null,"Gib die 1.Zahl ein!");
        eingabe2=JOptionPane.showInputDialog(null,"Gib die 2.Zahl ein!");
        // Umwandlung in Int
        zahl1=Integer.parseInt(eingabe1);
        zahl2=Integer.parseInt(eingabe2);
        //Bestimmen der kleineren und größeren Zahl
        if(zahl1>zahl2){
            maxZahl=zahl1;
            minZahl=zahl2;
        }
        else{
            maxZahl=zahl2;
            minZahl=zahl1;
        }
        //Summe auf 0 setzen
        summe=0;
        //Kleinere Zahl gerade? Wenn nicht kleinere Zahl +1
        rest=minZahl%2;
        if(rest!=0){
            minZahl++;
        }
        //Zaehler gleich setzen mit der kleineren Zahl
        zaehler=minZahl;
        //Berechnen der Summe
        while(zaehler<=maxZahl){
            summe=summe+zaehler;
            zaehler+=2;
        }
        //Ausgabe der berechneten Summe
        JOptionPane.showMessageDialog(null,"Summe: " + summe);
    }
}