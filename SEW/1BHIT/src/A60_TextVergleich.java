import javax.swing.JOptionPane;
/**
 * 
 * 
 * @author Alfred Emsenhuber
 * @version 2012-5-30
 */
public class A60_TextVergleich{
    public static void main(String[] args){
        String wort1, wort2;
        boolean einKein;
        einKein = false;
        wort1 = JOptionPane.showInputDialog(null,"Bitte gib das erste Wort ein.");
        wort2 = Text.reverse(wort1);
        einKein = Text.equals(wort1, wort2);
        if(einKein == true){
            JOptionPane.showMessageDialog(null,"Das eingegebene Wort ist ein Palindrom");
        }
        else{
            JOptionPane.showMessageDialog(null,"Das eingegebene Wort ist kein Palindrom");
        }
    }
}