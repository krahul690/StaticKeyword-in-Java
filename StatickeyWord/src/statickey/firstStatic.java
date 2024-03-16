package statickey;

class Test {
	static int a;
	static int b;

	static {
		System.out.println("Static block");
		a = 10;
		b = 20;
	}

	static void disp() {
		System.out.println("Static method");
		System.out.println(a);
		System.out.println(b);
	}

	int x;
	int y;

	// java block
	{
		x = 10;
		y = 20;
		System.out.println("Non Static Java");
	}

	Test() {
		System.out.println("Constructor");
	}

	void disp1() {
		System.out.println(x);
		System.out.println(y);
	}
}

public class firstStatic {

	public static void main(String[] args) {
		Test.disp();

		Test t = new Test();
		t.disp1();
	}

}
