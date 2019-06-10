package AU21_Emsenhuber;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * JPanel auf dem die Quadrate gezeichnet werden
 * 
 * @author Alfred Emsenhuber
 * @version 2014-05-09
 */
@SuppressWarnings("serial")
public class RechteckZeichnung extends JPanel{
	RechteckPanel panel;
	Quadrat array[];
	public RechteckZeichnung(RechteckPanel panel){
		this.panel = panel;
		array = new Quadrat[0];
		this.setBackground(Color.WHITE);
	}
	
	/**
	 * Zeichnet die Quadrate die in array[] gespeichert sind
	 */
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		for(int i = 0; i < array.length; i++){
			g.setColor(array[i].color);
			g.fillRect(array[i].positionX, array[i].positionY, 20, 20);
		}
	}
	
	/**
	 * Füllt das Array mit der übergebenen Anzahl von Quadrat Objekten
	 * 
	 * @param a Die Anzahl der Quadrat-Objekte
	 */
	public void fillArray(int a){
		array = new Quadrat[a];
		for(int i = 0 ; i < a ; i++){
			array[i] = new Quadrat(this);
		}
	}
}
