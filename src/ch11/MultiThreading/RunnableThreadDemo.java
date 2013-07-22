package ch11.MultiThreading;

public class RunnableThreadDemo
{
	public static void main(String[] args)
	{
		//System.out.println(Thread.currentThread().getState());
		//NewThreadRunnable thread = new NewThreadRunnable("Demo Thread");
		new NewThreadRunnable("Demo Thread");
		System.out.println(11);
		try
		{
			for(int i = 0; i < 5; i++)
			{
				System.out.println("Main Thread: " + i);
				Thread.sleep(1000);
				//System.out.println(thread.R.getState());
			}
		}
		catch (InterruptedException Ex)
		{
			System.out.println(Ex);
		}
		System.out.println("Main Thread exiting");
		}
}
