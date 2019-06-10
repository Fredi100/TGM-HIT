import javax.swing.JOptionPane;
/**
 * Schere-Stein-Papier Spiel
 * 
 * @author Alfred Emsenhuber
 * @version 2012-3-11
 */
public class A39_ScherSteinPapier {
    public static void main(String[] args) {
        String eingabe;
        int spielerWahl, zufall, wiederholen, gewonnenComputer, gewonnenSpieler, unentschieden;
        double zufallDezimal;
        wiederholen = 1;
        unentschieden = 0;
        gewonnenSpieler = 0;
        gewonnenComputer = 0;
        while(wiederholen != 0){
            eingabe = JOptionPane.showInputDialog(null,"Bitte gib 1 für Schere, 2 für Stein und 3 für Papier ein.");
            spielerWahl = Integer.parseInt(eingabe);
            zufallDezimal = Math.random();
            zufallDezimal = zufallDezimal * 3 + 1;
            zufall = (int)zufallDezimal;
            if(spielerWahl == zufall) {
                JOptionPane.showMessageDialog(null,"Unentschieden");
                unentschieden++;
            }
            else{
                if(spielerWahl > zufall){
                    if(spielerWahl == 3){
                        if(zufall == 1){
                            JOptionPane.showMessageDialog(null,"Computer hat gewonnen");
                            gewonnenComputer++;
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Spieler hat gewonnen");
                            gewonnenSpieler++;
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Spieler hat gewonnen");
                        gewonnenSpieler++;
                    }
                }
                else{
                    if(zufall == 3){
                        if(spielerWahl == 1){
                            JOptionPane.showMessageDialog(null,"Spieler hat gewonnen");
                            gewonnenSpieler++;
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Computer hat gewonnen");
                            gewonnenComputer++;
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Computer hat gewonnen");
                        gewonnenComputer++;
                    }
                }
            }
            eingabe = JOptionPane.showInputDialog(null,"Du hast " + gewonnenSpieler + " mal gewonnen, " + gewonnenComputer + " mal verloren und hattest " + unentschieden + " mal unentschieden.\nMöchtest du erneut spielen?(1 = Ja/0 = Nein)");
            wiederholen = Integer.parseInt(eingabe);
        }
    }
}