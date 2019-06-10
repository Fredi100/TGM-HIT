import javax.swing.JOptionPane;
/**
 * Benutzt 
 */
public class A62_ZiffernSuchen{
    public static void main(String[] args){
        String text;
        char zeichen;
        int laenge, length, ziffern;
        boolean einKein;
        text = JOptionPane.showInputDialog(null,"Gibt einen Text ein.");
        laenge = text.length();
        length = laenge -1;
        ziffern = 0;
        while(length >= 0){
            zeichen = text.charAt(length);
            einKein = Text.istZiffer(zeichen);
            if(einKein == true){
                ziffern++;
            }
            length--;
        }
        JOptionPane.showMessageDialog(null,"Es sind insgesamt " + ziffern + " Ziffern in deinem Text.");
    }
}
