import javax.swing.JOptionPane;
/**
 * Liest deine Noten ein berechnet den Notendurchschnitt und sagt dir wie gut du bestanden hast.
 * 
 * @author Alfred Emsenhuber
 * @version 2012-3-1
 */
public class P03_Schulerfolg {
    public static void main (String[] args) {
        String eingabe;
        double noten = 0, zahl, einser = 0, zweier = 0, dreier = 0, vierer = 0, fuenfer = 0, durchschnitt;
        int zaehlen;
        zaehlen = 1;
        while(zaehlen != 0) {
            eingabe = JOptionPane.showInputDialog(null,"Bitte gib die Note ein.");
            zahl = Double.parseDouble(eingabe);
            if(zahl == 0){
                zaehlen--;
            }
            else{
                if(zahl == 1){
                    einser++;
                }
                else{
                    if(zahl == 2){
                        zweier++;
                    }
                    else{
                        if(zahl == 3){
                            dreier++;
                        }
                        else{
                            if(zahl == 4){
                                vierer++;
                            }
                            else{
                                fuenfer++;
                            }
                        }
                    }
                }
            }
            noten++;
        }
        durchschnitt = einser + 2 * zweier + 3 * dreier + 4 * vierer + 5 * fuenfer;
        durchschnitt = durchschnitt / noten;
        if(fuenfer > 0){
            JOptionPane.showMessageDialog(null,"Nicht bestanden,\nDu hast " + einser + " einser\n" + zweier + " zweier\n" + dreier + " dreier\n" + vierer + "vierer\n" + fuenfer + " fünfer\nDein Notendurchschnitt beträgt " + durchschnitt);
        }
        else{
            if(vierer > 0){
                JOptionPane.showMessageDialog(null,"Bestanden,\nDu hast " + einser + " einser\n" + zweier + " zweier\n" + dreier + " dreier\n" + vierer + "vierer\n" + fuenfer + " fünfer\nDein Notendurchschnitt beträgt " + durchschnitt);
            }
            else{
                if(durchschnitt <= 1.5){
                    JOptionPane.showMessageDialog(null,"Mit ausgezeichnetem Erfolg bestanden,\nDu hast " + einser + " einser\n" + zweier + " zweier\n" + dreier + " dreier\n" + vierer + "vierer\n" + fuenfer + " fünfer\nDein Notendurchschnitt beträgt " + durchschnitt);
                }
                else{
                    if(durchschnitt <= 2){
                        JOptionPane.showMessageDialog(null,"Mit gutem Erfolg bestanden,\nDu hast " + einser + " einser\n" + zweier + " zweier\n" + dreier + " dreier\n" + vierer + "vierer\n" + fuenfer + " fünfer\nDein Notendurchschnitt beträgt " + durchschnitt);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Bestanden,\nDu hast " + einser + " einser\n" + zweier + " zweier\n" + dreier + " dreier\n" + vierer + "vierer\n" + fuenfer + " fünfer\nDein Notendurchschnitt beträgt " + durchschnitt);
                    }
                }
            }
        }
    }
}
                        