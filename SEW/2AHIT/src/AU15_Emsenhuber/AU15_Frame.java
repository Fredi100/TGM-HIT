package AU15_Emsenhuber;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

/**
 * Frame zum darstellen meines Pascalschen Dreiecks
 * 
 * @author Alfred Emsenhuber
 * @version 2014-03-14
 */
@SuppressWarnings("serial")
public class AU15_Frame extends JFrame{
	private JButton knopf;
	private JPanel panel;
	private JTextPane ausgabe;
	private JComboBox<String> comboBoxSize;
	
	/**
	 * Konstrukor zum erstellen eines neuen JFrames
	 * Enthält ein JTextPane mit der Ausgabe, eine JComboBox um die Zeilen der Ausgabe zu deffinieren und einen JButton um den Prozess zu starten
	 * 
	 * @param c Das Control Objekt für den ActionListener
	 */
	public AU15_Frame(AU15_Control c){
		String[] arraySize = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};	//Enthält die Werte für die JComboBox
		knopf = new JButton("Darstellen");
		panel = new JPanel();
		comboBoxSize = new JComboBox<String>(arraySize);
		ausgabe = new JTextPane();
		
		setLayout(new GridLayout(2,1));
		panel.setLayout(new GridLayout(1,2));
		knopf.setActionCommand("Blub");
		knopf.addActionListener(c);
		comboBoxSize.setFont(new Font("Ausgabe", Font.BOLD, 28));	//Gibt den Items der JComboBox eine neue Font um es besser lesen zu können
		
		((JLabel)comboBoxSize.getRenderer()).setHorizontalAlignment(JLabel.CENTER);	//Holt sich den Renderer der JComboBox und castet diesen in ein JLabel um die Schrift auszurichten(Etwas unorthodox)
		
		ausgabe.setContentType("text/html");	//Definiert den Inhalt JTextPanes als HTML Text um HTML Syntax verwenden zu können
		
		panel.add(comboBoxSize);
		panel.add(knopf);
		add(ausgabe);
		add(panel);
		
		setSize(800,600);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
	}
	
	public void setTextPane(String htmlText){
		ausgabe.setText(htmlText);
	}
	
	public String getAuswahl(){
		return (String) comboBoxSize.getSelectedItem();
	}
}
