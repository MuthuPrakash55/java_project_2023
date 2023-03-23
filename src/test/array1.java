package test;

import java.util.Arrays;

public class array1 {

	public static void main(String[] args) {
		int x[]= {10,1,20,23,45,65,78,92,100,2};
		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
		int y[]=Arrays.copyOf(x, x.length);
		x[4]=50;
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
	}

}
