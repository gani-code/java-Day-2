package datatypes;

import java.util.Scanner;

public class eligibilitycriteria {
	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("enter weight:");
		double weight=src.nextDouble();
		System.out.println("enter height:");
		double height=src.nextDouble();
		if(weight>=60 && weight<=80) {
		if(height>=5.5 && height<=7.0) {
			System.out.println("Eligible");
			
		}
		else {
			System.out.println("Ineligible");
		}
		}
		else
		{
			System.out.println("Error");
		}
		src.close();
	}

}
