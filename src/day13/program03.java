package day13;

import java.util.Arrays;

public class program03 {

	public static void main(String[] args) {
		int x[]= {10,1,20,23,45,65,78,92,100,2};
		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
		
		System.out.println("copy function");
		int y[]=Arrays.copyOf(x,x.length);
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
		x[0]=111;
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
	}

}
