package ch11.MultiThreading;

public class NewThreadExtended extends Thread
{
	public NewThreadExtended(String name)
	{
		super(name);
		System.out.println("Child Thread created: " + this);
		start();
	}
	public void run()
	{
		try
		{
			for (int i =0; i < 5; i++)
			{
				System.out.println("Child Thread: " + i);
				Thread.sleep(500);
			}
		}
		catch (InterruptedException ex)
		{
			System.out.println(ex);
		}
	}
}
