package chapter07;
	class factorial{
		//this is a recursive method
		int fact(int n){
			int result;
			System.out.println("Before if loop Current call value of n: " + n);
			if (n == 1)	
			return 1;
			else result =fact(n-1)*n;
			System.out.println("Current call value of n: " + n);
			System.out.println("Current call value of result: " + result);
			return result;
		}
	}
class Recursion {
	public static void main(String args[]){
		factorial f = new factorial();
		
		System.out.println("Factorial of 3 is: " + f.fact(3));
	//	System.out.println("Factorial of 5 is: " + f.fact(5));
	//	System.out.println("Factorial of 8 is: " + f.fact(8));
	}
}
