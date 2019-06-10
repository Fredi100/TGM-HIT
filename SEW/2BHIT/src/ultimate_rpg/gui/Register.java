package ultimate_rpg.gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Register extends JPanel{
	public JButton ready = new JButton("Bereit");
	public Register(){
		setLayout(new BorderLayout());
		add(ready,BorderLayout.SOUTH);
		setVisible(true);
	}
}
