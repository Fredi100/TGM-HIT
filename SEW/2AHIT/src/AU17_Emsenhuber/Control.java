package AU17_Emsenhuber;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

/**
 * Control kümmert sich um die interaktion zwischen den Klassen View und Model
 * 
 * @author xXFredi100Xx
 * @version 2014-03-21
 */
public class Control implements ActionListener{
	Model m;
	View v;
	
	/**
	 * Wird benötigt da sonst der Konstruktor Control() nichtgewollt aufgerufen wird
	 */
	public Control(String test){
		
	}
	
	/**
	 * Erzeugt ein Model und ein View Objekt und bearbeitet dann das View Objekt
	 */
	public Control(){
		m = new Model();
		v = new View(this);
		v.addButtons();
		v.addButtonsPC();
		v.addGame();
		v.addAusgabe();
		v.addEast();
		v.addAlles();
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		v.pack();
		v.setResizable(false);
		v.setLocation((int) (v.width/2)-(v.getWidth()/2), (int) ((v.height/2)-(v.getHeight()/2)));	//Plaziert das Spiel in der Mitte des Bildschirms
		v.setVisible(true);
	}
	
	/**
	 * Nachdem der Spieler eine Auswahl getroffen hat wird diese Methode ausgeführt.
	 * Teilt dem Model mit das der Computer eine Auswahl treffen soll.
	 * Übergibt diese Auswahl und die des Spieler an das Model welches dann den Gewinner ermittelt
	 * Teilt dem View mit welchen Button der PC ausgewählt hat.
	 * Sagt dem View wer der Gewinner ist.
	 * Übergiebt dem View die neuen Ergebnisse
	 * 
	 * @param auswahlPlayer Die Auswahl die der Spieler getroffen hat
	 */
	protected void run(int auswahlPlayer){
		int auswahlPc = m.getAuswahl();
		int winner = m.selectWinner(auswahlPlayer, auswahlPc);
		v.selectButtonPC(auswahlPc);
		v.selectWinner(winner);
		v.setText(m.getWins(),m.getDraws(),m.getLoses(),m.getGames());
	}
	
	/**
	 * Überprüft welcher Button gedrückt wurde und startet dann die run Methode sofern eine Auswahl vom Spieler getroffen wurde
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
		}else if(ae.getActionCommand().equals(View.NEUSTART)){
			v.resetRound();
		}
	}
}
