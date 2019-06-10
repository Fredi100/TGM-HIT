package Sudoku_Extended.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import Sudoku_Extended.model.Sudoku;
import Sudoku_Extended.view.SudokuView;

/**
 * Controller f�r das Sudoku
 * 
 * @author Niklas Hohenwarter
 * @author Alfred Emsenhuber
 * @version 2013-06-03
 */
public class SudokuControl {
	
	@SuppressWarnings("unused")
	private MainControl control;
	private SudokuView sudokuView;
	private SudokuEingabeControl secontrol;
	private LogoControl lcontrol = new LogoControl();
	private TimerControl tcontrol;
	private Sudoku sudoku;

	/**
	 * Initialisiert alle benn�togten Teile des Sudokus
	 * 
	 * @param control, der main-Controller, der alles verwaltet
	 * @param sudoku, das Logik-Objekt des Sudokus
	 * @since 2013-5-27
	 */
	public SudokuControl(MainControl control, Sudoku sudoku) {
		this.control = control;
		this.sudoku = sudoku;
		sudokuView = new SudokuView();
		tcontrol = new TimerControl();
		secontrol = new SudokuEingabeControl(sudoku, sudokuView, tcontrol);
		setAngabe();
		addListener();
		sudokuView.addEastPanel(secontrol.getEingabePanel());
		sudokuView.addEastPanel(tcontrol.getTimerView());
		sudokuView.addEastPanel(lcontrol.getLogoView());
		tcontrol.start();
	}

	/**
	 * Setzt die Angabe auf das Sudokufeld
	 * 
	 * @since 2013-5-27
	 */
	private void setAngabe() {
	
		for(int i = 0; i < 9; i++){
			
			char[] littleField = sudoku.getLittleField(i);
			
			for(int j = 0; j < 9; j++){
				if(!(littleField[j] == ' ')){
					sudokuView.setZahlenText(i, j, littleField[j]);
					sudokuView.setAngabeColor(i, j);
				}
				
			}
		}
		
	}

	/**
	 * F�gt Listener auf das Sudokufeld hinzu
	 * 
	 * @since 2013-5-27
	 */
	private void addListener() {
		sudokuView.setZahlenListener(new ZahlenListener());
	}
	
	/**
	 * ActionListener f�r das Sudoku-Feld
	 * 
	 * 
	 * @author Niklas Hohenwarter
	 * @author Alfred Emsenhuber
	 * @version 2013-5-27
	 */
	public class ZahlenListener implements ActionListener{
		
		/**
		 * Action Listener f�r die einzelnen Sudoku Buttons. Sobald ein Button gedr�ckt wird
		 * der nicht zur Angabe geh�rt, wird die Eingabe aktiviert.
		 * 
		 * @since 2013-5-27
		 */
		@Override
		public void actionPerformed(ActionEvent arg0) {
			String actionCommand = arg0.getActionCommand();
			Integer[] location = new Integer[2];
			location[0] = Integer.parseInt("" + actionCommand.charAt(0));
			location[1] = Integer.parseInt("" + actionCommand.charAt(1));
			
			sudokuView.setActiveColor(location[0], location[1],false);
			secontrol.showSudokuEingabe(arg0.getActionCommand(), true);
			
		}
		
	}
	/**
	 * Gibt die Sudoku-View zur�ck
	 * 
	 * @return das komplette Sudoku
	 */
	public JPanel getSudokuView() {
		return sudokuView.getSudokuView();
	}

}
