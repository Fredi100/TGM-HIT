package ultimate_rpg.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;


@SuppressWarnings({ "serial" })
public class Mainmenu extends JPanel{
	public JButton neuesSpiel = new JButton("Neues Spiel");
	public JButton fortsetzen = new JButton("Fortsetzen");
	
	public Mainmenu(){
		JPanel south = new JPanel();
		JPanel north = new JPanel();
		
		JTextField text = new JTextField("The Ultimate RPG");
		text.setEditable(false);
		text.setHorizontalAlignment(0);
		
		setLayout(new BorderLayout());
		north.setLayout(new GridLayout());
		south.setLayout(new GridLayout());
		
		north.add(text);
		south.add(neuesSpiel);
		south.add(fortsetzen);
		
		add(south,BorderLayout.SOUTH);
		add(north,BorderLayout.NORTH);
	}
}
