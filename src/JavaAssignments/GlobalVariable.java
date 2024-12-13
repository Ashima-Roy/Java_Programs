package JavaAssignments;

public class GlobalVariable {
	
	static int a;
	static int b;
	static int add;
	static int sub;
	static int mult;
	static int div;
	static int mod;
	
	static void add()
	{
		a= 10;
		b= 10;
		System.out.println("Addition =" +  (a+b));
	}
	static void sub()
	{
		a= 20;
		b= 10;
		System.out.println("Subtraction =" +  (a-b));
	}
	static void mult()
	{
		a= 20;
		b= 4;
		System.out.println("Multiplication =" +  (a*b));
	}
	static void div()
	{
		a= 100;
		b= 10;
		System.out.println("Division =" +  (a/b));
	}
	static void mod()
	{
		a= 100;
		b= 10;
		System.out.println("Modules =" +  (a%b));
	}
	public static void main(String[] args) 
	{
		add();
		sub();
		mult();
		div();
		mod();
	}

}
