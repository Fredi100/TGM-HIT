package AU21_Emsenhuber;

import javax.swing.JFrame;

/**
 * Frame zum Darstellen des Programms
 * 
 * @author Alfred Emsenhuber
 * @version 2014-05-09
 */
@SuppressWarnings("serial")
public class RechteckFrame extends JFrame{
	public RechteckFrame(){
		RechteckPanel a = new RechteckPanel();
		this.add(a);
		this.setTitle("Viele Rechtecke");
		this.setSize(400,400);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new RechteckFrame();
	}
}
