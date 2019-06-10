package Sudoku_Extended.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Sudoku_Extended.view.LevelSelection;

/**
 * Controler f�r die Levelwahl
 * 
 * @author Niklas Hohenwarter
 * @author Alfred Emsenhuber
 * @version 2013-5-27
 */
public class LevelSelectionControl{
	
	private LevelSelection ls;
	private MainControl control;
	
	/**
	 * Initialisiert den Level-Selection Controller
	 * 
	 * @param control
	 * @since 2013-5-27
	 */
	public LevelSelectionControl(MainControl control) {
		this.control = control;
		ls = new LevelSelection();
		addListener();
	}
	
	/**
	 * F�gt LevelSelection den LevelButtonListener hinzu
	 * 
	 * @since 2013-5-27
	 */
	public void addListener() {
		ls.setLevelButtonsListener(new LevelButtonListener());
	}
	
	/**
	 * Der LevelButtonListener sagt control welches Sudoku angezeigt werden soll, jenachdem welcher Button gedr�ckt wurde.
	 * 
	 * @since 2013-5-27
	 */
	public class LevelButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			control.showSudoku(Integer.parseInt(e.getActionCommand()));
		}
		
	}
	
	/**
	 * Getter-Methode f�r die Level-Selection View
	 * 
	 * @return ls
	 * @since 2013-5-27
	 */
	public LevelSelection getLs() {
		return ls;
	}
	
}
