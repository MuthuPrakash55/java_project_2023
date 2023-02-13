package day07;

import java.util.Scanner;

public class program03 {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("enter the value of a - ");
		double a=x.nextDouble();
		x.close();
		System.out.println("Starts program");
		if(a%2==0)
		{
			System.out.println("a is even number");
		}
		else
		{
			System.out.println("a is odd number");
		}
		System.out.println("Program ends");
	}

}
