package ch11.MultiThreading;

public class CallerSync implements Runnable
{
	String msg;
	CallmeSync target;
	Thread t;
	
	public CallerSync(CallmeSync targ, String s)
	{
		target = targ;
		msg = s;
		t = new Thread(this);
		t.start();
	}
	
	public void run()
	{
	//	synchronized(target)		Remove comments to test Sychronized statement functionality
	//	{
			target.call(msg);
	//	}
	}
}
