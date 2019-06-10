import javax.swing.JOptionPane;
/**
 * Programm die verschidene Aufgaben für das Datum ausführen.
 * 
 * @author Alfred Emsenhuber
 * @version 24.5.2012
 */
public class Datum {
    /**
     * Bekommt den Tag das Monats und das Jahr als Parameter und berechnet sich dadurch den Wochentag.
     * 
     * @author Alfred Emsenhuber
     * @version 24.5.2012
     */
    public static int wochentag(int jahr, int monat, int tag) {
        String eingabe1;
        String eingabe2;
        int a;
        int b;
        int c;
        int hoherMonat;
        int niedrigerMonat;
        int februar;
        hoherMonat = 0;
        niedrigerMonat = 0;
        februar = 0;
        if(jahr < 0) {
            JOptionPane.showMessageDialog(null,"Sie haben ein ungültiges Jahr eingegeben, beginnen sie bitte von vorne!");
            System.exit( 0 );
        }
        if(monat > 12) {
            JOptionPane.showMessageDialog(null,"Sie haben ein ungültiges Monat eingegeben, beginnen sie bitte von vorne!");
            System.exit( 0 );
        }
        switch(monat){
            case 1 :
                hoherMonat++;
                break;
            case 2 :
                februar++;
                break;
            case 3 :
                hoherMonat++;
                break;
            case 4 :
                niedrigerMonat++;
                break;
            case 5 :
                hoherMonat++;
                break;
            case 6 :
                niedrigerMonat++;
                break;
            case 7 :
                hoherMonat++;
                break;
            case 8 :
                hoherMonat++;
                break;
            case 9 :
                niedrigerMonat++;
                break;
            case 10 :
                hoherMonat++;
                break;
            case 11 :
                niedrigerMonat++;
                break;
            case 12 :
                hoherMonat++;
                break;
            }
        if(februar == 1) {
            if(tag > 29) {
                JOptionPane.showMessageDialog(null,"Sie haben einen ungültigen Tag eingegeben, beginnen sie bitte von vorne!");
                System.exit( 0 );
            }
        }
        else{
            if(niedrigerMonat == 1) {
                if(tag > 30) {
                    JOptionPane.showMessageDialog(null,"Sie haben einen ungültigen Tag eingegeben, beginnen sie bitte von vorne!");
                    System.exit( 0 );
                }
            }
            else{
                if(hoherMonat == 1) {
                    if(tag > 31) {
                        JOptionPane.showMessageDialog(null,"Sie haben einen ungültigen Tag eingegeben, beginnen sie bitte von vorne!");
                        System.exit( 0 );
                    }
                }
            }
        }
        if(monat <= 2) {
            monat +=10;
            jahr--;
        }
        else{
            monat--;
            monat--;
        }
        a = jahr / 100;
        b = jahr % 100;
        c = ((26 * monat - 2) / 10 + tag + b + b / 4 + a / 4 - 2 * a) % 7;
        if(c < 0) {
            c +=7;
        }
        return c;
    }
}