package networkingJava;

import java.io.*;
import java.net.Socket;
import java.net.ServerSocket;
import java.util.Scanner;
import java.io.OutputStream;
import java.io.PrintWriter;
 
 public class EchoServer
 {  
	 public static void main(String[] args )
	 { 
		 int DEFAULT_PORT = 7222;
		 String SIGN_OFF_TOKEN = "BYE";
		 ServerSocket serverSocket = null;
		 Socket clientSocket = null;
		 Scanner socketScanner = null;
	    
		 try 
		 {  
			 System.out.println("Creating ServerSocket on " + DEFAULT_PORT);
			 serverSocket = new ServerSocket(DEFAULT_PORT);
			 while(true) 
			 { 
				 System.out.println("Looking for a client. CQ, CQ, CQ!");
				 clientSocket = serverSocket.accept(); // blocks until client connects
				 System.out.println("Client connected");
 		
				 socketScanner = new Scanner(clientSocket.getInputStream());
				 OutputStream outputStream = clientSocket.getOutputStream();
				 PrintWriter outputToClient = new PrintWriter(outputStream, true);
 	  
				 outputToClient.println( "Hello! Enter BYE to exit." );
 		
				 boolean done = false;
 		
				 while (!done)
				 {  
					 String clientRequest = socketScanner.nextLine();
					 if (clientRequest == null)
					 {
						 done = true;
					 }
					 else
					 {  
						 System.out.println(">> " + clientRequest); // Prints on server side
						 if (clientRequest.trim().toUpperCase().startsWith(SIGN_OFF_TOKEN))
						 {
							 outputToClient.println("Bye, Bye, Come Again!"); // client side output
							 System.out.println("Client signed off");
							 done = true;
						 }
						 else
						 {
							 // Return the favor: send the line back to the client
							 outputToClient.println(clientRequest);
						 }
					 }
				 }
				 clientSocket.close(); // Don't hold what you're done using
			 }
		 } 
		 catch (Exception e)
		 {  
			 System.err.println(e);
		 } 
		 catch (Throwable t)
		 {
			 System.err.println("Caught throwable t: " + t);
		 }
		 finally
		 {
			 if(serverSocket != null)
			 {
				 System.out.println("Finally clause");
				 try
				 {
					 System.out.println("Cleaning up, closing sockets");
					 serverSocket.close();
					 if(clientSocket != null)
					 {
						 clientSocket.close();
					 }
				 } 
				 catch (IOException eio)
				 {
 			
				 }
			 }
		 }
 	}
}