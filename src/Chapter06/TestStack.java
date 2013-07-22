package Chapter06;

class Stack{
	int stk[] = new int[10];
	int tos;
	
	Stack(){
		tos = -1;
	}
	void push(int item){
		if (tos == 9)
			System.out.println("Stack is full");
		else
			stk[++tos] = item;
	}
	int pop(){
		if (tos < 0){
			System.out.println("Stack overflow");
			return 0;
		}
		else
			return stk[tos--];
	}
}

public class TestStack {

	public static void main(String args[]) {
		Stack Mystack1 = new Stack();
		Stack Mystack2 = new Stack();
		
		for (int i = 0; i < 10 ; i++) Mystack1.push(i);
		for (int i = 10; i < 20 ; i++) Mystack2.push(i);
		
		System.out.println("Stack in Mystack1: ");
		for (int i = 0; i < 10; i++)
			System.out.println(Mystack1.pop());
		System.out.println("Stack in Mystack2: ");
		for (int i = 10; i < 20; i++)
			System.out.println(Mystack2.pop());
			
	}

}
