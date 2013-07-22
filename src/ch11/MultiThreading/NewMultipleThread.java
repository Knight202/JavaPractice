package ch11.MultiThreading;

public class NewMultipleThread implements Runnable
{
	String name;
	Thread t;
	
	public NewMultipleThread(String name)
	{
		this.name = name;
		t = new Thread(this, name);
		System.out.println("Thread created: " + t);
		t.start();
	}
	
	public void run()
	{
		try
		{
			for (int i = 0; i < 5; i++)
			{
				System.out.println(name + ": " + i);
				Thread.sleep(2000);
			}
		}
		catch (InterruptedException ex)
		{
			System.out.println(ex);
		}
		System.out.println("Execution completed for thread: " + name);
	}
}
