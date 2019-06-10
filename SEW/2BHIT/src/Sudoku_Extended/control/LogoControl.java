package Sudoku_Extended.control;

import javax.swing.JPanel;

import Sudoku_Extended.view.LogoView;

/**
 * LogoControl zum steuern des Logos
 * 
 * @author Niklas Hohenwarter
 * @author Alfred Emsenhuber
 * @version 2013-06-3
 */
public class LogoControl {
	
	private LogoView lview;
	
	/**
	 * Konstruktor, erstellt ein LogoView Objekt
	 * 
	 * @since 2013-5-27
	 */
	public LogoControl() {
		lview = new LogoView();
	}
	
	/**
	 * Getter-Methode f�r die Logo-View (JPanel)
	 * 
	 * @return lview, Panel mit dem Logo
	 * @since 2013-5-27
	 */
	public JPanel getLogoView(){
		return lview.getLogoView();
	}
	

}
