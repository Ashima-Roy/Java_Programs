package JavaAssignments;

public class AssertProgram2 {
	static void add(int a, int b)
	{
		assert a == 100:"Please give value= 100";
		int sum =a+b;
		System.out.println(sum);
	}

	public static void main(String[] args) 
	{
		add(11,23);

	}

}
