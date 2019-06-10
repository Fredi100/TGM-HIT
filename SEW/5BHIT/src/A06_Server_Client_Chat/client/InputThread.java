package A06_Server_Client_Chat.client;

import java.util.Scanner;

/**
 * Eine Klasse, die eine ChatClient Instanz entgegen nimmt, vom User laufend
 * eingaben abfragt und diese dann der ChatClient Instanz übergibt damit die
 * eingabe gesendet werden kann.
 * 
 * @author Alfred Emsenhuber
 * @version 2016-11-27
 */
public class InputThread extends Thread {

	private ChatClient instance;

	/**
	 * Konstruktur der Klasse InputThread
	 * 
	 * @param instance
	 *            Legt die ChatClient Instanz fest
	 */
	InputThread(ChatClient instance) {
		this.instance = instance;
	}

	/**
	 * Wartet durchgehend auf den Input eines Users und sendet diesen. Handelt
	 * es sich bei der Nachricht um das Wort Quit, so wird der Client beendet.
	 */
	@Override
	public void run() {
		Scanner scanner = new Scanner(System.in);
		while (instance.isRunning()) {
			String message = scanner.nextLine();
			if (message.equalsIgnoreCase("Quit")) {
				instance.stop();
			} else {
				instance.sendMessageToServer(message);
			}
		}
		scanner.close();
	}
}
