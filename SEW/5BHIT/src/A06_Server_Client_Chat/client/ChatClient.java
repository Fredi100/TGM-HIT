package A06_Server_Client_Chat.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Eine Klasse, die einen Hostname und einen Port entgegen nimmt und dann eine
 * Verbindung zu einem Server an dieser Adresse herstellt. Sobald eine
 * Verbindung hergstellt wurde werden alle Nachrichten, die der Server sendet
 * auf der Konsole ausgegeben und der User kann selbst Nachrichten an diesen
 * Server senden.
 * 
 * @author Alfred Emsenhuber
 * @version 2016-11-27
 */
public class ChatClient {

	private static ChatClient chatClient;
	private Socket socket;
	private boolean running;

	/**
	 * Erzeugt einen neuen ChatClient der sich mit der übergebenen IP-Adresse
	 * über den definierten Port verbindet.
	 * 
	 * @param hostname
	 *            Die IP-Adresse des Servers
	 * @param portNumber
	 *            Der Port auf dem nach neuen Verbindungen gehorcht werden soll.
	 */
	private ChatClient(String hostname, int portNumber) {
		System.out.println("Versuche mit Server zu verbinden...");
		try {
			this.socket = new Socket(hostname, portNumber);
			System.out.println("Verbunden!");
			running = true;
		} catch (Exception e) {
			System.err.println("Verbindung zum Server konnte nicht hergestellt werden.");
			System.err.println(e.getLocalizedMessage());
			System.exit(-1);
		}
	}

	/**
	 * Erzeut eine neue Instanz eines ChatClient und gibt diese zurück. Wurde
	 * bereits eine ChatClient Instanz erzeugt, so wird stattdessen diese
	 * zurückgegeben. Damit kann es immer nur eine einzige ChatClient Instanz
	 * geben.
	 * 
	 * Singleton Pattern
	 * 
	 * @param hostname
	 *            Die IP-Adresse des Servers
	 * @param portNumber
	 *            Der Port, mit dem sich der Client verbinden soll
	 * @return Die ChatClient Instanz, die erzeugt wurde.
	 */
	public static ChatClient getInstance(String hostname, int portNumber) {
		if (chatClient == null) {
			chatClient = new ChatClient(hostname, portNumber);
		}
		return chatClient;
	}

	/**
	 * Versucht alle Nachrichten vom Server zu empfangen und gibt diese aus.
	 * 
	 * @return
	 */
	private void printMessagesFromServer() {
		try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
			while (!socket.isClosed()) {
				if (in.ready()) {
					String message = in.readLine();
					System.out.println("Server: " + message);
				}
			}
			in.close();
		} catch (IOException e) {
			System.err.println("Nachricht vom Server konnte nicht gelesen werden.");
			System.err.println(e.getLocalizedMessage());
		}
	}

	/**
	 * Liest eine Nachricht vom Benutzer ein und schickt diese dem Server.
	 * Sollte es sich bei der Nachricht um Quit handeln, so wird stattdessen der
	 * Client beendet.
	 */
	public void sendMessageToServer(String message) {
		try {
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			out.println(message);
		} catch (IOException e) {
			System.err.println("Nachricht konnte nicht an den Server gesendet werden.");
			System.err.println(e.getLocalizedMessage());
		}
	}

	public void run() {
		InputThread it = new InputThread(this);
		it.start();
		printMessagesFromServer();
	}

	/**
	 * Stoppt den Client indem running auf false gesetzt wird, was alle meisten
	 * Schleifen beenden sollte. Schließt den Socket um die Verbindung zum
	 * Server zu trennen.
	 */
	public void stop() {
		System.out.println("Beende Programm");
		running = false;
		try {
			socket.close();
		} catch (IOException e) {
			System.err.println("Socket konnte nicht erfolgreich geschlossen werden.");
			System.err.println(e.getLocalizedMessage());
		}
	}

	/**
	 * Gibt zurück, ob der Client noch läuft
	 * 
	 * @return True wenn der Client noch läuft. False wenn er nicht mehr läuft
	 */
	public boolean isRunning() {
		return running;
	}

	/**
	 * Main Methode
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length != 2) {
			System.err.println("Verwendung: java -jar \"FileName.jar\" <Host IP> <Portnummer>");
			System.exit(1);
		}
		String hostname = args[0];
		int portNumber = 0;
		try {
			portNumber = Integer.parseInt(args[1]);
		} catch (Exception e) {
			System.err.println("Es wurde keine valide Portnummer angegeben");
		}
		ChatClient cc = ChatClient.getInstance(hostname, portNumber);
		cc.run();
	}
}
