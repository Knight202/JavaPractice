package ch11.MultiThreading;

public class NewThreadRunnable implements Runnable
{
	Thread R;
	public NewThreadRunnable(String name)
	{
		
		System.out.println(1);
		R = new Thread(this, name);
		System.out.println(2);
		System.out.println("Child Thread is created: " + R);
		System.out.println(R.getState());
		R.start();
		System.out.println(R.getState());
		System.out.println(3);
	}
	public void run()
	{
		try
		{
			//System.out.println(R.getState());
			for (int i = 0; i < 5; i++)
			{
				System.out.println("ChildThread: " + i);
				Thread.sleep(1000);
			}
		}
		catch (InterruptedException Ex)
		{
			System.out.println(Ex);
		}
	System.out.println("Child Thread exiting");
	}
}
