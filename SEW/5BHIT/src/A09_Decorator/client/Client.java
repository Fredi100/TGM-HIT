package A09_Decorator.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

	private String ipAdresse;
	private int port;
	private Socket connection;

	public Client(String ipAdresse, int port) {
		this.ipAdresse = ipAdresse;
		this.port = port;
		connectToServer();
		sendMessage();
		readMessage();
	}

	private void sendMessage() {
		try (PrintWriter out = new PrintWriter(connection.getOutputStream(), true)) {
			// TODO Vielleicht die Nachricht vorher vom Nutzer einlesen
			String message = "";
			message = encodeMessage(message);
			out.println(message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Wendet die von mir definierten Decorator auf die Nachricht an, und gibt
	 * die dekorierte Nachricht zurück.
	 * 
	 * @param input
	 *            Die Nachricht die dekoriert werden soll
	 * @return Die dekorierte Nachricht
	 */
	private String encodeMessage(String input) {
		String output = input;
		// TODO Hier die Nachricht dekorieren
		return output;
	}

	private void readMessage() {
		try (InputStreamReader isr = new InputStreamReader(connection.getInputStream());
				BufferedReader in = new BufferedReader(isr)) {
			String message = in.readLine();
			// TODO Hier die message mit all den dekoratorn wieder entschlüssel
			// und dann ausgeben
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Wendet die von mir definierten Decorator in umgekehrter Reihenfolge an,
	 * um die Nachricht wieder lesbar zu mache, und gibt diese Nachricht dann
	 * wieder zurück.
	 * 
	 * @param input
	 *            Die dekorierte Nachricht
	 * @return Die lesbare Nachricht
	 */
	private String decodeMessage(String input) {
		String output = input;
		// TODO Hier die dekorierte Nachricht wieder entdeckorieren
		return output;
	}

	private void connectToServer() {
		try {
			connection = new Socket(ipAdresse, port);
		} catch (IOException e) {
			System.err.println("Verbindung zum Server konnte nicht hergestellt werden");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		if (args.length != 2) {
			System.err.println("Bitte zuerst die IP-Adresse des Servers und dann den Port angeben.");
		}
		String ipAdresse = args[0];
		int port = 0;
		try {
			port = Integer.parseInt(args[0]);
		} catch (NumberFormatException e) {
			System.err.println("Keine gültige Port Nummer");
		}
		new Client(ipAdresse, port);
	}
}
