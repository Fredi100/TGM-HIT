import javax.swing.JOptionPane;
/**
 * Hilfsmethode mit mehreren Methoden um das Programmieren zu vereinfachen
 * 
 * @author Alfred Emsenhuber
 * @version 2012-3-7
 */
public class Einlesen {
    /**
     * Methode um eine <code>String</code> einzulesen und sie dann sofort in eine <code>short</code> umzuwandeln.
     * 
     * @param Zahl als <code>String</code>
     * @return Zahl als <code>short</code>
     * @author Alfred Emsenhuber
     * @version 2012-3-7
     */
    public static short shortIntra (String anzeige) {
        String eingabe;
        short zahl;
        eingabe = JOptionPane.showInputDialog(null,anzeige);
        zahl = Short.parseShort(eingabe);
        return zahl;
    }
    /**
     * Methode um eine <code>String</code> einzulesen und sie dann sofort in eine <code>byte</code> umzuwandeln.
     * 
     * @param Zahl als <code>String</code>
     * @return Zahl als <code>byte</code>
     * @author Alfred Emsenhuber
     * @version 2012-3-7
     */
    public static byte byteIntra (String anzeige) {
        String eingabe;
        byte zahl;
        eingabe = JOptionPane.showInputDialog(null,anzeige);
        zahl = Byte.parseByte(eingabe);
        return zahl;
    }
    /**
     * Methode um eine <code>String</code> einzulesen und sie dann sofort in eine <code>int</code> umzuwandeln.
     * 
     * @param Zahl als <code>String</code>
     * @return Zahl als <code>int</code>
     * @author Alfred Emsenhuber
     * @version 2012-3-7
     */
    public static int intIntra (String anzeige) {
        String eingabe;
        int zahl;
        eingabe = JOptionPane.showInputDialog(null,anzeige);
        zahl = Integer.parseInt(eingabe);
        return zahl;
    }
    /**
     * Methode um eine <code>String</code> einzulesen und sie dann sofort in eine <code>long</code> umzuwandeln.
     * 
     * @param Zahl als <code>String</code>
     * @return Zahl als <code>double</code>
     * @author Alfred Emsenhuber
     * @version 2012-3-7
     */
    public static long longIntra (String anzeige) {
        String eingabe;
        long zahl;
        eingabe = JOptionPane.showInputDialog(null,anzeige);
        zahl = Long.parseLong(eingabe);
        return zahl;
    }
    /**
     * Methode um eine <code>String</code> einzulesen und sie dann sofort in eine <code>float</code> umzuwandeln.
     * 
     * @param Zahl als <code>String</code>
     * @return Zahl als <code>float</code>
     * @author Alfred Emsenhuber
     * @version 2012-5-3
     */
    public static float floatIntra (String anzeige) {
        String eingabe;
        float zahl;
        eingabe = JOptionPane.showInputDialog(null,anzeige);
        zahl = Float.parseFloat(eingabe);
        return zahl;
    }
    /**
     * Methode um eine <code>String</code> einzulesen und sie dann sofort in eine <code>double</code> umzuwandeln.
     * 
     * @param Zahl als <code>String</code>
     * @return Zahl als <code>double</code>
     * @author Alfred Emsenhuber
     * @version 2012-5-3
     */
    public static double doubleIntra (String anzeige) {
        String eingabe;
        double zahl;
        eingabe = JOptionPane.showInputDialog(null,anzeige);
        zahl = Double.parseDouble(eingabe);
        return zahl;
    }
    /**
     * Methode um eine <code>String</code> einzulesen und sie dann sofort in eine <code>char</code> umzuwandeln.
     * 
     * @param Zeichen als <code>String</code>
     * @return Zeichen als <code>char</code>
     * @author Alfred Emsenhuber
     * @version 2012-3-7
     */
    public static char charIntra (String anzeige) {
        String eingabe;
        char zahl;
        eingabe = JOptionPane.showInputDialog(null,anzeige);
        zahl = eingabe.charAt(0);
        return zahl;
    }
}