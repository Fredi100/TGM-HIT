package ultimate_test_adventure;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Fenster extends JFrame{
	static String[] options = {"Ja","Nein"};
	static String[] genders = {"M�nnlich","Weiblich"};
	static String[] inventory = {"Hoch","Runter","Ausw�hlen","Schlie�en"};
	static String[] do_thing = {"Gehen","Inventar �ffnen","Karte �ffnen","Speichern und beenden"};
		
	public static int karteSchliessen(){
		int a = JOptionPane.showOptionDialog(null,"M�chtest du die Karte schlie�en?","",1,3,null,options,null);
		return a;
	}
	
	/**
	 * 
	 * @return
	 */
	public static int inventar(){
		int a = 0;
        switch(JOptionPane.showOptionDialog(null,"Was m�chtest du tun?","",1,3,null,inventory,null)){
            case 0: break;
            case 1: break;
            case 2: break;
            case 3: a = 1; 
                    break;
        }
		return a;
	}
	
	/**
	 * 
	 * @return
	 */
	public static int do_thing(){
		int a = JOptionPane.showOptionDialog(null,"Was m�chtest du tun?","",1,3,null,do_thing,null);
		return a;
	}
}
