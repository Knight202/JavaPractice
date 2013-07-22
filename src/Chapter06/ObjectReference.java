package Chapter06;
/* 
 *	This example is to understand the concept of Object reference discussed on page 115.
 	Here both Mybox1 and Mybox2 are referring to the same object.
 	Run the program to see that both objects have same vol.
 */

public class ObjectReference {
	public static void main(String arg[]){
			double vol;
			Box Mybox1 = new Box();
			Box Mybox2 = Mybox1;
			
			Mybox1.depth = 11.4;
			Mybox1.height = 20.6;
			Mybox1.Width = 35.2;
			
			Mybox2.depth = 15;
			Mybox2.height = 2;
			Mybox2.Width = 400;
		vol = Mybox1.height * Mybox1.depth * Mybox1.Width;
		System.out.println("Volume of Mybox1 is " + vol);
		
		vol = Mybox2.height * Mybox2.depth * Mybox2.Width;
		System.out.println("Volume of Mybox2 is " + vol);
		
		}
	}
