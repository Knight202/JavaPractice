//THIS IS COMMON CLASS FOR ALL BOX RELATED OBJECTS.
//It has different Constructors and Methods created and they are used in examples.
package Chapter06;

    class Box {			//This will create a separate Box.java file for class Box. You can also include this class in any of the examples.
					//You can not run this file alone as this does not have a main method.
	//Declaring 3 instance variables, NOT INITIALIZED.
		double Width;
		double height;
		double depth;
	
		void VoidVolume(){								//1)Return type void method USED IN BoxDemo3
			System.out.print("Volume is ");
			System.out.println(Width * height * depth);
		}
	    double Volume(){								//2)Method with valid return type.  Used in BoxDemo3 and BoxDemo4 and BoxDemo5
			return (Width * height * depth);
		}
		void SetDim(double w, double h, double d){		//3)Parameterized method implementation example. USED IN BoxDemo5
			Width = w; depth = d; height = h;
		}
		double DirectVolume(double w, double h, double d){		//Combination of method 2 and 3.
			return (w * d * h);
		}
		
}
