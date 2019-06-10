package AU17_Emsenhuber;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * View kümmert sich um die Darstellung des Spieles für den Spieler
 * 
 * @author xXFredi100Xx
 * @version 2014-03-21
 */
@SuppressWarnings("serial")
public class View extends JFrame{
	public static String SCHERE = "Schere";
	public static String STEIN = "Stein";
	public static String PAPIER = "Papier";
	public static String NEUSTART = "Neue Runde";
	
	protected JButton bSchere;
	protected JButton bStein;
	protected JButton bPapier;
	private JButton bNeustart;
	protected JButton bScherePC;
	protected JButton bSteinPC;
	protected JButton bPapierPC;
	private JLabel lWin, lWinText, lLose, lLoseText, lDraw, lDrawText, lGames, lGamesText, lVersus;
	protected JLabel lComputer;
	protected JLabel lPlayer;
	private JPanel pAlles, pGame;
	protected JPanel pButtons;
	protected JPanel pButtonsPC;
	private JPanel pEast;
	private JPanel pAusgabe;
	private Control c;
	public double width, height;
	
	/**
	 * Initialisiert alle Attribute und weißt ihnen Werte zu
	 * 
	 * @param c Das Control Objekt mit den ActionListenern
	 */
	public View(Control c){
		this.c = c;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();	//Fragt die Dimensionen des Bildschirms ab
		width = screenSize.getWidth();
		height = screenSize.getHeight();
		
		bSchere = new JButton(SCHERE);
		bStein = new JButton(STEIN);
		bPapier = new JButton(PAPIER);
		bNeustart = new JButton(NEUSTART);
		bScherePC = new JButton(SCHERE);
		bSteinPC = new JButton(STEIN);
		bPapierPC = new JButton(PAPIER);
		pAlles = new JPanel();
		pGame = new JPanel();
		pEast = new JPanel();
		pButtons = new JPanel();
		pButtonsPC = new JPanel();
		pAusgabe = new JPanel();
		lWin = new JLabel("0");
		lWinText = new JLabel("Siege: ");
		lLose = new JLabel("0");
		lLoseText = new JLabel("Niederlagen: ");
		lDraw = new JLabel("0");
		lDrawText = new JLabel("Unentschieden: ");
		lGames = new JLabel("0");
		lGamesText = new JLabel("Spiele: ");
		lVersus = new JLabel("VS.");
		lComputer = new JLabel("Computer");
		lPlayer = new JLabel("Player");
		
		lWin.setHorizontalAlignment(SwingConstants.RIGHT);
		lLose.setHorizontalAlignment(SwingConstants.RIGHT);
		lDraw.setHorizontalAlignment(SwingConstants.RIGHT);
		lGames.setHorizontalAlignment(SwingConstants.RIGHT);
		
		bSchere.setBackground(Color.WHITE);
		bStein.setBackground(Color.WHITE);
		bPapier.setBackground(Color.WHITE);
		bScherePC.setBackground(Color.WHITE);
		bSteinPC.setBackground(Color.WHITE);
		bPapierPC.setBackground(Color.WHITE);
		
		bSchere.setActionCommand(SCHERE);
		bStein.setActionCommand(STEIN);
		bPapier.setActionCommand(PAPIER);
		bNeustart.setActionCommand(NEUSTART);
		bSchere.addActionListener(this.c);
		bStein.addActionListener(this.c);
		bPapier.addActionListener(this.c);
		bNeustart.addActionListener(this.c);
		
		lVersus.setHorizontalAlignment(SwingConstants.CENTER);
		lVersus.setFont(new Font("Versus", Font.PLAIN, 30));
		lVersus.setOpaque(true);
		lVersus.setBackground(Color.WHITE);
		lComputer.setHorizontalAlignment(SwingConstants.CENTER);
		lComputer.setFont(new Font("Versus", Font.PLAIN, 30));
		lComputer.setOpaque(true);
		lComputer.setBackground(Color.WHITE);
		lPlayer.setHorizontalAlignment(SwingConstants.CENTER);
		lPlayer.setFont(new Font("Versus", Font.PLAIN, 30));
		lPlayer.setOpaque(true);
		lPlayer.setBackground(Color.WHITE);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	/**
	 * Fügt alle playerButtons auf das Panel pButton
	 */
	public void addButtons(){
		pButtons.setLayout(new GridLayout(1,3));
		pButtons.add(bSchere);
		pButtons.add(bStein);
		pButtons.add(bPapier);
	}
	
	/**
	 * Fügt alle pcButtons auf das Panel pButtonPC
	 */
	public void addButtonsPC(){
		pButtonsPC.setLayout(new GridLayout(1,3));
		pButtonsPC.add(bScherePC);
		pButtonsPC.add(bSteinPC);
		pButtonsPC.add(bPapierPC);
	}
	
	/**
	 * Fügt alle Spiel Komponenten auf das Panel pGame
	 */
	public void addGame(){
		pGame.setLayout(new GridLayout(5,1));
		pGame.add(pButtonsPC);
		pGame.add(lComputer);
		pGame.add(lVersus);
		pGame.add(lPlayer);
		pGame.add(pButtons);
	}
	
	/**
	 * Fügt alle Ausgaben auf das Panel pAusgabe
	 */
	public void addAusgabe(){
		pAusgabe.setLayout(new GridLayout(4,2));
		pAusgabe.add(lWinText);
		pAusgabe.add(lWin);
		pAusgabe.add(lDrawText);
		pAusgabe.add(lDraw);
		pAusgabe.add(lLoseText);
		pAusgabe.add(lLose);
		pAusgabe.add(lGamesText);
		pAusgabe.add(lGames);
	}
	
	/**
	 * Fügt das Panel pAusgabe und den Button bNeustart auf das Panel pEast
	 */
	public void addEast(){
		pEast.setLayout(new GridLayout(2,1));
		pEast.add(pAusgabe);
		pEast.add(bNeustart);
	}
	
	/**
	 * Fügt das Panel pGame und pEast auf das Panel pAlles
	 */
	public void addAlles(){
		pAlles.setLayout(new GridLayout(1,2));
		pAlles.add(pGame);
		pAlles.add(pEast);
		add(pAlles);
	}
	
	/**
	 * Färbt den vom Spieler ausgewählten Button Blau, alle anderen Grau und deaktiviert sie.
	 * 
	 * @param button Die Auswahl des Spielers
	 */
	public void selectButton(int button){
		bSchere.setEnabled(false);
		bStein.setEnabled(false);
		bPapier.setEnabled(false);
		if(button == 1){
			bSchere.setBackground(Color.BLUE);
			bStein.setBackground(Color.LIGHT_GRAY);
			bPapier.setBackground(Color.LIGHT_GRAY);
		}else if(button == 2){
			bSchere.setBackground(Color.LIGHT_GRAY);
			bStein.setBackground(Color.BLUE);
			bPapier.setBackground(Color.LIGHT_GRAY);
		}else if(button == 3){
			bSchere.setBackground(Color.LIGHT_GRAY);
			bStein.setBackground(Color.LIGHT_GRAY);
			bPapier.setBackground(Color.BLUE);
		}else{
			System.out.println("Falsche übergabe bei Methode selectButton in der Klasse View. Erwarte int von 1 bis drei. Bekomme: " + button);
		}
	}
	
	/**
	 * Färbt den vom Computer ausgewählten Button Gelb, alle anderen Grau und deaktiviert sie.
	 * 
	 * @param button Die Auswahl des Computers
	 */
	public void selectButtonPC(int button){
		bScherePC.setEnabled(false);
		bSteinPC.setEnabled(false);
		bPapierPC.setEnabled(false);
		if(button == 1){
			bScherePC.setBackground(Color.YELLOW);
			bSteinPC.setBackground(Color.LIGHT_GRAY);
			bPapierPC.setBackground(Color.LIGHT_GRAY);
		}else if(button == 2){
			bScherePC.setBackground(Color.LIGHT_GRAY);
			bSteinPC.setBackground(Color.YELLOW);
			bPapierPC.setBackground(Color.LIGHT_GRAY);
		}else if(button == 3){
			bScherePC.setBackground(Color.LIGHT_GRAY);
			bSteinPC.setBackground(Color.LIGHT_GRAY);
			bPapierPC.setBackground(Color.YELLOW);
		}else{
			System.out.println("Falsche übergabe bei Methode selectButtonPC in der Klasse View. Erwarte int von 1 bis drei. Bekomme: " + button);
		}
	}
	
	/**
	 * Färbt den Gewinner Grün, den Verlierer Rot und bei Unentschieden beide Rot
	 * 
	 * @param winner Der vom Computer ermittelte Gewinner
	 */
	public void selectWinner(int winner){
		if(winner == 1){
			lPlayer.setBackground(Color.GREEN);
			lComputer.setBackground(Color.RED);
		}else if(winner == 2){
			lPlayer.setBackground(Color.RED);
			lComputer.setBackground(Color.RED);
		}else if(winner == 3){
			lComputer.setBackground(Color.GREEN);
			lPlayer.setBackground(Color.RED);
		}else{
			System.out.println("Falsche übergabe bei Methode selectWinner in der Klasse View. Erwarte int von 1 bis 3. Bekomme: " + winner);
		}
	}
	
	/**
	 * Aktiviert wieder alle Buttons und setzt ihre Farbe wieder auf den Default Wert
	 */
	public void resetRound(){
		bSchere.setEnabled(true);
		bStein.setEnabled(true);
		bPapier.setEnabled(true);
		bScherePC.setEnabled(true);
		bSteinPC.setEnabled(true);
		bPapierPC.setEnabled(true);
		bSchere.setBackground(Color.WHITE);
		bStein.setBackground(Color.WHITE);
		bPapier.setBackground(Color.WHITE);
		bScherePC.setBackground(Color.WHITE);
		bSteinPC.setBackground(Color.WHITE);
		bPapierPC.setBackground(Color.WHITE);
		lPlayer.setBackground(Color.WHITE);
		lComputer.setBackground(Color.WHITE);
	}
	
	/**
	 * Setzt die Werte der Ergebnisse
	 * 
	 * @param wins Die Anzahl der Siege
	 * @param draws Die Anzahl der Unentschieden
	 * @param loses Die Anzahl der Niederlagen
	 * @param games Die Anzahl der gespielten Spiele
	 */
	public void setText(int wins, int draws, int loses, int games){
		lWin.setText(""+wins);
		lDraw.setText(""+draws);
		lLose.setText(""+loses);
		lGames.setText(""+games);
	}
}
