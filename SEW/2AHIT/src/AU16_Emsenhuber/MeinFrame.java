package AU16_Emsenhuber;

import javax.swing.JFrame;

/**
 * MeinFrame ist ein JFrame und sorgt f�r die darstellung des Inhalts von MeinPanel
 * 
 * @author Fredi100
 * @version 2014-03-21
 */
@SuppressWarnings("serial")
public class MeinFrame extends JFrame{
	private MeinPanel panel;
	
	/**
	 * Konstruktor f�r das MeinFrame Objekt
	 * Erzeugt ein MeinPanel Objekt und added es auf sich selbst
	 */
	public MeinFrame(){
		panel = new MeinPanel();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,600);
		setResizable(false);
		
		add(panel);
		
		setVisible(true);
	}
}
