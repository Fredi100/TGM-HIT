package AU17_Emsenhuber;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;

/**
 * Extended View und erweitert es um 4 weitere Buttons
 * 
 * @author xXFredi100Xx
 * @version 2014-03-21
 */
@SuppressWarnings("serial")
public class ViewExtended extends View{
	public static String SPOCK = "Spock";
	public static String LIZARD = "Echse";
	
	JButton bSpock, bSpockPC, bLizard, bLizardPC;
	
	/**
	 * Initialisiert alle fehlenden Komponenten und weißt ihnen Werte zu
	 * 
	 * @param c Das ControlExtended Objekt von dem es erzeugt wurde
	 */
	public ViewExtended(ControlExtended c){
		super(c);
		bSpock = new JButton(SPOCK);
		bSpockPC = new JButton(SPOCK);
		bLizard = new JButton(LIZARD);
		bLizardPC = new JButton(LIZARD);
		
		bLizard.setBackground(Color.WHITE);
		bLizardPC.setBackground(Color.WHITE);
		bSpock.setBackground(Color.WHITE);
		bSpockPC.setBackground(Color.WHITE);
		
		bLizard.setBackground(Color.WHITE);
		bLizardPC.setBackground(Color.WHITE);
		bSpock.setBackground(Color.WHITE);
		bSpockPC.setBackground(Color.WHITE);
		
		bLizard.setActionCommand(LIZARD);
		bSpock.setActionCommand(SPOCK);
		
		bLizard.addActionListener(c);
		bSpock.addActionListener(c);
	}
	
	/**
	 * Erweitert die ursprüngliche Methode um 2 Buttons
	 */
	@Override
	public void addButtons(){
		pButtons.setLayout(new GridLayout(1,5));
		pButtons.add(bSchere);
		pButtons.add(bStein);
		pButtons.add(bPapier);
		pButtons.add(bLizard);
		pButtons.add(bSpock);
	}
	
	/**
	 * Erweitert die ursprüngliche Methode um 2 Buttons
	 */
	@Override
	public void addButtonsPC(){
		pButtonsPC.setLayout(new GridLayout(1,5));
		pButtonsPC.add(bScherePC);
		pButtonsPC.add(bSteinPC);
		pButtonsPC.add(bPapierPC);
		pButtonsPC.add(bLizardPC);
		pButtonsPC.add(bSpockPC);
	}
	
	/**
	 * Erweitert die ursprüngliche Methode um 2 Buttons
	 */
	@Override
	public void selectButton(int button){
		bSchere.setEnabled(false);
		bStein.setEnabled(false);
		bPapier.setEnabled(false);
		bLizard.setEnabled(false);
		bSpock.setEnabled(false);
		if(button == 1){
			bSchere.setBackground(Color.BLUE);
			bStein.setBackground(Color.LIGHT_GRAY);
			bPapier.setBackground(Color.LIGHT_GRAY);
			bLizard.setBackground(Color.LIGHT_GRAY);
			bSpock.setBackground(Color.LIGHT_GRAY);
		}else if(button == 2){
			bSchere.setBackground(Color.LIGHT_GRAY);
			bStein.setBackground(Color.BLUE);
			bPapier.setBackground(Color.LIGHT_GRAY);
			bLizard.setBackground(Color.LIGHT_GRAY);
			bSpock.setBackground(Color.LIGHT_GRAY);
		}else if(button == 3){
			bSchere.setBackground(Color.LIGHT_GRAY);
			bStein.setBackground(Color.LIGHT_GRAY);
			bPapier.setBackground(Color.BLUE);
			bLizard.setBackground(Color.LIGHT_GRAY);
			bSpock.setBackground(Color.LIGHT_GRAY);
		}else if(button == 4){
			bSchere.setBackground(Color.LIGHT_GRAY);
			bStein.setBackground(Color.LIGHT_GRAY);
			bPapier.setBackground(Color.LIGHT_GRAY);
			bLizard.setBackground(Color.BLUE);
			bSpock.setBackground(Color.LIGHT_GRAY);
		}else if(button == 5){
			bSchere.setBackground(Color.LIGHT_GRAY);
			bStein.setBackground(Color.LIGHT_GRAY);
			bPapier.setBackground(Color.LIGHT_GRAY);
			bLizard.setBackground(Color.LIGHT_GRAY);
			bSpock.setBackground(Color.BLUE);
		}else{
			System.out.println("Falsche übergabe bei Methode selectButton in der Klasse View. Erwarte int von 1 bis 5. Bekomme: " + button);
		}
	}
	
