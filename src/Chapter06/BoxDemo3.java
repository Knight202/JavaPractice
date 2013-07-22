package Chapter06;
/* 
 *	This example explains difference bet void and return types of methods.
 *	refer it with Box.java file
 */

public class BoxDemo3 {
	public static void main(String arg[]){
			
			Box Mybox1 = new Box();
			Box Mybox2 = new Box();
			
			Mybox1.depth = 11.4;
			Mybox1.height = 20.6;
			Mybox1.Width = 35.2;
			
			Mybox2.depth = 15;
			Mybox2.height = 2;
			Mybox2.Width = 400;
// Below 2 objects call 2 different methods that are already defined in the Box class.
			Mybox1.VoidVolume();
			System.out.println("Volume is " + Mybox2.Volume());
		}
	}
