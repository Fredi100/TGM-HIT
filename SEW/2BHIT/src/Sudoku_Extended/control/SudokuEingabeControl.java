package Sudoku_Extended.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Sudoku_Extended.model.Sudoku;
import Sudoku_Extended.view.SudokuEingabe;
import Sudoku_Extended.view.SudokuView;

/**
 * SudokuEingabeControll zur Steuerung der Eingaben am Sudoku
 * 
 * @author Niklas Hohenwarter
 * @auhtor Alfred Emsenhuber
 * @version 2013-06-03
 */
public class SudokuEingabeControl {

	private Sudoku sudoku;
	private SudokuEingabe seingabe;
	private String actionCommand;
	private SudokuView sudokuView;
	private TimerControl tcontrol;
	
	/**
	 * Konstruktor, setzt die Attribute mit den �bergeben Objekten
	 * 
	 * @param sudoku Das ausgew�hlte Sudoku
	 * @param sudokuView Das Sudoku als Sichtbares Objekt
	 * @param tcontrol Der TimerControl zur steuerung der Stoppuhr
	 */
	public SudokuEingabeControl(Sudoku sudoku, SudokuView sudokuView, TimerControl tcontrol) {
		this.tcontrol = tcontrol;
		this.sudoku = sudoku;
		this.sudokuView = sudokuView;
		seingabe = new SudokuEingabe();
		addListener();
		
	}
	
	/**
	 * Setzt die ZahlEingabeListener
	 * 
	 */
	private void addListener() {
		
		seingabe.setZahlEingabeListener(new ZahlEingabeListener());
		
	}
	
	/**
	 * ZahlEingabeListener, Sorgt daf�r das die Eingabe funktioniert und �berpr�ft bei jeder Eingabe ob das Sudoku gel�st wurde
	 *
	 * @author Niklas Hohenwarter
	 * @author Alfred Emsenhuber
	 * @version 2013-5-27
	 */
	public class ZahlEingabeListener implements ActionListener{
		
		/**
		 * Setzt einen Wert auf das zuvor ausgew�hlte Sudoku-Feld. Dannach wird �berpr�ft ob man gewonnen hat.
		 * Falls dies der fall ist, wird der Timer angehalten
		 * 
		 * @version 2013-5-27
		 */
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			Integer[] location = getPressedButton();
			char wert = arg0.getActionCommand().charAt(0);
			
			sudoku.schreiben(location[0], location[1], wert);
			sudokuView.setZahlenText(location[0], location[1], wert);
			sudokuView.setActiveColor(location[0], location[1], true);
			seingabe.setActivated(false);
			
			if(sudoku.gewonnen()){		
				tcontrol.stop();
				JOptionPane.showMessageDialog(null, "Du hast Gewonnen! :3\nDu hast " + tcontrol.getTime() + " gebraucht!");
				System.exit(0);
			}
			
		}
		
	}
	
	/**
	 * Setzt die �bergeben Buttons als benutzbar bzw. nicht benutzbar
	 * 
	 * @param actionCommand	Der ActionCommand der einzelnen Buttons
	 * @param state Der Status ob der Button benutzbar ist oder nicht
	 * @since 2013-5-27
	 */
	public void showSudokuEingabe(String actionCommand, boolean state) {
		
		seingabe.setActivated(state);
		this.actionCommand = actionCommand;
		
	}
	
	/**
	 * �bergibt die Postion des gedr�ckten Button
	 * 
	 * @return location, enth�llt x und y position des Buttons
	 * @since 2013-5-27
	 */
	public Integer[] getPressedButton(){
		
		Integer[] location = new Integer[2];
		
		for(int i = 0; i < actionCommand.length(); i++){
			location[i] = Integer.parseInt("" + actionCommand.charAt(i));
		}
		
		return location;
		
	}
	
	/**
	 * Getter-Methode f�r seingabe
	 * 
	 * @return seingabe das Eingabefeld
	 * @since 2013-5-27
	 */
	public JPanel getEingabePanel() {
		return seingabe.getEingabePanel();
	}

}
