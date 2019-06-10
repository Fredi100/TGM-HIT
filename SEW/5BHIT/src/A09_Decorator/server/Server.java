package A09_Decorator.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	// TODO Eine einfache Klasse schreiben die als manueller Server dient
	// TODO Keine fancy multiple Clients, strikt hardcoded eine verbindung
	// herstellen

	// TODO Ich brauche einen ServerSocket der auf die Verbindung zum Client
	// wartet
	// TODO Dann kann ich zuerst den AES schlüssel per RSA austauschen, muss
	// aber nicht
	// TODO Folgende Dekorierer fände ich angemessen:
	// TODO AES Verschlüsselung, Vielleicht HashWert, Vielleicht Timestamp,
	// Vielleicht Base64
	private int port;
	private ServerSocket server;
	private Socket connection;

	public Server(int port) {
		this.port = port;
		initializeSocket();
		waitForClient();
		// TODO Ab hier mit Client kommunizieren
	}

	public void initializeSocket() {
		try {
			server = new ServerSocket(port);
		} catch (IOException e) {
			System.err.println("Konnte keinen Socket erstellen.");
			e.printStackTrace();
		}
	}

	public void waitForClient() {
		try {
			connection = server.accept();
		} catch (IOException e) {
			System.err.println("Verbindung zum Client konnte nicht hergestellt werden");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("Bitte nur den Port mit angeben");
		}
		int port = 0;
		try {
			port = Integer.parseInt(args[0]);
		} catch (NumberFormatException e) {
			System.err.println("Keine gültige Port Nummer");
		}
		new Server(port);
	}
}
