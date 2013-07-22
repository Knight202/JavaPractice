package Chapter06;


public class BoxDemo {
	public static void main(String arg[]){
		double vol;
		Box Mybox = new Box();
											// TESTCASE-1 "Can I create Objects in side the classes itself?" - YES CHECK BELOW.
		Mybox.depth = 10;					
		Mybox.height = 22;
		Mybox.Width = 40;
		
		vol = Mybox.depth * Mybox.height * Mybox.Width;
		
		System.out.println("Volume of Mybox is " + vol);
	}
}

/*TESTCASE -1

// YOU CAN ALSO CHECK THE INITIAL VALUE OF ANY INSTANCE VARIABLE OF AN OBJECT BY RUNNING THIS CODE

public class BoxDemo {
	String vol;
	public static void main(String arg[]){
		
		BoxDemo subobject = new BoxDemo();
		
	    System.out.println("1"+ subobject.vol  + "1");
	}
}
*/