package Sudoku_Extended.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 * Erzeugt ein Panel indem das Sudoku anzgezeigt wird.
 * 
 * @author Niklas Hohenwarter
 * @author Alfred Emsenhuber
 * @since 2013-5-27
 */
@SuppressWarnings("serial")
public class SudokuView extends JPanel {

	private JButton[][] zahlen = new JButton[9][9];
	private JPanel east = new JPanel();
	
	/**
	 * Initialisiert das Panel indem die daf�r zust�ndige Methode aufgerufen wird.
	 * 
	 * @since 2013-5-27
	 */
	public SudokuView() {
		this.initGUI();
	}

	/**
	 * Initialisiert das Panel und f�gt alle ben�tigten graphischen Elemente hinzu.
	 * 
	 * @since 2013-5-27
	 */
	private void initGUI() {

		Font f = new Font("Tahoma", Font.BOLD, 20);
		JPanel big = new JPanel();
		JPanel[] little = new JPanel[9];

		GridLayout l = new GridLayout(3,3,1,1);
		EmptyBorder e = new EmptyBorder(5,5,5,5);

		big.setBackground(Color.BLACK);
		setBorder(e);
		big.setBorder(e);
		setLayout(new BorderLayout());
		big.setLayout(new GridLayout(3,3,5,5));

		east.setLayout(new GridLayout(3,0,0,0));
		east.setBorder(new EmptyBorder(0,20,0,0));

		for(int i = 0; i < zahlen.length; i++){

			little[i] = new JPanel();
			little[i].setLayout(l);
			little[i].setBackground(Color.BLACK);

			for(int j = 0; j < zahlen[i].length; j++){

				zahlen[i][j] = new JButton("");
				zahlen[i][j].setFont(f);
				zahlen[i][j].setPreferredSize(new Dimension(60,60));
				zahlen[i][j].setBackground(Color.WHITE);
				little[i].add(zahlen[i][j]);

			}

			big.add(little[i]);
		}

		add(big);
		add(BorderLayout.EAST, east);

	}
	
	/**
	 * Setzt an der �bergebenen Stelle im Sudokufeld eine Zahl
	 * 
	 * @param x, stelle in der 1.Dimension im Button Array
	 * @param y, stelle in der 2.Dimension im Button Array
	 * @param wert, der Wert der auf den Button gesetzt werden soll
	 * @since 2013-5-27
	 */
	public void setZahlenText(int x, int y, char wert){
		zahlen[x][y].setText("" + wert);
	}

	/**
	 * Setzt dan der �bergebenen Stelle im Sudokufeld die Farbe des Feldes im Angabenstil
	 * @param x, stelle in der 1.Dimension im Button Array
	 * @param y, stelle in der 2.Dimension im Button Array
	 * @since 2013-5-27
	 */
	public void setAngabeColor(int x, int y){
		zahlen[x][y].setBackground(Color.LIGHT_GRAY);
	}

	/**
	 * Setter Methode um im EastPannel ein Pannel hinzuzuf�gen.
	 * 
	 * @param panel, das hinzuzuf�gende Panel
	 * @since 2013-5-27
	 */
	public void addEastPanel(JPanel panel){
		east.add(panel);
	}
	
	/**
	 * Setzt einen �bergebenen ActionListener und ein ActionCommand mitdem man 
	 * sp�ter die stelle des Buttons im Button Array auslesen kann.
	 * 
	 * @param l, der zu setztende ActionListener
	 * @since 2013-5-27
	 */
	public void setZahlenListener(ActionListener l){
		for(int i = 0; i < zahlen.length; i++){
			for(int j = 0; j < zahlen[i].length; j++){

				if (zahlen[i][j].getText() == "") {
					zahlen[i][j].addActionListener(l);
					zahlen[i][j].setActionCommand("" + ((""+i) + (""+j)));
				}

			}
		}
	}

	/**
	 * Gibt das komplette Panel zur�ck.
	 * 
	 * @return das komplette Panel
	 * @since 2013-5-27
	 */
	public JPanel getSudokuView() {
		return this;
	}

	/**
	 * Setzt an einer �bergebenen Position im SudokuFeld eine andere Farbe,
	 * die Anzeigt das das Feld bearbeitbar ist.
	 * 
	 * @param x, stelle in der 1.Dimension im Button Array
	 * @param y, stelle in der 2.Dimension im Button Array
	 * @param normal, soll das Feld bearbeitbar gesetzt werden(false), oder wieder zur�ck auf grau(true)?
	 * @since 2013-5-27
	 */
	public void setActiveColor(Integer x, Integer y, boolean normal) {
		if(!normal){
			for(int i = 0; i < zahlen.length; i++){
				for(int j = 0; j < zahlen[i].length; j++){
					if(zahlen[i][j].getBackground() != Color.LIGHT_GRAY){
						zahlen[i][j].setBackground(Color.WHITE);
					}
				}
			}
			
			zahlen[x][y].setBackground(SudokuEingabe.ACTIVE);
		}else{
			zahlen[x][y].setBackground(Color.WHITE);
		}

	}

}
