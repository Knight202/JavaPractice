//THIS EXAMPLE EXPLAINS THE CONCEPT OF PARAMETERIZED METHODS
//Note that both BoxDemo4 and BoxDemo5 are returning same result but BoxDemo5 is better written code.

package Chapter06;

public class BoxDemo5 {
	public static void main(String[] args) {
		double vol;
		Box Mybox1 = new Box();
		Box Mybox2 = new Box();
		
		Mybox1.SetDim(11.4,20.6,35.2);
		Mybox2.SetDim(15,2,400);		//HERE 15,2,400 ARE ARGUMENTS AND THEY ARE PASSED TO PARAMETERS w,h,d IN SetDim METHOD respectively.
		
		vol = Mybox1.Volume();
		System.out.println("Volume is " + vol);
		
		vol = Mybox2.Volume();
		System.out.println("Volume is " + vol);
		
	}

}
