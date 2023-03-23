package day13;

public class program01 {

	public static void main(String[] args) {
		int[] x=new int[5];
		x[0]=100;
		x[2]=300;
		x[4]=500;
		System.out.println("*******index loop********");
		
		System.out.println(x[0]);
		System.out.println(x[2]);
		System.out.println(x.length);
		for(int i=0;i<5;i++) {
			System.out.println(x[i]);
		}
		System.out.println("@@@@@@@ for-each loop@@@@@@");
		for(int a:x) {
			System.out.println(a);
		}
		String[] name= {"abc","bcd","cde","efg"};
		System.out.println(name.length);
		System.out.println(name[0]);
		name[0]="ABC";
		System.out.println(name [0]);
		}
	}

