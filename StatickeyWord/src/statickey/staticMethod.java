package statickey;

class Demo2 {
	static int a;

	static {
		a = 10;
		System.out.println("10 is here ");
	}

	static void disp() {
		System.out.println("static block: " + a);
	}
}

public class staticMethod {

	static void disp2() {
		System.out.println("dsip2");
	}

	public static void main(String[] args) {

		disp2(); // same class present
		Demo2.disp(); // another class
		Demo2 ab = new Demo2();
		ab.disp(); // not recomended bcoz of static
	}

}
