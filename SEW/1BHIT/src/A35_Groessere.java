import javax.swing.JOptionPane;
/**
 * Bestimmt die größere zweier eingegebener Zahlen
 * @author Alfred Emsenhuber
 * @version 2012-02-24
 */
public class A35_Groessere{
   public static void main(String[] args){
       //Deklaration
       String eingabe1, eingabe2;
       int zahl1, zahl2, groesser;
       eingabe1 = JOptionPane.showInputDialog(null, "Gib eine Zahl ein!"); //Liest die erste Zahl als Text ein
       eingabe2 = JOptionPane.showInputDialog(null, "Gib eine Zahl ein!"); //Liest die zweite Zahl ein
       zahl1 = Integer.parseInt(eingabe1); //Wandelt eingabe1 in eine Zahl um
       zahl2 = Integer.parseInt(eingabe2); //Wandelt eingabe2 in eine Zahl um
       if(zahl1<zahl2){
           groesser = zahl2;
       }else{
            groesser = zahl1;
       }
       // Ausgabe
       JOptionPane.showMessageDialog(null, "Zahl1: " + zahl1 + "\nZahl2: " + zahl2 + "\ngrößere Zahl: " + groesser);
    }
}
