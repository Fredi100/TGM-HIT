package Sudoku_Extended.control;


import javax.swing.JPanel;

import Sudoku_Extended.model.Timer;
import Sudoku_Extended.view.TimerView;

/**
 * TimerControl zur steuerung der Stoppuhr
 * 
 * @author Niklas Hohenwarter
 * @author Alfred Emsenhuber
 * @version 2013-06-03
 */
public class TimerControl {

	private TimerView tview;
	private Timer timer;
	
	/**
	 * Konstruktor, erstellt ein TimerView Objekt ein Timer Objekt und setzt tview als das Label von timer
	 * 
	 * @since 2013-5-27
	 */
	public TimerControl() {
		tview = new TimerView();
		timer = new Timer();
		timer.setLabel(tview.getActualTimeLabel());
	}
	
	/**
	 * Getter-Methode f�r tview
	 * 
	 * @return tview
	 * @since 2013-5-27
	 */
	public JPanel getTimerView(){
		return tview.getTimerView();
	}
	
	/**
	 * Startet den Timer
	 * 
	 * @since 2013-5-27
	 */
	public void start(){
		timer.start();
	}
	
	/**
	 * Stoppt den Timer
	 * 
	 * @since 2013-5-27
	 */
	public void stop(){	
		timer.cancel();
	}
	
	/**
	 * Getter-Methode f�r die Zeit der Stoppuhr
	 * 
	 * @return timer.getTime() Die derzeitige Uhrzeit der Stoppuhr
	 * @since 2013-5-27
	 */
	public String getTime(){
		return timer.getTime();
	}
	
	

}
