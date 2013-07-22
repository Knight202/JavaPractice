//THIS IS EVEN BETTER WAY OF WRITING BoxDemo5 WITH PARAMETERIZED CONSTRUCTORS.

package Chapter06;

public class BoxDemo6 {
	public static void main(String[] args) {
		double vol;
		Box1 Mybox1 = new Box1(11.4,20.6,35.2);
		Box1 Mybox2 = new Box1(15,2,400);
		
		vol = Mybox1.Volume();						//METHOD Volume() should have been defined in the class BOX1.java
		System.out.println("Volume is " + vol);		// This means OBJECTS CAN ONLY ACCESS METHODS THOSE ARE DEFINED IN HIS CLASS NOT OTHER CLASS
		
		vol = Mybox2.Volume();
		System.out.println("Volume is " + vol);
		
	}

}