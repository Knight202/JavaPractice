package ch11.MultiThreading;

public class NewThreadJoinIsalive implements Runnable
{
	String name;
	Thread t;
	
	public NewThreadJoinIsalive(String name)
	{
		this.name = name;
		t = new Thread(this, name);
		System.out.println("New Thread created with details: " + t);
		t.start();
		System.out.println("Priority: " + t.getPriority());
	}
	
	public void run()
	{
		try
		{
			for (int i = 0; i < 5; i++)
			{
				System.out.println(name + ": " + i);
				Thread.sleep(2000);
				t.setPriority(t.getPriority()+1);
			}
			
			System.out.println("Priority: " + t.getPriority());
		}
		catch (InterruptedException ex)
		{
			System.out.println(ex);
		}
		System.out.println("Execution completed for thread: " + name);
	}
}
