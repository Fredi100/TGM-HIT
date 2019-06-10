package Matchsticks;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class View extends JFrame{
	public static String NEUES_SPIEL = "Neues Spiel";
	public static String ENTNEHMEN = "Entnehmen";
	JSlider slider;
	JTextField input;
	JLabel labelTop, labelBot;
	JButton newGame,take;
	JPanel top,bot,topmid;
	DrawPanel center;
	
	public View(Control c){		
		take = new JButton(ENTNEHMEN);
		take.setActionCommand(ENTNEHMEN);
		take.setFont(new Font(ENTNEHMEN,Font.BOLD,18));
		take.addActionListener(c);
		
		slider = new JSlider(1,3);
		slider.setMinorTickSpacing(1);
		slider.setSnapToTicks(true);
		slider.setPaintTicks(true);
		
		topmid = new JPanel();
		topmid.setLayout(new BoxLayout(topmid,BoxLayout.X_AXIS));
		topmid.add(slider);
		topmid.add(take);
		
		labelTop = new JLabel("Wie viele Streichhoelzer möchten sie entnehmen? (Anzahl:13)");
		labelTop.setFont(new Font("Label",Font.ITALIC,12));
		labelTop.setHorizontalAlignment(SwingConstants.CENTER);
		
		top = new JPanel();
		top.setLayout(new BorderLayout());
		top.add(labelTop, BorderLayout.NORTH);
		top.add(topmid);
		
		center = new DrawPanel();
		
		labelBot = new JLabel("Startzahl der Streichhölzer");
		
		input = new JTextField("13");
		
		newGame = new JButton(NEUES_SPIEL);
		newGame.setActionCommand(NEUES_SPIEL);
		newGame.addActionListener(c);
		
		bot = new JPanel();
		bot.setLayout(new BoxLayout(bot,BoxLayout.X_AXIS));
		bot.add(labelBot);
		bot.add(input);
		bot.add(newGame);
		
		this.setLayout(new BorderLayout());
		this.add(top,BorderLayout.NORTH);
		this.add(center);
		this.add(bot);
		this.setTitle("Streichholzspiel");
		this.pack();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public void setLabel(String text){
		labelTop.setText(text);
	}
	
	public int getAnzahl(){
		return slider.getValue();
	}
	
	public int getStart(){
		return Integer.parseInt(input.getText());
	}
	
	public void endGame(){
		take.setEnabled(false);
		slider.setEnabled(false);
	}
	
	public void startGame(){
		take.setEnabled(true);
		slider.setEnabled(true);
	}
}
