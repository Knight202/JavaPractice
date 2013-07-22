package networkingJava;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.Scanner;
import java.io.PrintWriter;
import java.net.Socket;

public class RQRPServer 
{
	public static void main(String args[]) throws IOException
	{
		int Port = 7222;
		ServerSocket serverSocket = new ServerSocket(Port);
		Socket clientSocket = null;
		Scanner socketScanner = null;
		PrintWriter socketWriter = null;
		
		System.out.println("Listening on port 7222");
		clientSocket = serverSocket.accept();
		System.out.println("Connection established!!");
		
		socketScanner = new Scanner(clientSocket.getInputStream());
		socketWriter = new PrintWriter(clientSocket.getOutputStream(),true);
		
		String clientSays = socketScanner.nextLine();
		System.out.println(clientSays.length());
		while(clientSays != null)
		{
			System.out.println("Client says: " + clientSays);
			clientSays = socketScanner.nextLine();
			clientSays.trim();
			System.out.println(clientSays.length());
			
		}
		
		socketWriter.println("Hi!! My name is Server.");
		socketWriter.println("I am fine Thanks.");
		socketWriter.println("I am ready to answer user's questions.");
		
		
		clientSocket.close();
		socketScanner.close();
		socketWriter.close();
		serverSocket.close();
	}
}
