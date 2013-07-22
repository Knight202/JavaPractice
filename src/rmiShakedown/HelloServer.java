package rmiShakedown;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloServer extends UnicastRemoteObject implements HelloIntf
{
	public HelloServer() throws RemoteException{}
	public String sayHello()
	{
		return "Hello World!!";
	}
	
	public static void main(String args[])
	{
		try
		{
			HelloServer remoteObject = new HelloServer();
			Naming.bind("REMOTE", remoteObject);
			System.out.println("REMOTE Object added to the rmi registry");
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
	}
}
