package AU17_Emsenhuber;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ControlExtended kümmert sich um die interaktion zwischen den Klassen ViewExtended und ModelExtended
 *
 * @author xXFredi100Xx
 * @version 2014-03-21
 */
public class ControlExtended extends Control implements ActionListener{
	ViewExtended v;
	
	/**
	 * Erzeugt ein ModelExtended und ein ViewExtended Objekt und bearbeitet dann das ViewExtended
	 */
	public ControlExtended(){
		super("Test");	//Muss leider sein da sonst ein Control Objekt miterzeugt wird welches dann ein ungewolltest Fenster erstellt.
		m = new ModelExtended();
		v = new ViewExtended(this);
		
		v.addButtons();
		v.addButtonsPC();
		v.addGame();
		v.addAusgabe();
		v.addEast();
		v.addAlles();
		v.pack();
		v.setResizable(false);
		v.setLocation((int) (v.width/2)-(v.getWidth()/2), (int) ((v.height/2)-(v.getHeight()/2)));	//Plaziert das Spiel in der Mitte des Bildschirms
		v.setVisible(true);
	}
	
	/**
	 * Nachdem der Spieler eine Auswahl getroffen hat wird diese Methode ausgeführt.
	 * Sie teilt dem Model mit das der Computer eine Auswahl treffen soll, übergibt diese und die des Spieler an das Model welches dann den Gewinner ermittelt.
	 * Danach teilt es dem View mit welchen Button der PC ausgewählt hat und wer der Gewinner ist.
	 * Zum Schluss werden dem View die neuen Ergebnisse übermittelt.
	 */
	@Override
	protected void run(int auswahlPlayer){
		int auswahlPc = m.getAuswahl();
		int winner = m.selectWinner(auswahlPlayer, auswahlPc);
		v.selectButtonPC(auswahlPc);
		v.selectWinner(winner);
		v.setText(m.getWins(),m.getDraws(),m.getLoses(),m.getGames());
	}
	
	/**
	 * Überprüft welcher Button gedrückt wurde und führt dann die jeweilige Methode mit dem korrekten Paramter aus
	 */
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand().equals(View.SCHERE)){
			v.selectButton(1);
			run(1);
		}else if(ae.getActionCommand().equals(View.STEIN)){
			v.selectButton(2);
			run(2);
		}else if(ae.getActionCommand().equals(View.PAPIER)){
			v.selectButton(3);
			run(3);
		}else if(ae.getActionCommand().equals(ViewExtended.LIZARD)){
			v.selectButton(4);
			run(4);
		}else if(ae.getActionCommand().equals(ViewExtended.SPOCK)){
			v.selectButton(5);
			run(5);
		}else if(ae.getActionCommand().equals(View.NEUSTART)){
			v.resetRound();
		}
	}
}
