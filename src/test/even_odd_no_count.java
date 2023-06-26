package test;

import java.util.Scanner;

public class even_odd_no_count {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("enter the n value-");
		int n=x.nextInt();
		x.close();
		
		System.out.println("........ while program..........");
		int a=0;
		int even=0;
		while(a<=n) {
			if(a%2==0) {
				even=even+1;
				System.out.println(a+"  "+even);
			}
			a=a+1;
		}
		System.out.println("even no count-"+even);
		System.out.println("........do while program..........");
	int b=0;
	int odd=0;
	do {
		if(b%2!=0) {
			odd=odd+1;
			System.out.println(b+"  "+odd);
		}
		b=b+1;
	}while(b<=n);
	System.out.println("odd no count-"+odd);
	
	System.out.println("........for program..........");
	int c;
	int even1=0;
	for(c=0;c<=n;c=c+1) {
		if(c%2==0) {
			even1=even1+1;
			System.out.println(c+"  "+even1);
		}
	}
	System.out.println("even numbers count"+"-"+even1);
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}
}

