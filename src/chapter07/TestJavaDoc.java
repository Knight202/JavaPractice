package chapter07;
/**
 * Class to check the functionality of Javadoc utility
 * @author KALPAN
 * @version 1.1
 */
public class TestJavaDoc {
	int i;
	int j;
	TestJavaDoc(){
		i=5;
		j=6;
	}
	/**
	 * Prints the simple word HELLO
	 */
public	void Print(){
		System.out.println("Hello");
	}
	/**
	 * this is summation method
	 * @return sum of both the instance variables of the object.
	 */
public	int Sum(){
		int p=5;
		return p=i+j;
	}
	/**
	 * This will display the vaue of parameters passed to it.
	 * @param a	this the first param
	 * @param b	this is the second param
	 */
public	void DisplayParams(int a, int b){
		System.out.println(a);
		System.out.println(b);
	}
	/**
	 * It is the main method
	 * @param args	Thsi can be any value
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestJavaDoc T1 = new TestJavaDoc();
		T1.Print();
		T1.DisplayParams(9, 3);
		T1.Sum();
	}

}
