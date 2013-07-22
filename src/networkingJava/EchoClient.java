package networkingJava;
import java.io.*;
import java.net.*;
 import java.util.Scanner;
 
public class EchoClient
{
    public static void main(String[] args)
    { 
    	
    	int DEFAULT_PORT = 7222;
    	String DEFAULT_SERVER = "localhost";
    	String PROMPT = ">> ";
    	String SIGNOFF_TOKEN = "BYE";
     
    	Socket clientSocket = null;
    	PrintWriter socketWriter = null;
    	Scanner socketScanner = null;
    	Scanner keyboardScanner = null;
 
    	String hostname = args.length == 0 ? DEFAULT_SERVER : args[0];
 	
    	try
    	{
    		System.out.println("Creating Socket on " + DEFAULT_PORT);
    		clientSocket = new Socket(hostname, DEFAULT_PORT);
 	    
    		socketWriter = new PrintWriter(clientSocket.getOutputStream(), true);
    		socketScanner = new Scanner(clientSocket.getInputStream());
    		keyboardScanner = new Scanner(System.in);
 	    
    	}
    	catch (UnknownHostException e) 
    	{
    		System.err.println("Don't know about host " + hostname);
    		return;
    	}
    	catch (IOException e) 
    	{
    		System.err.println("Couldn't get I/O for the connection to " + hostname);
    		return;
    	}
 
    	String serverReply = socketScanner.nextLine();
    	System.out.println(serverReply);
 	
    	boolean done = false;
    	String userInput = "";
    	while (userInput != null && !done) 
    	{
    		System.out.print(PROMPT);  // Prompt String
    		userInput = keyboardScanner.nextLine();  // Reading line of keyboard input 
    		if(userInput == null)
    		{
    			done = true;
    		}
    		else
    		{
    			if(userInput.trim().toUpperCase().startsWith(SIGNOFF_TOKEN)) 
    			{
    				done = true;
    			}
    			socketWriter.println(userInput); // Write it to Server via socket
    			String fromServer = socketScanner.nextLine(); // Read server's reply from socket 
    			System.out.println("Server reply: " + fromServer); 
    		}
    	}
    	// It's only good manners to clean up after oneself.
    	try
    	{
    		clientSocket.close();
    		socketScanner.close();
    		keyboardScanner.close();
    	}
    	catch (java.io.IOException eio)
    	{ 
    		System.err.println(eio);
    	}
     }
}