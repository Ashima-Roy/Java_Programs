package JavaAssignments;

public class AreaOfCircle {

	public static void main(String[] args) 
	{
		for(int i=0; i<10; i++)
		{
			double r= Math.random();
			System.out.println(r);
			double area= Math.PI *r*r;
			System.out.println("Area of Circle = "+ area);
		}
	}

}
