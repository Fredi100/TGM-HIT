package AU17_Emsenhuber;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Main-Methode Erzeugt ein Control Objekt
 * 
 * @author xXFredi100Xx
 * @version 2014-03-21
 */
public class Main {
	JFrame mode;
	JButton bNormal, bExtended;
	public double width, height;
	
	/**
	 * Erzeugt ein Main Objekt welches ein Fenster zur Auswahl des Spiel-Modus erstellt
	 */
	public Main(){
		mode = new JFrame();
		bNormal = new JButton("Normal");
		bExtended = new JButton("Extended");
		ButtonHandler bh = new ButtonHandler();
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();	//Fragt die Dimensionen des Bildschirms ab
		width = screenSize.getWidth();
		height = screenSize.getHeight();

		bNormal.setActionCommand("Normal");
		bExtended.setActionCommand("Extended");
		bNormal.addActionListener(bh);
		bExtended.addActionListener(bh);

		mode.setLayout(new GridLayout(1, 2));
		mode.add(bNormal);
		mode.add(bExtended);
		mode.setSize(400,200);
		mode.setLocation((int) (width/2)-(mode.getWidth()/2), (int) ((height/2)-(mode.getHeight()/2)));	//Plaziert das Auswahlfenster in der Mitte des Bildschirms
		mode.setResizable(false);
		mode.setVisible(true);
	}
	
	/**
	 * Main Methode erzeugt ein Main Objekt
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new Main();
	}
	
	/**
	 * Startet den Normalen Modus
	 */
	public void runNormal(){
		new Control();
		mode.dispose();
	}
	
	/**
	 * Startet den Extended Modus
	 */
	public void runExtended(){
		new ControlExtended();
		mode.dispose();
	}
	
	/**
	 * ButtonHandler dient zur überprüfung welcher Spielmodus ausgewählt wurde
	 * 
	 * @author xXFredi100Xx
	 * @version 2014-03-21
	 */
	public class ButtonHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent ae) {
			if(ae.getActionCommand().equals("Normal")){
				runNormal();
			}else if(ae.getActionCommand().equals("Extended")){
				runExtended();
			}else{
				System.out.println("Fehler in der Auswahl des Spielmodus. Programm wird beendet!");
				System.exit(1);
			}
		}

	}
}