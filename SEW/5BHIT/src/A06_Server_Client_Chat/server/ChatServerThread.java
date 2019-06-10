package A06_Server_Client_Chat.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Ein Chat-Server Thread der einen Socket entgegennimmt und dann Nachrichten von diesem liest
 * und sie an alle anderen weiterleitet, die sich in der socketList befinden.
 * 
 * @author Alfred Emsenhuber
 * @version 2016-11-27
 */
public class ChatServerThread extends Thread {

	private static List<Socket> socketList = Collections.synchronizedList(new ArrayList<Socket>());
	private Socket socket;

	public ChatServerThread(Socket socket) {
		super("ChatServerThread");
		System.out.println("Client akzeptiert.");
		synchronized (socketList) {
			socketList.add(socket);
		}
		this.socket = socket;
	}

	/**
	 * Wartet auf eine Nachricht. Sobald eine Nachricht empfangen wurde wird
	 * diese an alle Sockets geschickt, die derzeit verbunden sind.
	 */
	public void run() {
		try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
			String inputLine = "";
			while (!socket.isClosed()) {
				if (in.ready()) {
					inputLine = in.readLine();
					synchronized (socketList) {
						for (Socket s : socketList) {
							if (s != socket) {
								PrintWriter out = new PrintWriter(s.getOutputStream(), true);
								out.println(inputLine);
							}
						}
					}
				}
			}
			socketList.remove(socket);
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
