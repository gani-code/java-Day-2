package datatypes;

import java.util.Scanner;

public class student {
	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("enter a value :");
		int a=src.nextInt();
		System.out.println("a value :"+a);
		int b=src.nextInt();
		int sum=a+b;
		System.out.println("sum value :"+sum);
		int substract=a-b;
		System.out.println("substract value :"+substract);
		int multiply=a*b;
		System.out.println("multiply value :"+multiply);
		int division=a/b;
		System.out.println("division value :"+division);
		src.close();
	}

}
