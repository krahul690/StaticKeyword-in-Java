package statickey;

class SS {
	int a;
	int b;
	static int count;

	{
		count++;
		System.out.println("hello");
	}

	SS() {
		this(10);
	}

	SS(int a) {
		this.a = a;
	}

	SS(int a, int b) {
		this.a = a;
		this.b = b;
	}
}

public class CountNew {

	public static void main(String[] args) {
		SS s = new SS();
		SS s1 = new SS();
		System.out.println(SS.count);
	}

}
