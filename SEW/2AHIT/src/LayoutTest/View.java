package LayoutTest;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class View extends JFrame implements ActionListener{
	JButton bTop, bBottom, bLeft, bRight;
	JLabel l1;
	int iTop, iBottom, iLeft, iRight;
	
	public View(){
		iTop = 0;
		iBottom = 0;
		iLeft = 0;
		iRight = 0;
		
		bTop = new JButton("Oben");
		bBottom = new JButton("Unten");
		bLeft = new JButton("Links");
		bRight = new JButton("Rechts");
		bRight.setActionCommand("Rechter_Button");
		bLeft.setActionCommand("Linker_Button");
		bTop.setActionCommand("Oberer_Button");
		bBottom.addActionListener(this);
		bRight.addActionListener(this);
		bLeft.addActionListener(this);
		bTop.addActionListener(this);
		bBottom.setActionCommand("Unterer_Button");
		l1 = new JLabel("Mitte");
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		
		setLayout(new BorderLayout());
		add(bTop, BorderLayout.NORTH);
		add(bBottom, BorderLayout.SOUTH);
		add(bLeft, BorderLayout.WEST);
		add(bRight, BorderLayout.EAST);
		add(l1, BorderLayout.CENTER);
		
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand().equals("Rechter_Button")){
			iRight += 1;
			iLeft = 0;
			iTop = 0;
			iBottom = 0;
			l1.setText("Rechts");
			l1.setHorizontalAlignment(SwingConstants.RIGHT);
			l1.setVerticalAlignment(SwingConstants.CENTER);
			if(iRight == 2){
				l1.setHorizontalAlignment(SwingConstants.CENTER);
				l1.setVerticalAlignment(SwingConstants.CENTER);
				iRight = 0;
			}
		}
		if(ae.getActionCommand().equals("Linker_Button")){
			iLeft += 1;
			iRight = 0;
			iTop = 0;
			iBottom = 0;
			l1.setText("Links");
			l1.setHorizontalAlignment(SwingConstants.LEFT);
			l1.setVerticalAlignment(SwingConstants.CENTER);
			if(iLeft == 0){
				l1.setHorizontalAlignment(SwingConstants.CENTER);
				l1.setVerticalAlignment(SwingConstants.CENTER);
				iLeft = 0;
			}
		}
		if(ae.getActionCommand().equals("Oberer_Button")){
			iTop += 1;
			iRight = 0;
			iLeft = 0;
			iBottom = 0;
			l1.setText("Oben");
			l1.setVerticalAlignment(SwingConstants.TOP);
			l1.setHorizontalAlignment(SwingConstants.CENTER);
			if(iTop == 2){
				l1.setHorizontalAlignment(SwingConstants.CENTER);
				l1.setVerticalAlignment(SwingConstants.CENTER);
				iTop = 0;
			}
		}
		if(ae.getActionCommand().equals("Unterer_Button")){
			iBottom += 1;
			iRight = 0;
			iLeft = 0;
			iTop = 0;
			l1.setText("Unten");
			l1.setVerticalAlignment(SwingConstants.BOTTOM);
			l1.setHorizontalAlignment(SwingConstants.CENTER);
			if(iBottom == 2){
				l1.setHorizontalAlignment(SwingConstants.CENTER);
				l1.setVerticalAlignment(SwingConstants.CENTER);
				iBottom = 0;
			}
		}
	}
}
