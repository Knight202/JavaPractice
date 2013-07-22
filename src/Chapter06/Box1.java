//THIS IS IN RELATION TO BOX.JAVA
//Creating constructors in the above file will create issue that's why created a separate file.
package Chapter06;

class Box1 {
	double Width;
	double height;
	double depth;
	
	Box1(double w, double h, double d){				//1)parameterized CONSTRUCTOR implementation example.  Used in BoxDemo6
			Width = w; depth = d; height = h;
	}
	double Volume(){								//2)Method with valid return type.  Used in BoxDemo6
		return (Width * height * depth);
	}
	double Volume(int t){							//Method Overloading
		return t++;
	}
}
