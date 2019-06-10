import javax.swing.JOptionPane;
/**
 * Dieses Programm berechnet den Winkel eines Radianten und gibt beide Werte zum Schluss aus.
 * 
 * @author Alfred Emsenhuber 
 * @version 13.12.2011
 */
public class A23_RadiantAufGrad {
  public static void main(String[] args) {
    String eingabe;
    double radiant,radiantzahl,winkel;
    eingabe = JOptionPane.showInputDialog (null, "Bitten geben sie einen Radianten ein."); 
    radiant = Double.parseDouble(eingabe);
    winkel = Math.toDegrees(radiant);
    JOptionPane.showMessageDialog (null, "Der Radiant ist : " + radiant + "\n Der Winkel beträgt: " + winkel);
  }
}