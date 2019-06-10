import javax.swing.JOptionPane;
/**
 * Ein Rechentrainer
 * 
 * @author Alfred Emsenhuber
 * @version 2011-15-3
 */
public class ZA_Rechentrainer {
    public static void main(String[] args){
        String eingabe, addieren, subtrahieren, dividieren, multiplizieren, potenzieren;
        int zahl1, zahl2 ,zahl3, ergebnis, eigeneWahl, richtig, falsch, wiederholen;
        double ergebnis2;
        falsch = 0;
        richtig = 0;
        wiederholen = 1;
        eingabe = JOptionPane.showInputDialog(null,"Wähle die Rechenart.\nAddition, Subtrakion, Multiplikation, Division, Potenzieren");
        if(eingabe.equals ("Addition")){ //Startet die Addition-Beispiele
            while(wiederholen != 0){
                zahl1 = Mathematik.zufall(1, 100);
                zahl2 = Mathematik.zufall(1, 100);
                zahl3 = Mathematik.zufall(1, 100);
                ergebnis = zahl1 + zahl2 + zahl3;
                eigeneWahl = Einlesen.intIntra("Wie lautet das Ergebnis von " + zahl1 + " + " + zahl2 + " + " + zahl3 + "?");
                while(ergebnis != eigeneWahl){
                    falsch++;
                    eigeneWahl = Einlesen.intIntra("Leider falsch, Probiers nocheinmal");
                }
                JOptionPane.showMessageDialog(null,"Richtig  :)");
                richtig++;
                wiederholen = Einlesen.intIntra("Möchtest du noch eine Aufagabe?\n    Ja(1)/Nein(0)");
            }
        }
        else{
            if(eingabe.equals ("Subtraktion")){ //Startet die Subtraktion-Beispiele
                while(wiederholen != 0){
                    zahl1 = Mathematik.zufall(1, 100);
                    zahl2 = Mathematik.zufall(1, 100);
                    zahl3 = Mathematik.zufall(1, 100);
                    ergebnis = zahl1 - zahl2 - zahl3;
                    eigeneWahl = Einlesen.intIntra("Wie lautet die Differenz von " + zahl1 + " - " + zahl2 + " - " + zahl3 + "?");
                    while(ergebnis != eigeneWahl){
                        falsch++;
                        eigeneWahl = Einlesen.intIntra("Leider falsch, Probiers nocheinmal");
                    }
                    JOptionPane.showMessageDialog(null,"Richtig  :)");
                    richtig++;
                    wiederholen = Einlesen.intIntra("Möchtest du noch eine Aufagabe?\n    Ja(1)/Nein(0)");
                }
            }
            else{
                if(eingabe.equals ("Multiplikation")){ //Startet die Multiplikation-Beispiele
                    while(wiederholen != 0){
                        zahl1 = Mathematik.zufall(1, 10);
                        zahl2 = Mathematik.zufall(1, 10);
                        ergebnis = zahl1 * zahl2;
                        eigeneWahl = Einlesen.intIntra("Wie lautet das Ergebnis von " + zahl1 + " * " + zahl2 + "?");
                        while(ergebnis != eigeneWahl){
                            falsch++;
                            eigeneWahl = Einlesen.intIntra("Leider falsch, Probiers nocheinmal");
                        }
                        JOptionPane.showMessageDialog(null,"Richtig  :)");
                        richtig++;
                        wiederholen = Einlesen.intIntra("Möchtest du noch eine Aufagabe?\n    Ja(1)/Nein(0)");
                    }
                }
                else{
                    if(eingabe.equals ("Division")){ //Startet die Division-Beispiele
                        while(wiederholen != 0){
                            zahl1 = Mathematik.zufall(10, 200);
                            zahl2 = Mathematik.zufall(1, 10);
                            ergebnis = zahl1 / zahl2;
                            eigeneWahl = Einlesen.intIntra("Wie lautet das Ergebnis von " + zahl1 + " / " + zahl2 + "?");
                            while(ergebnis != eigeneWahl){
                                falsch++;
                                eigeneWahl = Einlesen.intIntra("Leider falsch, Probiers nocheinmal");
                            }
                            JOptionPane.showMessageDialog(null,"Richtig  :)");
                            richtig++;
                            wiederholen = Einlesen.intIntra("Möchtest du noch eine Aufagabe?\n    Ja(1)/Nein(0)");
                        }
                    }
                    else{
                        if(eingabe.equals ("Potenzieren")){ //Startet die Potenz-Beispiele
                            while(wiederholen != 0){
                                zahl1 = Mathematik.zufall(1, 10);
                                zahl2 = Mathematik.zufall(1, 3);
                                ergebnis2 = Mathematik.hoch(zahl1, zahl2);
                                eigeneWahl = Einlesen.intIntra("Wie lautet das Ergebnis von " + zahl1 + " hoch " + zahl2 + "?");
                                while(ergebnis2 != eigeneWahl){
                                    falsch++;
                                    eigeneWahl = Einlesen.intIntra("Leider falsch, Probiers nocheinmal");
                                }
                                JOptionPane.showMessageDialog(null,"Richtig :)");
                                richtig++;
                                wiederholen = Einlesen.intIntra("Möchtest du noch eine Aufagabe?\n    Ja(1)/Nein(0)");
                            }
                        }
                    }
                }
            }
        }
    }
}