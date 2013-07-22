package ch11.MultiThreading;

public class CallmeSync
{
	synchronized void call(String msg)		//Remove keyword synchronized to check the difference.
	{
		System.out.print("[ " + msg);
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException ex)
		{
			System.out.println(ex);
		}
		System.out.println(" ]");
	}
}
