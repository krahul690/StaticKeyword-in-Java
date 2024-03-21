package statickey;

class Test22 {
    int i = 10;

    {
        m1();
        System.out.println("first Instance Block");
    }

    Test22() {
        System.out.println("constructor");
    }

	private void m1() {
        System.out.println(j);
	}
    int j = 20;
    {
        System.out.println("Second Instance Block");
    }

}

public class InstanceControlFlow {

    public static void main(String[] args) {
        Test22 t = new Test22();
        System.out.println("Main");
    }
  



}
