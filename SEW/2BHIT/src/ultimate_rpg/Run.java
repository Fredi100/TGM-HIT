package ultimate_rpg;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ultimate_rpg.gui.Mainmenu;
import ultimate_rpg.gui.Register;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Erstellt ein JFrame in dem sich die ganze GUI abspielt.
 * Erzeugt dann das Hauptmenü und plaziert es auf dem JFrame.
 * 
 * 
 * @author xXFrediXx
 * @version	2013.05.18
 */
public class Run implements ActionListener{
	private JFrame ultimate;
	private Register register;
	private Mainmenu mainmenu;
	private JPanel cards;
	private CardLayout cl;
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Run a = new Run();
	}
	
	public Run(){
		ultimate = new JFrame("The Ultimate RPG");					//Erstellt das JFrame in dem sich alles abspielt
		ultimate.setSize(400,400);									//Setzt die anfängliche Größe des Fensters
		ultimate.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	//Sorgt dafür, dass das Fenster aus dem Speicher entfernt wird sobald es geschlossen wird.
		mainmenu = new Mainmenu();									//Erzeugt das Hauptmenü
		cards = new JPanel();										//Erzeugt das Panel cards zum switchen der Panels
		cards.setLayout(new CardLayout());							//Fügt cards ein CardLayout hinzu
		cards.add(mainmenu, "mainmenu");
		ultimate.add(cards);
		ultimate.setVisible(true);									//Macht das JFrame sichtbar
		mainmenu.neuesSpiel.addActionListener(this);				//Fügt einen ActionListener zu dem Button neuesSpiel hinzu
		mainmenu.fortsetzen.addActionListener(this);				//Selbiges wie oben nur für den Button fortsetzen
		register = new Register();
		register.ready.addActionListener(this);
		cards.add(register, "register");
	}
	
	public void runRegister(){
		cl = (CardLayout)(cards.getLayout());
		cl.show(cards, "register");
	}
	
	public void runMainmenu(){
		cl = (CardLayout)(cards.getLayout());
		cl.show(cards, "mainmenu");
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == mainmenu.neuesSpiel){
			runRegister();
		}
		if(ae.getSource() == mainmenu.fortsetzen){
			
		}
		if(ae.getSource() == register.ready){
			runMainmenu();
		}
	}
}
