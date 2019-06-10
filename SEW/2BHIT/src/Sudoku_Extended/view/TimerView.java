package Sudoku_Extended.view;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * Erstellt ein Panel mit einem Label darauf indem sp�ter die
 * Spielzeit angezeigt werden wird.
 * 
 * @author Niklas Hohenwarter
 * @author Alfred Emsenhuber
 * @since 2013-5-27
 */
@SuppressWarnings("serial")
public class TimerView extends JPanel {

	private JLabel infoLabel;
	
	/**
	 * Initialisiert das Panel indem die daf�r zust�ndige Methode aufgerufen wird.
	 * 
	 * @since 2013-5-27
	 */
	public TimerView() {
		this.initGUI();
	}
	
	/**
	 * Initialisiert das Panel und f�gt alle ben�tigten graphischen Elemente hinzu.
	 * 
	 * @since 2013-5-27
	 */
	public void initGUI(){

		infoLabel = new JLabel("");
		Font f = new Font("Tahoma", Font.BOLD, 19);
		setLayout(new GridLayout(3,0));
		add(new JPanel());
		infoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		infoLabel.setFont(f);
		add(infoLabel);
	}

	/**
	 * Gibt das Label aufdem die Zeit angezeigt wird zur�ck.
	 * 
	 * @return das infoLabel
	 * @since 2013-5-27
	 */
	public JLabel getActualTimeLabel(){
		return infoLabel;
	}

	/**
	 * Gibt das komplette Panel zur�ck.
	 * 
	 * @return das komplette Panel
	 * @since 2013-5-27
	 */
	public JPanel getTimerView(){
		return this;
	}

	/**
	 * Gibt den momentan auf dem infoLabel stehenden Text zur�ck
	 * 
	 * @return text des infoLabels
	 * @since 2013-5-27
	 */
	public String getTime() {
		return infoLabel.getText();
	}


}
