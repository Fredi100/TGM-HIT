package ultimate_test_adventure;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class GUI extends JFrame implements ActionListener{
	private int a = -1;
	private int nameEnter = -1;
	private String gender = "";
	private String name1 = "";
	
	private JPanel center = new JPanel();
	private JPanel north = new JPanel();
	private JPanel east = new JPanel();
	private JPanel south = new JPanel();
	private JPanel west = new JPanel();
	
	private JLabel b;
	
	private JTextField c;
	
	private JButton fortfahren = new JButton("Fortfahren");
	private JButton neuesSpiel = new JButton("Neues Spiel");
	private JButton maennlich = new JButton("M�nnlich");
	private JButton weiblich = new JButton("Weiblich");
	private JButton enter = new JButton("Enter");
	
	public GUI(){
		this.setTitle("The Ultimate ultimate_test_adventure.Text Adventure");
		setSize(400,400);
		setLayout(new BorderLayout());
	}
	
	public void Intro(){
	    this.setVisible(true);
		north.removeAll();
		east.removeAll();
		south.removeAll();
		west.removeAll();
		center.removeAll();
		
		b = new JLabel("");
		center.add(b);
		this.add(center, BorderLayout.CENTER);
		
		String sprecher = "???";
		String text = "Du findest ultimate_test_adventure.Text-Adventures bl�d?";
		
        String newText = sprecher + ":\n";
        for (int i=0;i<text.length();i++) { 
            newText+=text.charAt(i);
            b.setText(newText);
            try {
                if (text.charAt(i)=='.' || text.charAt(i)=='!' || text.charAt(i)=='?') {
                    Thread.sleep(1500);
                }
                else {
                    Thread.sleep(75);
                }
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }  
        }
		
		
		
        sprecher = "???";
		text = "Dann pass mal auf!";
		
        newText = sprecher + ":\n";
        for (int i=0;i<text.length();i++) { 
            newText+=text.charAt(i);
            b.setText(newText);
            try {
                if (text.charAt(i)=='.' || text.charAt(i)=='!' || text.charAt(i)=='?') {
                    Thread.sleep(1500);
                }
                else {
                    Thread.sleep(75);
                }
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }  
        }
		
		
		
		
	}
	
	public void Login(){
		north.removeAll();
		east.removeAll();
		south.removeAll();
		west.removeAll();
		center.removeAll();
		
		b = new JLabel("The Ultimate ultimate_test_adventure.Text Adventure");
		center.add(b);
		this.add(center, BorderLayout.CENTER);
		
		fortfahren.addActionListener(this);
		neuesSpiel.addActionListener(this);
		
		south.add(fortfahren);
		south.add(neuesSpiel);
		this.add(south,BorderLayout.SOUTH);
		
		this.setVisible(true);
		
	}
	
	public void name(){
		north.removeAll();
		east.removeAll();
		south.removeAll();
		west.removeAll();
		center.removeAll();
		
		//TextAusgabe
		b = new JLabel("Wie soll ihr Charakter hei�en?");
		center.add(b);
		this.add(center, BorderLayout.CENTER);
		
		enter.addActionListener(this);
		
		//TextEingabe
		c = new JTextField("Name");
		south.add(c);
		south.add(enter);
		this.add(south,BorderLayout.SOUTH);
		
		this.setVisible(true);
		
	}
	
	public void HUD(){
		
	}
	
	/*
	 * ActionListener
	 */
	public void actionPerformed (ActionEvent ae){
        // Login
        if(ae.getSource() == fortfahren){
            a = 1;
        }
        else if(ae.getSource() == neuesSpiel){
            a = 0;
        }
        
        //name
        if(ae.getSource() == enter){
        	name1 = c.getText();
        	nameEnter = 0;
        }
        
        //geschlecht
        if(ae.getSource() == maennlich){
        	gender = "M�nnlich";
        }
        else if(ae.getSource() == this.weiblich){
        	gender = "Weiblich";
        }
    }
	
	public int getLogin(){
		return a;
	}
	
	public String getGender(){
		return gender;
	}
	
	public int getNameEnter(){
		return nameEnter;
	}
	
	public String getName(){
		return name1;
	}
	
	public void setText(String text){
		b.setText(text);
	}
}
