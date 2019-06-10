package Sudoku_Extended.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

/**
 * Erstellt ein Panel das 9 Buttons enth�llt. Jeder Button repraesentiert ein Level. Sobald einer gedr�ckt wurde
 * startet das Sudoku
 * 
 * @author Niklas Hohenwarter
 * @author Alfred Emsenhuber
 * @version 2013-5-27
 */
@SuppressWarnings("serial")
public class LevelSelection extends JPanel {

	private JButton[] levelBtn = new JButton[9];
	
	/**
	 * Konstruktor, der die Methode aufruft, die die GUI initialisiert.
	 * 
	 * @since 2013-5-27
	 */
	public LevelSelection() {
		this.initGUI();
	}
	
	/**
	 * Initialisiert die einzelnen Elemente der GUI und f�gt sie dem Hauptpanel(this) hinzu.
	 * 
	 * @since 2013-5-27
	 */
	private void initGUI(){

		Font f = new Font("Tahoma", Font.BOLD, 20);
		JPanel center = new JPanel();
		EmptyBorder e = new EmptyBorder(5,5,5,5);
		
		JLabel info1 = new JLabel("<html><body align='center'>Levelauswahl:</body></html>");
		info1.setFont(new Font("Tahoma", Font.BOLD, 15));
		info1.setHorizontalAlignment(SwingConstants.CENTER);

		center.setLayout(new GridLayout(3,3,5,5));
		center.setBorder(e);
		center.setBackground(Color.BLACK);
		setBorder(e);
		setLayout(new BorderLayout(8,8));

		for(int i = 0; i < levelBtn.length; i++){
			levelBtn[i] = new JButton(""+(i+1));
			levelBtn[i].setPreferredSize(new Dimension(60,60));
			levelBtn[i].setFont(f);
			center.add(levelBtn[i]);
		}
		
		add(center);
		add(BorderLayout.NORTH, info1);
		
	}
	
	/**
	 * Setter Methode, die den Buttons, die f�r die Levelauswahl zust�ndig sind
	 * einen ActionListener setzt.
	 * 
	 * @param l, der �bergebene ActionListener f�r die Buttons
	 */
	public void setLevelButtonsListener(ActionListener l){
		for(int i = 0; i < levelBtn.length; i++){
			levelBtn[i].addActionListener(l);
			levelBtn[i].setActionCommand("" + i);
		}
	}

}
