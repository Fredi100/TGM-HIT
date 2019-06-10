import javax.swing.*;
/**
 * Eine Ansammlung von Methoden um verschiedene Muster in Textform darzustellen.
 * 
 * @author Alfred Emsenhuber
 * @version 2012-3-22
 */
public class Muster{
    /**
     * Erstellt ein Rechteck aus Rauten mit veränderbaren Zeilen und Spalten und gibt es dann Als Text zurück.
     * 
     * @author Alfred Emsenhuber
     * @version 2012-3-22
     */
    public static String rechteck(int zeilen, int spalten){
        int i, j;
        String text;
        text = "";
        i = 1;
        do{
            j = 1;
            do{
                text+="#";
                j+=1;
            }while(j <= spalten);
            text+="\n";
            i+=1;
        }while(i <= zeilen);
        return text;
    }
    /**
     * Erstellt ein Dreieck mit veränderbaren Zeilen und gibt es dann aus.
     * 
     * @author Alfred Emsenhuber
     * @version 2012-4-29
     */
    public static void dreieckLinksAusgabe(int zeilen){
        String text;
        text = "";
        while(zeilen > 0){
            text+="#";
            System.out.println(text);
            zeilen--;
        }
    }
    /**
     * Erstellt ein Dreieck mit veränderbaren Zeilen und gibt es dann als Text zurück.
     * 
     * @author Alfred Emsenhuber
     * @version 2012-4-29
     */
    public static String dreieckLinks(int zeilen){
        int zaehler1, zaehler2;
        String text;
        text = "";
        zaehler1 = 1;
        zaehler2 = 1;
        while(zeilen > 0){
            while(zaehler2 > 0){
                text+="#";
                zaehler2--;
            }
            zaehler1++;
            zaehler2 = zaehler1;
            text+="\n";
            zeilen--;
        }
        return text;
    }
    /**
     * Erstellt ein rechstbündiges Dreieck und gibt es dann aus.
     * 
     * @author Alfred Emsenhuber
     * @version 2012-4-29
     */
    public static void DreieckRechstAusgabe(int zeilen){
        
    }
}