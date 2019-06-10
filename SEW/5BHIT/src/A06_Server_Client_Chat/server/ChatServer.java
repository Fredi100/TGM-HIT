package A06_Server_Client_Chat.server;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * Eine Chat-Server Klasse die sich darum kümmert eingehende Verbindungen
 * anzunehmen und sie auf eigene Threads aufteilt.
 * 
 * @author Alfred Emsenhuber
 * @version 2016-11-27
 */
public class ChatServer {

	private static ChatServer chatServer;
	private boolean listening;
	private int portNumber;

	/**
	 * Erzeugt einen neuen ChatServer der auf der übergebenen Port Nummer
	 * horcht.
	 * 
	 * @param portNumber
	 *            Der Port auf dem nach neuen Verbindungen gehorcht werden soll.
	 */
	private ChatServer(int portNumber) {
		this.listening = true;
		this.portNumber = portNumber;
	}

	/**
	 * Erzeut eine neue Instanz eines ChatServer und gibt diese zurück. Wurde
	 * bereits eine ChatServer Instanz erzeugt, so wird stattdessen diese
	 * zurückgegeben. Damit kann es immer nur eine einzige ChatServer Instanz
	 * geben.
	 * 
	 * Singleton Pattern
	 * 
	 * @param portNumber
	 *            Der Port, auf dem nach neuen Verbindungen gehorcht werden
	 *            soll.
	 * @return Die ChatServer Instanz, die erzeugt wurde.
	 */
	public static ChatServer getInstance(int portNumber) {
		if (ChatServer.chatServer == null) {
			ChatServer.chatServer = new ChatServer(portNumber);
		}
		return ChatServer.chatServer;
	}

	/**
	 * Sagt dem Server, neue Client Verbindungen zu akzeptieren.
	 */
	public void startListening() {
		try (ServerSocket serverSocket = new ServerSocket(portNumber)) {
			while (listening) {
				System.out.println("Warte auf neuen Client...");
				new ChatServerThread(serverSocket.accept()).start();
			}
		} catch (IOException e) {
			System.err.println("Konnte nicht auf folgendem Port horchen: " + portNumber);
			System.err.println(e.getLocalizedMessage());
		}
	}

	/**
	 * Sagt dem Server, nicht mehr auf neue Client Anfragen zu reagieren. Dies
	 * beendet den Server nicht, solange noch Verbindungen zu anderen Clients
	 * aktiv sind.
	 */
	public void stopListening() {
		this.listening = false;
	}

	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("Verwendung: java -jar \"FileName.jar\" <Portnummer>");
			System.exit(1);
		}
		int portNumber = 0;
		try {
			portNumber = Integer.parseInt(args[0]);
		} catch (Exception e) {
			System.err.println("Es wurde keine valide Portnummer angegeben");
		}
		ChatServer cs = ChatServer.getInstance(portNumber);
		cs.startListening();
	}
}
