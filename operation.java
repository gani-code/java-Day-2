package datatypes;

import java.util.Scanner;

public class gradings {
	public static void main(String[] args) {
		Scanner src=new  Scanner(System.in);
		System.out.println("Enter CGPA:");
		double cgpa=src.nextDouble();
		if(cgpa>=9.0 && cgpa<=10)
		{
			System.out.println("O grade");
		}
		else if(cgpa>=8.0 && cgpa<=8.99)
		{
			System.out.println("A grade");
		}
		else if(cgpa>=7.0 && cgpa<=7.99)
		{
			System.out.println("B grade");
		}
		else if(cgpa>=6.0 && cgpa<=6.99)
		{
			System.out.println("C grade");
		}
		else {
			System.out.println("Fail");
		}
		src.close();
	}

}
