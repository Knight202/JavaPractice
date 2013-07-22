package ch11.MultiThreading;
/**
 * 
 * public static Thread currentThread()
 * public static void sleep(long millisecond)
 * public static void sleep(long millisecond, int nanosecond)
 * 
 * final void setName(String threadName)
 * final String getName()
 * toString()
 * 
 * @author kalpan
 *
 */
public class CurrentThreadDemo
{
	public static void main(String[] args)
	{
		Thread t = Thread.currentThread();
		String S = t.getName();
		System.out.println("Original Name: " + S);
		System.out.println(t);
		t.setName("FirstThread");
		System.out.println(t);
		S = t.getName();
		System.out.println("Modified Name: " + S);
		try
		{
			for (int i = 0; i <5; i++)
			{
				System.out.println(i);
				Thread.sleep(1000);// how is it different than this - t.sleep(1000);
				Thread.sleep(1000,20000);
			}
		}
		catch (InterruptedException E)
		{
			System.out.println(E);
		}
	}
}
