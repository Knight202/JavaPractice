package networkingJava;

import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;

public class RQRPClient 
{
	public static void main(String args[]) throws UnknownHostException, IOException
	{	String hostName;
		int Port;
		if (args.length == 0) {hostName = "localhost"; Port = 7222;}
		else {hostName = args[0]; Port = Integer.parseInt(args[1]);}
		
		Socket clientSocket = null;
		Scanner socketScanner = null;
		PrintWriter socketWriter = null;
		
		clientSocket = new Socket(hostName, Port);
		System.out.println("Creating connection on server: " + hostName + " and port: " + Port);
		
		socketScanner = new Scanner(clientSocket.getInputStream());
		socketWriter = new PrintWriter(clientSocket.getOutputStream(),true);
		
		socketWriter.println("Hi!! My name is Client. ");
		socketWriter.println("How are you??");
		socketWriter.println("Now you will get user inputs.");	
		System.out.println("Done");
		String serverSays = socketScanner.nextLine();
		System.out.println(serverSays.length());
		while (serverSays != null)
		{
			System.out.println("Server says: " + serverSays);
			serverSays = socketScanner.nextLine();	
			serverSays.trim();
			System.out.println(serverSays.length());
		}
		
		socketScanner.close();
		socketWriter.close();
		clientSocket.close();
		
	}
}
