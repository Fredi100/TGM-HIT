/**
 * Enthält Methoden zum editieren von Texten.
 * 
 * @author Alfred Emsenhuber
 * @version 2012-5-3
 */
public class Text{
    /**
     * Dreht eine String um und gibt diese dann zurück.
     * 
     * @param Ein eingegebenes Wort, oder ein eingegebener Text
     * @return Die umgedrehte String
     * @author Alfred Emsenhuber
     * @version 2012-5-3
     */
    public static String reverse(String text){
        String ausgabe;
        char buchstabe;
        int nummer, laenge;
        ausgabe = "";
        laenge = text.length();
        laenge--;
        while(laenge >= 0){
            buchstabe = text.charAt(laenge);
            ausgabe += buchstabe;
            laenge--;
        }
        return ausgabe;
    }
    /**
     * Vergleicht zwei Texte.
     * 
     * @author Alfred Emsenhuber
     * @version 2012-5-30
     */
    public static boolean equals(String wort1, String wort2){
        int laenge1, laenge2, length, jaNein;
        char buchstabe1, buchstabe2;
        boolean einKein;
        einKein = false;
        jaNein = 0;
        laenge1 = wort1.length();
        laenge2 = wort2.length();
        if(laenge1 == laenge2){
            length = laenge1 - 1;
            while(length >= 0){
                buchstabe1 = wort1.charAt(length);
                buchstabe2 = wort2.charAt(length);
                length--;
                if(buchstabe1 == buchstabe2){
                    jaNein++;
                }
            }
        }
        if(jaNein == laenge1){
            einKein = true;
        }
        return einKein;
    }
    /**
     * Schaut ob das Zeichen eine Ziffer ist.
     * 
     * @author Alfred Emsenhuber
     * @version 2012-5-10
     */
    public static boolean istZiffer(char zeichen){
        boolean ergebnis;
        if(zeichen >= '0' && zeichen <= '9'){
            ergebnis = true;
        }
        else{
            ergebnis = false;
        }
        return ergebnis;
    }
    /**
     * Schaut ob das Zeichen ein Kleinbuchstabe ist.
     * 
     * @author Alfred Emsenhuber
     * @version 2012-5-10
     */
    public static boolean istKlein(char zeichen){
        boolean ergebnis;
        if(zeichen >= 'a' && zeichen <= 'z' || zeichen == 'ä' || zeichen == 'ö' || zeichen == 'ü' || zeichen == 'ß'){
            ergebnis = true;
        }
        else{
            ergebnis = false;
        }
        return ergebnis;
    }
    /**
     * Schaut ob das Zeichen ein Großbuchstabe ist.
     * 
     * @author Alfred Emsenhuber
     * @version 2012-5-10
     */
    public static boolean istGross(char zeichen){
        boolean ergebnis;
        ergebnis = false;
        if(zeichen >= 'A' && zeichen <= 'Z' || zeichen == 'Ä' || zeichen == 'Ö' || zeichen == 'Ü'){
            ergebnis = true;
        }
        else{
            ergebnis = false;
        }
        return ergebnis;
    }
    /**
     * 
     */
    public static boolean istZeichen(char zeichen){
        boolean ergebnis;
        ergebnis = false;
        switch(zeichen){
            case '!' :
            case '?' :
            case '.' :
            case ',' :
                ergebnis = true;
                break;
        }
        return ergebnis;
    }
    /**
     * 
     */
    public static boolean istLeer(char zeichen){
        boolean ergebnis;
        ergebnis = false;
        switch(zeichen){
            case ' ':
                ergebnis = true;
                break;
        }
        return ergebnis;
    }
}
