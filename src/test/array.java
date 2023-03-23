package test;

public class array {

	public static void main(String[] args) {
		int x[]=new int[5];
		x[0]=10;
		x[1]=56;
		x[4]=70;
		System.out.println(x[1]);
		System.out.println(x.length);
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
		}
		System.out.println("@@@@@@@@@@@@@@@");
		x[1]=89;
		for(int b:x) {
			System.out.println(b);
		}
	}

}
