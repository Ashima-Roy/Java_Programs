package JavaAssignments;

import java.util.Scanner;

public class ScannerProgram {

	public static void main(String[] args) 
	{
		Scanner s1 =new Scanner(System.in);
		System.out.println("Enter 1st number");
		int num1 = s1.nextInt();
		System.out.println("Enter 2nd number");
		int num2 = s1.nextInt();
		int Addition = num1 + num2;
		System.out.println("Addition= " +Addition);

	}

}
