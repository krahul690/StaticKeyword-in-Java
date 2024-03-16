package statickey;

import java.util.Scanner;

class Farmer
{
	private float pa;
	private float td;
	private float si;
	private static float ri;
	
	static 
	{
		 ri=2.5f;
	}
	void input() {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a principal amount: ");
		pa=sc.nextFloat();
		System.out.println("enter time duration: ");
		td=sc.nextFloat();
		
	}
	void compute()
	{
		si=(pa*td*ri)/100;
		
	}
	void disp() {
		System.out.println("SI is "+si);
	}
}
public class farmerLoan {

	public static void main(String[] args) {
		Farmer f1 = new Farmer();
		f1.input();
		f1.compute();
		f1.disp();

	}


}
