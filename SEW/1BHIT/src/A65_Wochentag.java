import javax.swing.JOptionPane;
/**
 * Beschreiben Sie hier die Klasse hzgf.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class A65_Wochentag {
    public static void main(String[] args){
        int c, jahr, monat, tag;
        jahr = Einlesen.intIntra("Gib bitte das heutige Jahr ein.");
        monat = Einlesen.intIntra("Gib bitte das heutigen Monat ein.");
        tag = Einlesen.intIntra("Gib bitte den heutigen Tag ein.");
        c = Datum.wochentag(jahr, monat, tag);
        switch(c){
            case 0 :
                JOptionPane.showMessageDialog(null,"Der " + tag + "." + monat + "." + jahr + " ist ein Sonntag.");
                break;
            case 1 :
                JOptionPane.showMessageDialog(null,"Der " + tag + "." + monat + "." + jahr + " ist ein Montag.");
                break;
            case 2 :
                JOptionPane.showMessageDialog(null,"Der " + tag + "." + monat + "." + jahr + " ist ein Dienstag.");
                break;
            case 3 :
                JOptionPane.showMessageDialog(null,"Der " + tag + "." + monat + "." + jahr + " ist ein Mittwoch.");
                break;
            case 4 :
                JOptionPane.showMessageDialog(null,"Der " + tag + "." + monat + "." + jahr + " ist ein Donnerstag.");
                break;
            case 5 :
                JOptionPane.showMessageDialog(null,"Der " + tag + "." + monat + "." + jahr + " ist ein Freitag.");
                break;
            case 6 :
                JOptionPane.showMessageDialog(null,"Der " + tag + "." + monat + "." + jahr + " ist ein Samstag.");
                break;
        }
    }
}