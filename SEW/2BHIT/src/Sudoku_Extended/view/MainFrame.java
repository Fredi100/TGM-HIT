package Sudoku_Extended.view;

import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * Erstellt das Mainframe, also das Frame aufdas alles andere hinzugef�gt wird.
 * 
 * @author Niklas Hohenwarter
 * @author Alfred Emsenhuber
 *
 */
@SuppressWarnings("serial")
/**
 * Das Hauptfenster aufdas alle Komponenten hinzugef�gt werden.
 * 
 * @author Niklas Hohenwarter
 * @author Alfred Emsenhuber
 * @version 2013-5-27
 *
 */
public class MainFrame extends JFrame {
	
	/**
	 * Gibt dem Frame einen Namen und ruft die Methode auf, die es intitialisiert.
	 * 
	 * @since 2013-5-27
	 */
	public MainFrame() {
		
		super("Sudoku 2.0");
		this.initFrame();
		
	}
	
	/**
	 * Initialisiert das Frame
	 * 
	 * @since 2013-5-27
	 */
	private void initFrame() {
		
		addWindowListener(new MainFrameListener());
		setLayout(new FlowLayout());
		setVisible(true);

	}
	
	/**
	 * Aktualisiert das Frame
	 * z.B. wenn etwas neues aufs Frame hinzugef�gt wurde
	 * 
	 * @since 2013-5-27
	 */
	public void update(){
		pack();
		setLocationRelativeTo(null);
		revalidate();
		repaint();
	}
	
	/**
	 * WindowAdapter Klasse um das Frame und somit das Programm zu beenden.
	 * 
	 * @author Niklas Hohenwarter
	 * @author Alfred Emsenhuber
	 * @since 2013-5-27
	 */
	public class MainFrameListener extends WindowAdapter{
		
		/**
		 * Beendet das Programm sobald windowClosed ausgel�st wurde.
		 * 
		 * @param e, das WindowEvent des Frames
		 * @since 2013-5-27
		 */
		@Override
		public void windowClosed(WindowEvent e){
			System.exit(0);
		}
		
	}


}
