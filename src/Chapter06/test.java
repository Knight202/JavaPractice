package Chapter06;
/*
 * This example is to explain concept of "Instance variable hiding".
 * here, in testthis constructor if you will change the parameters (double Width, double height, double depth)
 * to (double W, double h, double d), then you will get correct volume. otherwise you will get 0.0 This means
 * that the Width = Width; statement will assign 0 to the variable.
 */

//Testcase -1 
/* THE PROBLEM IS BECAUSE OF INSTANCE VARIABLE HIDING.
	class testthis{
	double Width; double height; double depth;
testthis(double Width, double height, double depth){
		Width = Width;
		depth = depth;
		height = height;
	}
}
	public  class test{
		public static void main(String aarg[]){
			testthis object = new testthis(1,2,3);
			System.out.println(object.depth*object.Width*object.height);
		}
	}
*/

//Solution -1
//USE DIFFERENT NAME FOR THE INSTANCE VARIABLES TO AVOID VARABLE HIDING
/*
class testthis{
double Width; double height; double depth;
testthis(double W, double h, double d){
	Width = W;
	depth = d;
	height = h;
}
}
public  class test{
	public static void main(String aarg[]){
		testthis object = new testthis(1,2,3);
		System.out.println(object.depth*object.Width*object.height);
	}
}
*/

//Solution -2 (Better one)
// KEEP THE VARABLE NAME SAME AND USE 'this' KEYWORD TO ACHIVE CORRECT RESULT.
class testthis{
double Width; double height; double depth;
testthis(double Width, double height, double depth){
	this.Width = Width;
	this.depth = depth;
	this.height = height;
}
}
public  class test{
	public static void main(String aarg[]){
		testthis object = new testthis(1,2,3);
		System.out.println(object.depth*object.Width*object.height);
	}
}
