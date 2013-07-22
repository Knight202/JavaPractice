package ch11.MultiThreading;

public class SyncDemo
{
	public static void main(String[] args)
	{
		CallmeSync target = new CallmeSync();
		CallerSync ob1 = new CallerSync(target, "Hello");
		CallerSync ob2 = new CallerSync(target, "Synchronized");
		CallerSync ob3 = new CallerSync(target, "World!!");
		
		try
		{
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}
		catch (InterruptedException ex)
		{
			System.out.println(ex);
		}
	}
}
