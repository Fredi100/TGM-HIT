package Sudoku_Extended.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 * Erzeugt ein Eingabefeld mit den Zahlen von 1-9 um �nderungen am Sudoku vorzunehmen
 * 
 * @author Niklas Hohenwarter
 * @author Alfred Emsenhuber
 * @since 2013-5-27
 */
@SuppressWarnings("serial")
public class SudokuEingabe extends JPanel {
	
	private JButton[] zahlEingabe = new JButton[9];
	public static final Color ACTIVE = new Color(50,191,255);

	/**
	 * Initialisiert das Panel indem die daf�r zust�ndige Methode aufgerufen wird.
	 * 
	 * @since 2013-5-27
	 */
	public SudokuEingabe() {
		this.initGUI();
	}
	
	/**
	 * Initialisiert das Panel und f�gt alle ben�tigten graphischen Elemente hinzu.
	 * 
	 * @since 2013-5-27
	 */
	public void initGUI(){
		
		Font f = new Font("Tahoma", Font.BOLD, 20);
		
		setLayout(new GridLayout(3,3,1,1));
		setBorder(new EmptyBorder(5,5,5,5));
		setBackground(Color.BLACK);
		
		for(int i =0; i < zahlEingabe.length; i++){
			
			zahlEingabe[i] = new JButton("" + (i+1));
			zahlEingabe[i].setFont(f);
			zahlEingabe[i].setPreferredSize(new Dimension(60,60));
			zahlEingabe[i].setBackground(Color.LIGHT_GRAY);
			zahlEingabe[i].setEnabled(false);
			
			add(zahlEingabe[i]);
			
		}
		
	}
	
	/**
	 * Setter Methode um auf die Eingabetasten f�r die Zahlen einen ActionListener
	 * hinzuzuf�gen
	 * 
	 * @param l, der �bergebene, hinzuzuf�gende ActionListener
	 * @since 2013-5-27
	 */
	public void setZahlEingabeListener(ActionListener l){
		for(int i = 0; i < zahlEingabe.length; i++){
			zahlEingabe[i].addActionListener(l);
			zahlEingabe[i].setActionCommand("" + (i+1));
		}
	}
	
	/**
	 * Setzt ob das Eingabefeld aktiv ist oder nicht. Falls es aktiv ist ist es Blau und ansonsten Grau.
	 * 
	 * @param active, der zustand der Aktivit�t der gesetzt wird
	 * @since 2013-5-27
	 */
	public void setActivated(boolean active){
		for(int i = 0; i < zahlEingabe.length; i++){
			if(active){
				zahlEingabe[i].setBackground(ACTIVE);
			}else{
				zahlEingabe[i].setBackground(Color.LIGHT_GRAY);	
			}
			zahlEingabe[i].setEnabled(active);
		}
	}

	/**
	 * Gibt das komplette Panel zur�ck
	 * 
	 * @return das komplette Panel
	 * @since 2013-5-27
	 */
	public JPanel getEingabePanel() {
		return this;
	}

}
