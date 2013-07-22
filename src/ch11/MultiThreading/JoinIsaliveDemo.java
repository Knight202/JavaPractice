package ch11.MultiThreading;

public class JoinIsaliveDemo
{
	public static NewThreadJoinIsalive One, Two, Three;
	public static void main(String[] args)
	{
		One = new NewThreadJoinIsalive("One");
		Two = new NewThreadJoinIsalive("Two");
		Three = new NewThreadJoinIsalive("Three");
		
		System.out.println("Is Alive: " + One.t.isAlive());
		System.out.println("Is Alive: " + Two.t.isAlive());
		System.out.println("Is Alive: " + Three.t.isAlive());
		
		try
		{
			System.out.println(Thread.currentThread().getState());
			One.t.join();
			Two.t.join();
			Three.t.join();
		}
		catch (InterruptedException ex)
		{
			System.out.println(ex);
		}
		System.out.println("Is Alive: " + One.t.isAlive());
		System.out.println("Is Alive: " + Two.t.isAlive());
		System.out.println("Is Alive: " + Three.t.isAlive());
		//System.out.println(temp1.t.getState());
		//System.out.println(temp2.t.getState());
		//System.out.println(temp3.t.getState());
		System.out.println("Main Thread execution completed");
	}

}
