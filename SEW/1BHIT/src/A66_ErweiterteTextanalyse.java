import javax.swing.JOptionPane;
/**
 * Benutzt 
 */
public class A66_ErweiterteTextanalyse{
    public static void main(String[] args){
        String text;
        char zeichen;
        int laenge, length, ziffern, gross, klein, leer, zeichli;
        boolean einKein;
        text = JOptionPane.showInputDialog(null,"Gibt einen Text ein.");
        laenge = text.length();
        length = laenge -1;
        ziffern = 0;
        gross = 0;
        klein = 0;
        zeichli = 0;
        leer = 0;
        while(length >= 0){
            zeichen = text.charAt(length);
            einKein = Text.istZiffer(zeichen);
            if(einKein == true){
                ziffern++;
            }
            length--;
        }
        length = laenge - 1;
        while(length >= 0){
            zeichen = text.charAt(length);
            einKein = Text.istGross(zeichen);
            if(einKein == true){
                gross++;
            }
            length--;
        }
        length = laenge - 1;
        while(length >= 0){
            zeichen = text.charAt(length);
            einKein = Text.istKlein(zeichen);
            if(einKein == true){
                klein++;
            }
            length--;
        }
        length = laenge - 1;
        while(length >= 0){
            zeichen = text.charAt(length);
            einKein = Text.istLeer(zeichen);
            if(einKein == true){
                leer++;
            }
            length--;
        }
        length = laenge - 1;
        while(length >= 0){
            zeichen = text.charAt(length);
            einKein = Text.istZeichen(zeichen);
            if(einKein == true){
                zeichli++;
            }
            length--;
        }
        JOptionPane.showMessageDialog(null,"Es sind insgesamt " + ziffern + " Ziffern, " + klein + " Kleinbuchstaben, " + gross + " Großbuchstaben " + zeichli + " Satzzeichen und " + leer + " Leerzeichen in deinem Text.");
    }
}
