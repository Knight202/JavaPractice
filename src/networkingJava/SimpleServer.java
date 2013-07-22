package networkingJava;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class SimpleServer {
	
	public static void main(String args[]){
		try{
	//###################################################################################	
		int PORT = 7222;
		
		ServerSocket serverSocket = null;
		Socket clientSocket = null;
		Scanner clientSocketScanner = null;
		PrintWriter replyToClient = null;
	//###################################################################################	
		System.out.println("Creating serverSocket on port: " + PORT);
		serverSocket = new ServerSocket(PORT);
		System.out.println("Looking for Client CQ CQ CQ!!");
		clientSocket = serverSocket.accept();
		System.out.println("Connection established!!");
//---------------------------------------------------------------------------------		
		clientSocketScanner = new Scanner(clientSocket.getInputStream());
		replyToClient = new PrintWriter(clientSocket.getOutputStream(),true);
//---------------------------------------------------------------------------------		
		System.out.println("Client says: " + clientSocketScanner.nextLine());
		replyToClient.println("I am fine. Thank you!!");
		
		
		
		serverSocket.close();
		clientSocket.close();
		clientSocketScanner.close();
		replyToClient.close();
		}
		catch (IOException ex){
			System.out.println(ex);
		}
		
	}
}
