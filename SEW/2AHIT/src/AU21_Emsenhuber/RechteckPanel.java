package AU21_Emsenhuber;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * JPanel zum darstellen des Inhalts
 * 
 * @author Alfred Emsenhuber
 * @version 2014-05-09
 */
@SuppressWarnings("serial")
public class RechteckPanel extends JPanel{
	private JButton b1,b2,b3;
	private RechteckZeichnung a;
	
	public RechteckPanel(){
		ButtonHandler handler = new ButtonHandler();
		a = new RechteckZeichnung(this);
		JPanel top = new JPanel();
		top.setBackground(Color.GRAY);
		top.setLayout(new GridLayout(1,3,5,5));
		b1 = new JButton("L�schen");
		b2 = new JButton("1 Rechteck");
		b3 = new JButton("10 Rechtecke");
		b1.addActionListener(handler);
		b2.addActionListener(handler);
		b3.addActionListener(handler);
		top.add(b1);
		top.add(b2);
		top.add(b3);
		this.setLayout(new BorderLayout());
		this.add(top, BorderLayout.NORTH);
		this.add(a, BorderLayout.CENTER);
	}
	
	public class ButtonHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent ae) {
			if(ae.getSource() == b1){
				a.fillArray(0);
				repaint();
			}
			if(ae.getSource() == b2){
				a.fillArray(1);
				repaint();
			}
			if(ae.getSource() == b3){
				a.fillArray(10);
				repaint();
			}
		}
	}
}
