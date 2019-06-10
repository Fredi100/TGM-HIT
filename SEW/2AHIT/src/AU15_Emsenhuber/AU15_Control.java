package AU15_Emsenhuber;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Control Klasse
 * Behandelt alle Aktionen
 * 
 * @author Alfred Emsenhuber
 * @version 2014-03-14
 */
public class AU15_Control implements ActionListener{
	private AU15_Model m;
	private AU15_Frame f;
	/**
	 * Konstruktor, erzeugt zwei neue Objekte vom Typ AU15_Model und AU15_Frame
	 */
	public AU15_Control(){
		m = new AU15_Model();
		f = new AU15_Frame(this);
	}
	
	/**
	 * Wird ausgeführt wenn der Knopf zum berechnen des Pascalschen Dreiecks gedrückt wird
	 * Fragt die ausgewählte Größe ab und startet dann die Methoden in Model und übergibt dem Frame den fertigen String
	 */
	public void run(){
		int size = Integer.parseInt((String) f.getAuswahl());
		long[][] array = m.pascal(size);
		String output = m.arryToString(array, size);
		this.f.setTextPane(output);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand().equals("Blub")){
			run();
		}
	}
}
