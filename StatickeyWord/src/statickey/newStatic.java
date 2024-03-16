package statickey;

class Abc{
	static int a;
	static int b;
	
	static void a(){
		System.out.println("static block");
		a=10;
		b=10;
		
	}
	
}
public class newStatic {
	public static void main(String[]args){
		Abc.a();
	}
}