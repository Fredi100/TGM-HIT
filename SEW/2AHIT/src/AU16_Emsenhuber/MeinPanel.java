package AU16_Emsenhuber;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * MeinPanel Klasse kümmert sich um die Darstellung der Buttons und dem JLabel mit dem sich ändernden Textes
 * 
 * @author Fredi100
 * @version 2014-03-21
 */
@SuppressWarnings("serial")
public class MeinPanel extends JPanel implements ActionListener{
	private JButton bAdd, bSubtract;
	private JLabel lText;
	private int zaehler = 0;
	
	/**
	 * Konstruktor für MeinPanel
	 * Erzeugt die alle Attribute und added diese auf sich selbst
	 */
	public MeinPanel(){
		Font textFont = new Font("textFont",Font.PLAIN,24);
		bAdd = new JButton("Erhöhen");
		bAdd.setActionCommand("+1");
		bAdd.addActionListener(this);
		bAdd.setFont(textFont);
		bSubtract = new JButton("Verringern");
		bSubtract.setActionCommand("-1");
		bSubtract.addActionListener(this);
		bSubtract.setFont(textFont);
		lText = new JLabel("" + zaehler);
		lText.setHorizontalAlignment(SwingConstants.CENTER);
		lText.setFont(textFont);
		setLayout(new BorderLayout());
		add(bAdd, BorderLayout.NORTH);
		add(bSubtract, BorderLayout.SOUTH);
		add(lText, BorderLayout.CENTER);
	}
	
	/**
	 * Kümmert sich um das erhöhen und verringern des Zählers und um das verändern des Textes
	 */
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand().equals("+1")){
			++zaehler;
			lText.setText("" + zaehler);
			if(zaehler==42){
				lText.setText("42 The answer to everything");
			}
		}
		
		if(ae.getActionCommand().equals("-1")){
			--zaehler;
			lText.setText("" + zaehler);
			if(zaehler==42){
				lText.setText("42 The answer to everything");
			}
		}
	}
}
