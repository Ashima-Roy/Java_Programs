package JavaAssignments;

public class AverageOfValues {
	static double avg1 = 0;
	static double avg2 = 0;
	static int sum1 =0;
	static double sum2 =0;
	static double totat_avg = 0;

	public static void main(String[] args) 
	{
		int num1 [] = new int[4];
		num1[0] =23;
		num1[1] =56;
		num1[2] =73;
		num1[3] =20;
		for(int i=0; i<num1.length; i++)
		{
			sum1 = sum1 + num1[i];
			avg1 = sum1/num1.length;
			
		}
		double num2 [] = new double[4];
		num2[0] =13.5;
		num2[1] =26.7;
		num2[2] =63.2;
		num2[3] =40.5;
		for(int i=0; i<num2.length; i++)
		{
			sum2 = sum2 + num2[i];
			avg2 = sum2/num2.length;
			
		}
		totat_avg = avg1 + avg2;
		System.out.println("Totat Average is"+ totat_avg);

	}

}
