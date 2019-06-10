package Sudoku_Extended.main;

import Sudoku_Extended.control.MainControl;

/**
 * Startet das Sudoku.
 * 
 * @author Niklas Hohenwarter
 * @author Alfred Emsenhuber
 * @version 2013-5-27
 */
public class Main{
	
	/**
	 * Startet das Sudoku indem es eine Instanz des Hauptcontrollers
	 * instanziert.
	 * 
	 * @param args
	 * @since 2013-5-27
	 */
	public static void main(String[] args) {
		
		MainControl control = new MainControl();
		control.showLevelSelection();
		
	}

}
