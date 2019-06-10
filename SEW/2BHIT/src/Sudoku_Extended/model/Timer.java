package Sudoku_Extended.model;

import javax.swing.JLabel;

/**
 * Erstellt einen Timer in einem eigenen Thread der solange l�uft bis der Boolean
 * timeRunning auf false gesetzt wird. Solange der Timer l�uft wird auf das �bergebene
 * Label die aktuelle Zeit geschrieben.
 * 
 * @author Niklas Hohenwarter
 * @author Alfred Emsenhuber
 * @version 2013-5-27
 */
public class Timer extends Thread {

	private int HS = 0; //Hundertstelsekunde
	private int sek = 0; //Sekunden
	private int min = 0; //Minuten
	private int h = 0; //Stunden
	private JLabel label;
	private String time="";
	private boolean timeRunning = true;

	/**
	 * Enth�llt die Timer-Funktion und das aktualisieren des Labels
	 * 
	 * @since 2013-5-27
	 */
	@Override
	public void run(){
		String hst, sekt, mint, ht;
		while (timeRunning) {
			try {
				Thread.sleep(9);
			} catch (Exception e) {
				System.out.println("Timer Error!!!");
			}
			if (HS < 99) {
				HS++;
			} else {
				HS = 0;
				if (sek < 59) {
					sek++;
				} else {
					sek = 0;
					if (min < 59) {
						min++;
					} else {
						min = 0;
						h++;
					}
				}
			}
			hst = "" + HS;
			sekt = "" + sek;
			mint = "" + min;
			ht = "" + h;
			if(HS < 10){
				hst = "0" + HS;
			}

			if(sek < 10){
				sekt = "0" + sek;
			}
			if(min < 10){
				mint = "0" + min;
			}
			if(h < 10){
				ht = "0" + h;
			}

			time = ht + " : " + mint + " : " + sekt + " : " + hst;

			label.setText("<html><body align='center'>Zeit:<br />" + time + "</body></html>");
		}

	}

	/**
	 * Setzt das zu aktualisierende Label als Attribut
	 * 
	 * @param label, das zu aktualisierende Label
	 * @since 2013-5-27
	 */
	public void setLabel(JLabel label){
		this.label = label;
	}

	/**
	 * Gibt die aktuelle Zeit als sch�n formatierten String zur�ck
	 * 
	 * @return die aktuelle Zeit
	 * @since 2013-5-27
	 */
	public String getTime(){
		return h + "h : " + min + "m : " + sek + "sek";
	}

	/**
	 * Stoppt den Timer
	 * 
	 * @since 2013-5-27
	 */
	public void cancel(){
		timeRunning = false;
	}

}
