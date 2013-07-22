package chapter02;


 class ToStringEx{
	int floor=3;
	int dest=5;
	public String toString(){
		return "Values of floor and dest are: " + floor + dest;
	}
}
public class ToString{

	public static void main(String args[]){
		ToStringEx EX = new ToStringEx();
		System.out.println(EX);
	}

	
}
