package Minesweeper;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MinesweeperFrame extends JFrame{
	private Controller c;
	protected MinesweeperPanel p;
	
	public MinesweeperFrame(Controller c){
		super("Minesweeper");
		this.c = c;
		p = new MinesweeperPanel(c);
		this.add(p);
		this.setSize(500, 500);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public void verloren(){
		JOptionPane.showMessageDialog(this, "Du hast verloren!");
	}
}
