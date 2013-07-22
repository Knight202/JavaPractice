package ch11.MultiThreading;

public class ExtendedThreadDemo 
{
	public static void main(String[] args)
	{
		new NewThreadExtended("Demo Thread");
		
		try
		{
			for (int j =0; j<5; j++)
			{
				System.out.println("Main Thread: " + j);
				Thread.sleep(1000);
			}
		}
		catch (InterruptedException exc)
		{
			System.out.println( exc);
		}
	}

}
