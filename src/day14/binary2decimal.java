package day14;

import java.util.Scanner;

public class binary2decimal {

	public static void main(String[] args) {
		Scanner z=new Scanner(System.in);
		System.out.println("enter the binary value - ");
		int x=z.nextInt();
		z.close();
		int b=x;
		int decimal=0;
		int rem;
		int i=0;
		while (x>0) {
			rem=x%10;
			decimal=(int) (decimal+(rem*Math.pow(2, i)));
			x=x/10;
            i++;		
			
		}
		System.out.println("The decimal number of "+b+" is "+decimal);
	}
}
