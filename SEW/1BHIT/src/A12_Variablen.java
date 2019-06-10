import javax.swing.JOptionPane;
/**
 * Diese klasse erzeugt Variablen von allen sieben Typen.
 * 
 * @author Alfred Emsenhuber
 * @version 2011-10-19
 */

public class A12_Variablen {
    public static void main(String[] args) {
        byte zahlByte;
        short zahlShort;
        int zahlInt;
        long zahlLong;
        double zahlDouble;
        float zahlFloat;
        char zeichenChar;
        boolean zustandBoolean;
        String textString;
        zahlByte = 120;
        zahlShort = 3700;
        zahlInt = -65535;
        zahlLong = 234908235668345736L;
        zahlDouble = 3242.363;
        zahlFloat = 45.23F;
        zeichenChar = 65;
        zustandBoolean = true;
        textString = "Anscheinend funktioniert der Befehl.";
        JOptionPane.showMessageDialog(null, "Der Byte-Wert beträgt " + zahlByte);
        JOptionPane.showMessageDialog(null, "Der Short-Wert beträgt " + zahlShort);
        JOptionPane.showMessageDialog(null, "Der Int-Wert beträgt " + zahlInt);
        JOptionPane.showMessageDialog(null, "Der Long-Wert beträgt " + zahlLong);
        JOptionPane.showMessageDialog(null, "Der Double-Wert beträgt " + zahlDouble);
        JOptionPane.showMessageDialog(null, "Der Float-Wert beträgt " + zahlFloat);
        JOptionPane.showMessageDialog(null, "Der Char-Zeichen lautet " + zeichenChar);
        JOptionPane.showMessageDialog(null, "Der Boolean-Zustand lautet " + zustandBoolean);
        JOptionPane.showMessageDialog(null, "Der String-Text lautet : " + textString);
    }
}
        
        