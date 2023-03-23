package test;

public class factorial {

	public static void main(String[] args) {
		int n=10;
		int fact=1;
		int b=1;
		while(b<=n) {
			fact=fact*b;
			System.out.println(b+"   "+fact);
			b=b+1;
		}
		
	}

}
