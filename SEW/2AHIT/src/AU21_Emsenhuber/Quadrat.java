package AU21_Emsenhuber;

import java.awt.Color;

/**
 * Repräsentiert das Quadrat mit seiner Position und Farbe
 * 
 * @author Alfred Emsenhuber
 * @version 2014-05-09
 */
public class Quadrat {
	Color color; 
	RechteckZeichnung panel;
	int positionX;
	int positionY;
	
	public Quadrat(RechteckZeichnung panel){
		this.panel = panel;
		this.getColor();
		this.setPositionX();
		this.setPositionY();
	}
	
	/**
	 * Lost eine Farbe für das Quadrat aus
	 */
	public void getColor(){
		Color a = Color.BLACK;
		switch((int) (Math.random() * 12) + 1){
		case 1:
			a = Color.WHITE;
			break;
		case 2:
			a = Color.BLUE;
			break;
		case 3:
			a = Color.CYAN;
			break;
		case 4:
			a = Color.DARK_GRAY;
			break;
		case 5:
			a = Color.GRAY;
			break;
		case 6:
			a = Color.GREEN;
			break;
		case 7:
			a = Color.LIGHT_GRAY;
			break;
		case 8:
			a = Color.MAGENTA;
			break;
		case 9:
			a = Color.ORANGE;
			break;
		case 10:
			a = Color.PINK;
			break;
		case 11:
			a = Color.RED;
			break;
		case 12:
			a = Color.YELLOW;
			break;
		}
		color = a;
	}
	
	/**
	 * Lost die X Position des Quadrates aus
	 */
	public void setPositionX(){
		positionX = (int) (Math.random() * (panel.getWidth()-19));
	}
	
	/**
	 * Lost die Y Position des Quadrates aus
	 */
	public void setPositionY(){
		positionY = (int) (Math.random() * (panel.getHeight()-19));
	}
}