package chapter02;

public class Chardemo {
//char variables behave like integers.
	public static void main(String args[]){
		char ch1;
		int y;
		ch1 = 150; y = 87;
		System.out.println("The " + y + "th character in ASCII and Unicode is " + ch1);
		
		for (ch1 = 150; ch1<160; ch1++){
		int x = ch1;
		System.out.println("Character # " + x  + " is " + ch1 );
		}
	}
}
