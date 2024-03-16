package statickey;
class demo{
	int a;
	int b;
	static int count;
	demo(){
		count++;
	}
}
public class countobj {
	public static void main(String[] args) {
		demo d = new demo();
		demo d1 = new demo();
		demo d2 = new demo();
		System.out.println(demo.count);
	}

}
