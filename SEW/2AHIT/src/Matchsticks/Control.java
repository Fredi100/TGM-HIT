package Matchsticks;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Control implements ActionListener{
	Model m;
	View v;
	public Control(){
		m = new Model();
		v = new View(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand().equals(View.ENTNEHMEN)){
			int anzahl = v.getAnzahl();
			String text = m.nimm(anzahl);
			v.setLabel(text);
			int win = m.checkWin();
			v.center.setStreichhoelzer(m.getStreichhoelzer());
			v.repaint();
			if(win == 1){
				v.endGame();
				v.setLabel("Gewonnen");
				v.center.setWin(1);
			}else{
				text = m.computer();
				win = m.checkWin();
				v.setLabel(text);
				v.center.setStreichhoelzer(m.getStreichhoelzer());
				v.repaint();
				if(win == 1){
					v.endGame();
					v.setLabel("Verloren");
					v.center.setWin(-1);
				}
			}
		}
		
		if(ae.getActionCommand().equals(View.NEUES_SPIEL)){
			m.newGame(v.getStart());
			v.startGame();
			v.setLabel("Wie viele Streichhölzer möchten sie entnehmen? (Anzahl: " + m.getStreichhoelzer() + ")");
			v.center.setStreichhoelzer(m.getStreichhoelzer());
			v.center.setWin(0);
			v.repaint();
		}
	}
}
