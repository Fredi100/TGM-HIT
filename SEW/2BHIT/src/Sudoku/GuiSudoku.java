package Sudoku;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


@SuppressWarnings("serial")
public class GuiSudoku extends JFrame implements ActionListener {

	private JButton[][] buttons = new JButton[9][9];
	private JPanel[] panels = new JPanel[9];
	private JPanel bigPanel = new JPanel();
	private Logik l1;

	public GuiSudoku(int level){

		super("Sudoku");
		setResizable(false);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(0,0));
		l1 = new Logik(level);

		bigPanel = new JPanel(new GridLayout(3,3,10,10));
		bigPanel.setBorder(new EmptyBorder(10,10,10,10));

		for(int i = 0; i<9; i++){
			panels[i] = new JPanel(new GridLayout(3,3,3,3));
		}

		for(int i = 0; i<9; i++){
			for(int j = 0; j<9; j++){
				buttons[i][j] = new JButton();
				buttons[i][j].setText(l1.getWert(i,j));
				buttons[i][j].setFont(new Font("Tahoma", buttons[i][j].getFont().getStyle() | Font.BOLD, 32));
				buttons[i][j].setForeground(Color.GRAY);
				buttons[i][j].setPreferredSize(new Dimension(60,60));
				buttons[i][j].addActionListener(this);
				panels[i].add(buttons[i][j]);
			}
			bigPanel.add(panels[i]);
		}

		getContentPane().add(bigPanel);

		pack();
		setLocationRelativeTo(null);
		setVisible(true);


	}

	public void actionPerformed(ActionEvent ae){
		boolean check = false;
		String[] auswahl = {"1","2","3","4","5","6","7","8","9","feld löschen"};
		for(int i = 0; i<9; i++){
			for(int j = 0; j<9; j++){
				if(ae.getSource() == buttons[i][j]){
					if(l1.gueltig(i,j) == true){
						buttons[i][j].setText(l1.schreiben(i,j,JOptionPane.showOptionDialog(null, "Wähle", "",1,3,null,auswahl,null)));
						buttons[i][j].setForeground(Color.BLACK);
						check = l1.gewonnen();
					}else{
						JOptionPane.showMessageDialog(null, "Nicht gueltig");
					}

					if(check == true){
						JOptionPane.showMessageDialog(null, "Gewonnen");
					}

				}
			}
		}
	}
}
