package statickey;
public class staticblock {
	static int a;
	static {
		//run during the class load
		a=10;
		System.out.println("static block1");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method");
	}
}
