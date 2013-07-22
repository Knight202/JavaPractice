package rmiShakedown;

import java.rmi.Naming;

public class AddClient 
{
	public static void main(String args[])
	{
		try
		{
			String addServerUrl = "rmi://" + args[0] + "/AddServer1";
			AddServerIntf addServerIntf = (AddServerIntf)Naming.lookup(addServerUrl);
			System.out.println("The First no is: " + args[1]);
			double d1 = Double.valueOf(args[1]).doubleValue();
			System.out.println("The second no. is: " + args[2]);
			double d2 = Double.valueOf(args[2]).doubleValue();
			
			System.out.println("The sum is: " + addServerIntf.add(d1, d2));
		}
		catch(Exception ex)
		{
			System.out.println("Exception : " + ex);
		}
	}
}
