package Sudoku_Extended.control;

import Sudoku_Extended.model.Sudoku;
import Sudoku_Extended.view.MainFrame;

/**
 * MainControl, sorgt f�r den Ablauf des Programms
 * 
 * 
 * @author Niklas Hohenwarter
 * @author Alfred Emsenhuber
 * @version 2013-06-3
 */
public class MainControl {
	
	private MainFrame mainframe;
	private Sudoku sudoku;
	private LevelSelectionControl lscontrol;
	private SudokuControl scontrol;
	
	/**
	 * Konstruktor, erstellt ein MainFrame Objekt
	 * 
	 * @since 2013-5-27
	 */
	public MainControl() {
		mainframe = new MainFrame();
	}
	
	/**
	 * Sorgt daf�r, dass sich die Level auswahl �ffnet
	 * 
	 * @since 2013-5-27
	 */
	public void showLevelSelection() {
		
		lscontrol = new LevelSelectionControl(this);
		mainframe.getContentPane().removeAll();
		mainframe.add(lscontrol.getLs());
		mainframe.update();
	}
	/**
	 * Erstellt das ausgew�hlte Sudoku und Zeigt es an
	 * 
	 * @param level Das ausgew�hlte Level
	 * @since 2013-5-27
	 */
	public void showSudoku(int level){
		
		sudoku = new Sudoku(level);
		scontrol = new SudokuControl(this, sudoku);
		mainframe.getContentPane().removeAll();
		mainframe.add(scontrol.getSudokuView());
		mainframe.update();
		
	}
	
	/**
	 * Getter-Methode f�r das mainframe
	 * 
	 * @return mainframe, das Hauptframe indem alles angezeigt wird
	 * @since 2013-5-27
	 */
	public MainFrame getMainframe() {
		return mainframe;
	}

}
