import javax.swing.JOptionPane;
/**
 * Liest eine Zahl ein und sorgt dafür das sie positiv ist.
 * 
 * @author Alfred Emsenhuber
 * @version 2012-15-3
 */
public class A46_Flussdiagramm {
    public static void main(String[] args) {
        int zahl;
        zahl = Einlesen.intIntra("Bitte eine Zahl eingeben.");
        if(zahl <0){
            zahl = zahl * (-1);
        }
        JOptionPane.showMessageDialog(null,"Die neue Zahl lautet: " + zahl);
    }
}