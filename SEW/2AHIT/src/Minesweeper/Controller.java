package Minesweeper;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener{
	private MinesweeperFrame mf;
	private Model m;
	
	public Controller(){
		m = new Model();
		mf = new MinesweeperFrame(this);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		int a = Integer.parseInt(ae.getActionCommand());
		int zeile = (int)(((double)a)/10);
		int spalte = (int)(a-(zeile*10));
		int feld = m.getFeld(zeile, spalte);
//		if(feld == 0){
//			if(zeile == 0 && spalte == 0){ //obere linke Ecke
//				mf.p.bButtons[zeile][spalte+1].doClick();
//				mf.p.bButtons[zeile+1][spalte].doClick();
//				mf.p.bButtons[zeile+1][spalte+1].doClick();
//				mf.p.bButtons[zeile][spalte+1].setEnabled(false);
//				mf.p.bButtons[zeile+1][spalte].setEnabled(false);
//				mf.p.bButtons[zeile+1][spalte+1].setEnabled(false);
//			}// obere linke Ecke ende
//			if(zeile == 0 && spalte == 9){ //obere rechte Ecke
//				mf.p.bButtons[zeile][spalte-1].doClick();
//				mf.p.bButtons[zeile+1][spalte].doClick();
//				mf.p.bButtons[zeile+1][spalte-1].doClick();
//				mf.p.bButtons[zeile][spalte-1].setEnabled(false);
//				mf.p.bButtons[zeile+1][spalte].setEnabled(false);
//				mf.p.bButtons[zeile+1][spalte-1].setEnabled(false);
//			}// obere rechte Ecke ende
//			if(zeile == 9 && spalte == 0){ //untere linke Ecke
//				mf.p.bButtons[zeile][spalte+1].doClick();
//				mf.p.bButtons[zeile-1][spalte].doClick();
//				mf.p.bButtons[zeile-1][spalte+1].doClick();
//				mf.p.bButtons[zeile][spalte+1].setEnabled(false);
//				mf.p.bButtons[zeile-1][spalte].setEnabled(false);
//				mf.p.bButtons[zeile-1][spalte+1].setEnabled(false);
//			}// untere linke Ecke ende
//			if(zeile == 9 && spalte == 9){ //untere rechte Ecke
//				mf.p.bButtons[zeile][spalte-1].doClick();
//				mf.p.bButtons[zeile-1][spalte].doClick();
//				mf.p.bButtons[zeile-1][spalte-1].doClick();
//				mf.p.bButtons[zeile][spalte-1].setEnabled(false);
//				mf.p.bButtons[zeile-1][spalte].setEnabled(false);
//				mf.p.bButtons[zeile-1][spalte-1].setEnabled(false);
//			}// untere rechte Ecke ende
//			if(zeile == 0 && spalte <= 8 && spalte > 0){ //oben
//				mf.p.bButtons[zeile][spalte-1].doClick();
//				mf.p.bButtons[zeile][spalte+1].doClick();
//				mf.p.bButtons[zeile+1][spalte-1].doClick();
//				mf.p.bButtons[zeile+1][spalte].doClick();
//				mf.p.bButtons[zeile+1][spalte+1].doClick();
//				mf.p.bButtons[zeile][spalte-1].setEnabled(false);
//				mf.p.bButtons[zeile][spalte+1].setEnabled(false);
//				mf.p.bButtons[zeile+1][spalte-1].setEnabled(false);
//				mf.p.bButtons[zeile+1][spalte].setEnabled(false);
//				mf.p.bButtons[zeile+1][spalte+1].setEnabled(false);
//			}// oben ende
//			if(zeile == 9 && spalte <= 8 && spalte > 0){ //unten
//				mf.p.bButtons[zeile][spalte-1].doClick();
//				mf.p.bButtons[zeile][spalte+1].doClick();
//				mf.p.bButtons[zeile-1][spalte-1].doClick();
//				mf.p.bButtons[zeile-1][spalte].doClick();
//				mf.p.bButtons[zeile-1][spalte+1].doClick();
//				mf.p.bButtons[zeile][spalte-1].setEnabled(false);
//				mf.p.bButtons[zeile][spalte+1].setEnabled(false);
//				mf.p.bButtons[zeile-1][spalte-1].setEnabled(false);
//				mf.p.bButtons[zeile-1][spalte].setEnabled(false);
//				mf.p.bButtons[zeile-1][spalte+1].setEnabled(false);
//			}// unten ende
//			if(spalte == 0 && zeile <= 8 && zeile > 0){ //links 
//				mf.p.bButtons[zeile-1][spalte].doClick();
//				mf.p.bButtons[zeile+1][spalte].doClick();
//				mf.p.bButtons[zeile-1][spalte+1].doClick();
//				mf.p.bButtons[zeile][spalte+1].doClick();
//				mf.p.bButtons[zeile+1][spalte+1].doClick();
//				mf.p.bButtons[zeile-1][spalte].setEnabled(false);
//				mf.p.bButtons[zeile+1][spalte].setEnabled(false);
//				mf.p.bButtons[zeile-1][spalte+1].setEnabled(false);
//				mf.p.bButtons[zeile][spalte+1].setEnabled(false);
//				mf.p.bButtons[zeile+1][spalte+1].setEnabled(false);
//			}// links ende
//			if(spalte == 9 && zeile <= 8 && zeile > 0){ //rechts 
//				mf.p.bButtons[zeile-1][spalte].doClick();
//				mf.p.bButtons[zeile+1][spalte].doClick();
//				mf.p.bButtons[zeile-1][spalte-1].doClick();
//				mf.p.bButtons[zeile][spalte-1].doClick();
//				mf.p.bButtons[zeile+1][spalte-1].doClick();
//				mf.p.bButtons[zeile-1][spalte].setEnabled(false);
//				mf.p.bButtons[zeile+1][spalte].setEnabled(false);
//				mf.p.bButtons[zeile-1][spalte-1].setEnabled(false);
//				mf.p.bButtons[zeile][spalte-1].setEnabled(false);
//				mf.p.bButtons[zeile+1][spalte-1].setEnabled(false);
//			}// rechts ende
//			if(zeile <= 8 && zeile > 0 && spalte <= 8 && spalte > 0){ //mitte 
//				mf.p.bButtons[zeile+1][spalte].doClick();
//				mf.p.bButtons[zeile+1][spalte-1].doClick();
//				mf.p.bButtons[zeile+1][spalte+1].doClick();
//				mf.p.bButtons[zeile-1][spalte-1].doClick();
//				mf.p.bButtons[zeile-1][spalte+1].doClick();
//				mf.p.bButtons[zeile-1][spalte].doClick();
//				mf.p.bButtons[zeile][spalte-1].doClick();
//				mf.p.bButtons[zeile][spalte+1].doClick();
//				mf.p.bButtons[zeile+1][spalte].setEnabled(false);
//				mf.p.bButtons[zeile+1][spalte-1].setEnabled(false);
//				mf.p.bButtons[zeile+1][spalte+1].setEnabled(false);
//				mf.p.bButtons[zeile-1][spalte-1].setEnabled(false);
//				mf.p.bButtons[zeile-1][spalte+1].setEnabled(false);
//				mf.p.bButtons[zeile-1][spalte].setEnabled(false);
//				mf.p.bButtons[zeile][spalte-1].setEnabled(false);
//				mf.p.bButtons[zeile][spalte+1].setEnabled(false);
//			}// mitte ende
//		}
		
		if(feld != 9){
			mf.p.setButtonText("" + feld, zeile, spalte);
		}else{
			for(int i = 0; i < 9; i++){
				for(int j = 0; j < 9; j++){
					feld = m.getFeld(i, j);
					mf.p.setButtonText("" + feld, i, j);
				}
			}
			mf.verloren();
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		new Controller();
	}
}
