/*****
 **
 **  USCA ACSC492F
 **
 */

import java.io.*;
import java.net.*;
import java.nio.file.*;
import java.util.*;

public class EmailClient {

	Socket clientSocket;
	Scanner In;
	DataOutputStream Out;

	// A email sender
	public EmailClient(String Host, int Port) {
		Random r = new Random();
		int rand = (int) r.nextInt((9 - 0) + 1) + 0;
		String[] names = new String[]{"cindy", "mike", "tom", "sue", "mary", "jane", "margaret", "bob", "mark", "mo"};
		String thisName = names[rand];

		try {

			// Establish a TCP connection with the mail server.
			clientSocket = new Socket(Host, Port);

			// Create a Scanner to read a line at a time.
			In = new Scanner(clientSocket.getInputStream());

			// Get a reference to the socket's output stream.
			Out = new DataOutputStream(clientSocket.getOutputStream());

			// Read greeting from the server.
			String response = In.nextLine();
			System.out.println(response);
			if (!response.startsWith("220")) {
				throw new Exception("220 reply not received from server. ");
			}

			// Send HELO command and get server response.
			String message = "HELO usca.edu\r\n";
			System.out.print(message);
			Out.writeBytes(message);
			response = In.nextLine();
			System.out.println(response);
			if (!response.startsWith("250")) {
				throw new Exception("250 reply not received from server. Handshaking failed.");
			}

			// Send MAIL FROM command.
			message = "MAIL FROM: "+thisName+"@usca.edu\r\n";
			System.out.print(message);
			Out.writeBytes(message);
			response = In.nextLine();
			if (!response.startsWith("250")) {
				throw new Exception("250 reply not received from server. MAIL FROM not accepted");
			}

			// Send RCPT TO command.
			message = "RCPT TO: acsc415@gmail.com\r\n";
			System.out.print(message);
			Out.writeBytes(message);
			response = In.nextLine();
			if (!response.startsWith("250")) {
				throw new Exception("250 reply not received from server. RCPT TO not accepted");
			}

			// Send DATA command.
			message = "DATA\r\n";
			System.out.print(message);
			Out.writeBytes(message);
			response = In.nextLine();
			if (!response.startsWith("354")) {
				throw new Exception("354 reply not received from server. DATA not accepted");
			}

			// Send message data.
			message = "From: "+thisName+"@usca.edu\r\nTo: acsc415@gmail.com\r\nSubject: Hello\r\nMIME-Version:1.0\r\nContent-Type: multipart/mixed; boundary=\"simple boundary\"\r\n\r\n--simple boundary\r\nContent-Type: text/plain; charset=\"iso-8859-1\"\r\n\r\nThis is a main body. \r\n\r\n--simple boundary\r\nContent-Type: image/jpeg; name=\"uscaicon.jpg\"\r\nContent-Description: uscaicon.jpg\r\nContent-Disposition: attachment; filename=\"uscaicon.jpg\"; size=14416;\r\nContent-Transfer-Encoding: base64\r\n\r\n";
			String fakeOne = "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\r\n\r\n--simple boundary--\r\n";
			String end = "\r\n\r\n.\r\n";
			String main = message+fakeOne+end;
			System.out.print(main);
			Out.writeBytes(main);
			response = In.nextLine();
			if (!response.startsWith("250")) {
				throw new Exception("250 reply not received from server. QUEUED DATA not accepted");
			}

			// Send QUIT command.
			message = "QUIT\r\n";
			System.out.print(message);
			Out.writeBytes(message);
			response = In.nextLine();
			if (!response.startsWith("221")) {
				throw new Exception("221 reply not received from server. QUIT not accepted");
			}

			// close socket and all streams
			if (clientSocket != null)
				clientSocket.close();
			if (In != null)
				In.close();
			if (Out != null)
				Out.close();

		} catch (Exception e) {
			System.err.print(e.getMessage());
		}

	}

	// Send message and get response from mail server
	public String send(String message) throws IOException {
		System.out.print(message);
		Out.writeBytes(message);
		String response = In.nextLine();
		System.out.println(response);
		return response;
	}

	public static void main(String argv[]) throws Exception {
		for(int i = 0; i<1; i++){
			EmailClient p = new EmailClient("129.252.199.151", 25);
		}
	}
}