package Matchsticks;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DrawPanel extends JPanel{
	int streichhoelzer;
	int win;
	
	public DrawPanel(){
		streichhoelzer = 13;
		win = 0;
	}
	
	public void setStreichhoelzer(int anzahl){
		streichhoelzer = anzahl;
	}
	
	public void setWin(int anzahl){
		win = anzahl;
	}
	
	@Override
	public void paintComponent(Graphics g){
		if(win == 0){
			
		}else if(win == 1){
			this.setBackground(Color.GREEN);
		}else if(win == -1){
			this.setBackground(Color.RED);
		}
	}
}
