package Minesweeper;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;


public class MinesweeperPanel extends JPanel{
	protected JButton[][] bButtons; 
	private Controller c;
	
	public MinesweeperPanel(Controller c){
		this.c = c;
		this.setLayout(new GridLayout(10, 10));
		this.bButtons = new JButton[10][10];
		for(int i = 0; i <= 9; i++){
			for(int j = 0; j <= 9; j++){
				bButtons[i][j] = new JButton(); 
				bButtons[i][j].addActionListener(c);
				bButtons[i][j].setActionCommand(""+ i + j);
				this.add(bButtons[i][j]);
			}
		} 
	}
	public void setButtonText(String text, int i, int j){
		bButtons[i][j].setText(text);
	}
}
