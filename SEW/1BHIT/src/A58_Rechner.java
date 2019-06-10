import javax.swing.JOptionPane;
/**
 * Ein einfacher Taschenrechner
 * 
 * @author Alfred Emsenhuber
 * @version 2012.4.26
 */
public class A58_Rechner{
    public static void main(String[] args){
        String rechenart, ausgabe;
        int zahl1, zahl2, ergebnis, rest;
        rechenart = JOptionPane.showInputDialog(null,"Bitte wähle die Rechenart aus","+/-/*/:");
        if(rechenart.equals("+")){
            zahl1 = Einlesen.intIntra("Bitte gib die erste Zahl ein.");
            zahl2 = Einlesen.intIntra("Bitte gib die Zahl ein mit der die erste addiert werden soll.");
            ergebnis = zahl1 + zahl2;
            JOptionPane.showMessageDialog(null,"Das Ergebnis lautet: " + ergebnis);
        }
        else{
            if(rechenart.equals("-")){
                zahl1 = Einlesen.intIntra("Bitte gib die erste Zahl ein.");
                zahl2 = Einlesen.intIntra("Bitte gib die Zahl ein die von der ersten abgezogen werden soll.");
                ergebnis = zahl1 - zahl2;
                JOptionPane.showMessageDialog(null,"Das Ergebnis lautet: " + ergebnis);
            }
            else{
                if(rechenart.equals("*")){
                    zahl1 = Einlesen.intIntra("Bitte gib die erste Zahl ein.");
                    zahl2 = Einlesen.intIntra("Bitte gib die Zahl mit der die erste multipliziert werden soll.");
                    ergebnis = zahl1 * zahl2;
                    JOptionPane.showMessageDialog(null,"Das Ergebnis lautet: " + ergebnis);
                }
                else{
                    if(rechenart.equals(":")){
                        zahl1 = Einlesen.intIntra("Bitte gib die erste Zahl ein.");
                        zahl2 = Einlesen.intIntra("Bitte gib die Zahl durch die die erste dividiert  werden soll.");
                        if(zahl2 < 0){
                            ergebnis = zahl1 / zahl2;
                            rest = zahl1 % zahl2;
                            JOptionPane.showMessageDialog(null,"Das Ergebnis lautet: " + ergebnis + "\n und der Rest ist: " + rest );
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Du kannst nicht durch 0 dividieren!");
                        }
                    }
                    else{
                    }
                }
            }
        }
    }
}