package day14;

import java.util.Scanner;

public class decimal2binary {

	public static void main(String[] args) {
		Scanner z=new Scanner(System.in);
		System.out.println("enter the decimal value - ");
		int n=z.nextInt();
		int b=n;
		z.close();
		int a;
		String x ="" ;
		 while(n > 0)
	        {
	            a = n % 2; 
	            x = a+x;
	            n = n / 2;
	        }
	        System.out.println("Binary number of "+ b + " :"+x);
	}

}
