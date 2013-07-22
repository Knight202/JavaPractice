package rmiShakedown;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AddServerImpl extends UnicastRemoteObject implements AddServerIntf
{
	public AddServerImpl () throws RemoteException{}
	public double add(double d1, double d2)throws RemoteException
	{
		System.out.println("I am in Add method call");
		return d1+d2;
	}
}
	
