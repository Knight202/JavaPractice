package networkingJava;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.io.IOException;

public class SimpleClient {
		
	public static void main(String args[]){
		try{
	//#######################################################	
		String serverName = args[0];
		int port = Integer.parseInt(args[1]);
		
		Socket clientSocket =null;
		
		Scanner serverScanner = null;
		PrintWriter serverWriter = null;
	//########################################################	

		System.out.println("Connecting to server " + serverName + " on port " + port);
		clientSocket = new Socket (serverName, port);
		System.out.println("Done");
//-----------------------------------------------------------------------------------------------		
		serverScanner = new Scanner(clientSocket.getInputStream());
		serverWriter = new PrintWriter(clientSocket.getOutputStream(),true);
//-------------------------------------------------------------------------------------------------		
		serverWriter.println("Hello!! How are you??");
		String responseFromServer = serverScanner.nextLine();
		System.out.println("Server says: " + responseFromServer);
		
		
		clientSocket.close();
		serverScanner.close();
		serverWriter.close();
		}
		catch (IOException e){
			System.out.println(e);
		}
		
	}
}
