package Sudoku_Extended.view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * Klasse die Ein JPanel erstellt aufdem ein geladenes Bild(Logo)
 * gezeichnet wird.
 * 
 * @author Niklas Hohenwarter
 * @author Alfred Emsenhuber
 * @version 2013-5-27
 */
@SuppressWarnings("serial")
public class LogoView extends JPanel {
	
	private Image image;
	
	/**
	 * Ruft die Methode auf die das Bild l�dt.
	 * 
	 * @since 2013-5-27
	 */
	public LogoView() {
		this.initImage();
	}

	/**
	 * L�dt das Bild das aufs Panel gezeichnet wird von einem relativen Pfad
	 * 
	 * @since 2013-5-27
	 */
	private void initImage() {
		
		image = new ImageIcon(this.getClass().getResource("logo.png")).getImage();
		
	}
	
	/**
	 * �berschreibt die paintComponent Methode und zeichnet das Bild
	 * 
	 * @param g, das Graphics Objekt des Panels
	 * @since 2013-5-27
	 */
	@Override
	public void paintComponent(Graphics g){
		super.paintComponents(g);
		g.drawImage(image, 5, 5, (this.getWidth()-10), (this.getHeight()-10), null);
	}

	/**
	 * Getter Methode f�r das gesammte Panel.
	 * 
	 * @return das komplette Panel
	 * @since 2013-5-27
	 */
	public JPanel getLogoView() {
		return this;
	}

}
