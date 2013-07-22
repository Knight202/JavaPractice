package rmiShakedown;

import java.rmi.Naming;

public class HelloClient
{
	public static void main(String args[])
	{
		try
		{
			HelloIntf remoteCall = (HelloIntf)Naming.lookup("REMOTE");
			String finalOutput = remoteCall.sayHello();
			System.out.println(finalOutput);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
