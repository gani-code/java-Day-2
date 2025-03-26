package datatypes;

import java.util.Scanner;

public class pancard {
	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=src.nextInt();
		if(age>=18 && age<=120)
		{
			System.out.println("Eligible");
		}
		else {
			System.out.println("Ineligible");
		}
		src.close();
	}

}
