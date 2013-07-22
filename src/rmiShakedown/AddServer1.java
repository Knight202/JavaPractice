package rmiShakedown;

import java.rmi.Naming;

public class AddServer1
{
	public static void main(String args[])
	{
		
		try
		{
			System.out.println("I am in the Server Class");
			AddServerImpl addServerImpl = new AddServerImpl();
			Naming.rebind("AddServer1", addServerImpl);
			System.out.println("I am done with Server Class");
		}
		catch(Exception e)
		{
			System.out.println("Exception : " + e);
		}
	}
}
