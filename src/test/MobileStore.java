package test;

import java.util.Scanner;

public class MobileStore {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the mobile name -");
		String mobile=x.next();
		if(("oppo".equals(mobile))||("one".equals(mobile))
				||("redmi".equals(mobile))) {
			System.out.println("Enter the color -");
			String color=x.next();
			if((("oppo".equals(mobile))&&(("red".equals(color))||("black".equals(color))))
					||(("one".equals(mobile))&&(("red".equals(color))||("black".equals(color))))
					||("redmi".equals(mobile))&&(("red".equals(color)||("black".equals(color))))) {
				
			}
			
		}
	}

}
