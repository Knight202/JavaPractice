package chapter07;
		class Clone{
			int a,b,c;
			Clone(Clone object){
				a= object.a;
				b =object.b;
				c =object.c;
	//try this and check the output			//object.a = a;
				                            //object.b = b;
				                            //object.c = c;
			}
			Clone(int p, int q, int r){
				a = p; b = q;c=r;
			}
		}
public class ObjectClone {

	public static void main(String[] args) {
		Clone Original = new Clone(1,2,3);
		Clone Dublicate = new Clone(Original);
		System.out.println("Original Obkect Volume: " + Dublicate.a + Dublicate.b + Dublicate.c );
		System.out.println("Original Obkect Volume: " + Original.a + Original.b + Original.c );

	}

}
