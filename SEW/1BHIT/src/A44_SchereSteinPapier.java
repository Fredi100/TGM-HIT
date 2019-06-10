import javax.swing.JOptionPane;
/**
 * Schere-Stein-Papier Spiel
 * 
 * @author Alfred Emsenhuber
 * @version 2012-3-11
 */
public class A44_SchereSteinPapier {
    public static void main(String[] args) {
        String eingabe, spielerText, computerText;
        int spielerWahl, zufall, wiederholen, gewonnenComputer, gewonnenSpieler, unentschieden;
        double zufallDezimal;
        wiederholen = 1;
        unentschieden = 0;
        gewonnenSpieler = 0;
        gewonnenComputer = 0;
        spielerText = "0";
        computerText = "0";
        while(wiederholen != 0){
            spielerWahl = Einlesen.intIntra("Bitte gib 1 für Schere, 2 für Stein und 3 für Papier ein.");
            zufallDezimal = Math.random();
            zufallDezimal = zufallDezimal * 3 + 1;
            zufall = (int)zufallDezimal;
            if(spielerWahl == 1){
                spielerText = "Schere";
            }
            if(spielerWahl == 2){
                spielerText = "Stein";
            }
            if(spielerWahl == 3){
                spielerText = "Papier";
            }
            if(zufall == 1){
                computerText = "Schere";
            }
            if(zufall == 2){
                computerText = "Stein";
            }
            if(zufall == 3){
                computerText = "Papier";
            }
            if(spielerWahl == zufall) {
                JOptionPane.showMessageDialog(null,"Spieler: " + spielerText + ", Computer: " + computerText + " => Unentschieden");
                unentschieden++;
            }
            else{
                if(spielerWahl > zufall){
                    if(spielerWahl == 3){
                        if(zufall == 1){
                            JOptionPane.showMessageDialog(null,"Spieler: " + spielerText + ", Computer: " + computerText + " => Computer hat gewonnen");
                            gewonnenComputer++;
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Spieler: " + spielerText + ", Computer: " + computerText + " => Spieler hat gewonnen");
                            gewonnenSpieler++;
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Spieler: " + spielerText + ", Computer: " + computerText + " => Spieler hat gewonnen");
                        gewonnenSpieler++;
                    }
                }
                else{
                    if(zufall == 3){
                        if(spielerWahl == 1){
                            JOptionPane.showMessageDialog(null,"Spieler: " + spielerText + ", Computer: " + computerText + " => Spieler hat gewonnen");
                            gewonnenSpieler++;
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Spieler: " + spielerText + ", Computer: " + computerText + " => Computer hat gewonnen");
                            gewonnenComputer++;
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Spieler: " + spielerText + ", Computer: " + computerText + " => Computer hat gewonnen");
                        gewonnenComputer++;
                    }
                }
            }
            wiederholen = Einlesen.intIntra("Du hast " + gewonnenSpieler + " mal gewonnen, " + gewonnenComputer + " mal verloren und hattest " + unentschieden + " mal unentschieden.\nMöchtest du erneut spielen?(1 = Ja/0 = Nein)");
        }
    }
}