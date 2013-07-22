package Chapter06;
/* 
 *	This example is to understand that each instance/object of a class has its own instance variable.
 	here they are different for Mybox1 and Mybox2.
 *	One more point to notice is we do not need to declare class box again as we have already declared it
 	it in Box.java file.
 */

public class BoxDemo2 {
	public static void main(String arg[]){
			double vol;
			Box Mybox1 = new Box();
			Box Mybox2 = new Box();
			
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
