package chapter07;
	class OverloadDemo{
		void test(){
			System.out.println("No Parameters");
		}
	/*	void test(int i){
			System.out.println("i: " + i);
		}*/
		void test(int a, int b){
			System.out.println("a and b:" + a + b);
		}
		double test(double a){
			System.out.println("double a: " + a);
			return a*a;
		}
	}
public class Overload {

	public static void main(String[] args) {
		OverloadDemo ob = new OverloadDemo();
		ob.test();
		ob.test(10);
		ob.test(10.10);
		ob.test(15,19);
	}

}
