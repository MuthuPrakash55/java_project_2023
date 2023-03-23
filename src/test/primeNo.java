package test;

import java.util.Scanner;

public class primeNo {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("enter the no");
		int no=x.nextInt();
		x.close();
		int count=0;
		for(int i=1;i<=no;i=i+1) {
			if(no%i==0) {
				count=count+1;
				}
			}
			if (count==2) {
			System.out.println("number"+"  "+no+"-"+"is prime number");
		}
		else {
			System.out.println("number"+"  "+no+"-"+"is not prime number");	
		}

	}

}
