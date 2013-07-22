package ch11.MultiThreading;

public class MultiThreadDemo
{
	public static void main(String[] args)
	{
		NewMultipleThread temp1 = new NewMultipleThread("First");
		NewMultipleThread temp2 = new NewMultipleThread("Second");
		NewMultipleThread temp3 = new NewMultipleThread("Third");
		
		try
		{
			Thread.sleep(10000);
		}
		catch (InterruptedException ex)
		{
			System.out.println(ex);
		}
		System.out.println(temp1.t.getState());
		System.out.println(temp2.t.getState());
		System.out.println(temp3.t.getState());
		System.out.println("Main Thread execution completed");
	}

}