	/**
	 * Erweitert die ursprüngliche Methode um 2 Buttons
	 */
	@Override
	public void selectButtonPC(int button){
		bScherePC.setEnabled(false);
		bSteinPC.setEnabled(false);
		bPapierPC.setEnabled(false);
		bLizardPC.setEnabled(false);
		bSpockPC.setEnabled(false);
		if(button == 1){
			bScherePC.setBackground(Color.YELLOW);
			bSteinPC.setBackground(Color.LIGHT_GRAY);
			bPapierPC.setBackground(Color.LIGHT_GRAY);
			bLizardPC.setBackground(Color.LIGHT_GRAY);
			bSpockPC.setBackground(Color.LIGHT_GRAY);
		}else if(button == 2){
			bScherePC.setBackground(Color.LIGHT_GRAY);
			bSteinPC.setBackground(Color.YELLOW);
			bPapierPC.setBackground(Color.LIGHT_GRAY);
			bLizardPC.setBackground(Color.LIGHT_GRAY);
			bSpockPC.setBackground(Color.LIGHT_GRAY);
		}else if(button == 3){
			bScherePC.setBackground(Color.LIGHT_GRAY);
			bSteinPC.setBackground(Color.LIGHT_GRAY);
			bPapierPC.setBackground(Color.YELLOW);
			bLizardPC.setBackground(Color.LIGHT_GRAY);
			bSpockPC.setBackground(Color.LIGHT_GRAY);
		}else if(button == 4){
			bScherePC.setBackground(Color.LIGHT_GRAY);
			bSteinPC.setBackground(Color.LIGHT_GRAY);
			bPapierPC.setBackground(Color.LIGHT_GRAY);
			bLizardPC.setBackground(Color.YELLOW);
			bSpockPC.setBackground(Color.LIGHT_GRAY);
		}else if(button == 5){
			bScherePC.setBackground(Color.LIGHT_GRAY);
			bSteinPC.setBackground(Color.LIGHT_GRAY);
			bPapierPC.setBackground(Color.LIGHT_GRAY);
			bLizardPC.setBackground(Color.LIGHT_GRAY);
			bSpockPC.setBackground(Color.YELLOW);
		}else{
			System.out.println("Falsche übergabe bei Methode selectButtonPC in der Klasse View. Erwarte int von 1 bis drei. Bekomme: " + button);
		}
	}
	
	/**
	 * Erweitert die ursprüngliche Methode um 4 Buttons
	 */
	@Override
	public void resetRound(){
		bSchere.setEnabled(true);
		bStein.setEnabled(true);
		bPapier.setEnabled(true);
		bLizard.setEnabled(true);
		bSpock.setEnabled(true);
		bScherePC.setEnabled(true);
		bSteinPC.setEnabled(true);
		bPapierPC.setEnabled(true);
		bLizardPC.setEnabled(true);
		bSpockPC.setEnabled(true);
		bSchere.setBackground(Color.WHITE);
		bStein.setBackground(Color.WHITE);
		bPapier.setBackground(Color.WHITE);
		bLizard.setBackground(Color.WHITE);
		bSpock.setBackground(Color.WHITE);
		bScherePC.setBackground(Color.WHITE);
		bSteinPC.setBackground(Color.WHITE);
		bPapierPC.setBackground(Color.WHITE);
		bLizardPC.setBackground(Color.WHITE);
		bSpockPC.setBackground(Color.WHITE);
		lPlayer.setBackground(Color.WHITE);
		lComputer.setBackground(Color.WHITE);
	}
}
