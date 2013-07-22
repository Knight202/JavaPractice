package Chapter06;
/* 
 *		This example explains difference bet. void and return types method calls.
 *		Refer with BoxDemo3.java file.
 */

public class BoxDemo4 {
	public static void main(String arg[]){
			double vol;				//data type of vol has to be double to accept value returned by method
			Box Mybox1 = new Box();
			Box Mybox2 = new Box();
			
			Mybox1.depth = 11.4;
			Mybox1.height = 20.6;
			Mybox1.Width = 35.2;
			
			Mybox2.depth = 15;
			Mybox2.height = 2;
			Mybox2.Width = 400;
	
			vol = Mybox1.Volume();
			System.out.println("Volume is " + vol);
			
			vol = Mybox2.Volume();
			System.out.println("Volume is " + vol);
		}
	}
