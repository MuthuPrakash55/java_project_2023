package day07;

import java.util.Scanner;

public class program05{
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("enter the value of a -");
		int a=x.nextInt();
		System.out.println("enter the value of b -");
		int b=x.nextInt();
		System.out.println("enter the value of c -");
		int c=x.nextInt();
		x.close();
	System.out.println("program starts");
	if((a>b)&&(a>c)) {
		System.out.println("a is greater than b and c");
	}
	else if((b>a)&&(b>c)) {
		System.out.println("b is greater than a and c");
	}
	else if ((a==b)&&(a>c)) {
		System.out.println("a and b  are greater");
	}
	else if ((a<b)&&(b==c)) {
		System.out.println("b and c are greater");
	}
	else if ((a>b)&&(a==c)) {
		System.out.println("a and c are greater");
	}
	else {
		System.out.println("c is greater than a and b");
	}
	System.out.println("program ends");	


	}

}


