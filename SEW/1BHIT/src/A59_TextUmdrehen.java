import javax.swing.JOptionPane;
/**
 * Liest einen Text ein und gibt ihn mit Hilfe einer Methode verkehrt wieder aus.
 * 
 * @author Alfred Emsenhuber
 * @version 2012-5-3
 */
public class A59_TextUmdrehen{
    public static void main(String[] args){
        String eingabe, ausgabe;
        eingabe = JOptionPane.showInputDialog(null,"Bitte gib den Text ein der umgedreht werden soll.");
        ausgabe = Text.reverse(eingabe);
        JOptionPane.showMessageDialog(null,ausgabe);
    }
}