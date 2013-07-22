package chapter07;
	class Test{
		int a,b;Test(int a,int b){this.a=a;this.b=b;}
		boolean equals(Test o){if(o.a==a&&o.b==b)return true;else return false;}}
public class Passob{public static void main(String arg[]){Test ob1=new Test(10,20);Test ob2=new Test(15,20);Test ob3=new Test (10,20);
		System.out.println("ob1 == ob2: "+ob1.equals(ob2));
		System.out.println("ob1 == ob3: "+ob3.equals(ob1));
	}}

