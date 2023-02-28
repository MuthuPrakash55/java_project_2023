package day13;

public class program02 {

	public static void main(String[] args) {
		int  x[]= {10,1,20,23,45,65,78,92,100,2};
			System.out.println("even numbers");
			for(int i=0;i<x.length;i++) {
				if(x[i]%2==0) {
					System.out.println(x[i]);
				}
				
			}
			System.out.println("odd numbers");
			for(int y:x) {
				if(y%2==1) {
				System.out.println(y);
			}
			}
	   }
			
	}
