package day10;

public class program4 {

	public static void main(String[] args) {
		int n=10;
		
		int a=1;
		int fact=1;
		System.out.println("......while program......!");

		while(a<=n) {
			fact=fact*a;
			System.out.println(a+"   "+fact);
			a=a+1;
		}
	
		System.out.println("......do-while program......!");
	
	int b=1;
	fact=1; 
	do {
		fact=fact*b;
		System.out.println(b+"   "+fact);
		b=b+1;
	}while(b<=n);
	
	System.out.println("......for-while program......!");
	
	
	fact=1;
	for(int c=1;c<=n;c=c+1) {
		fact=fact*c;
		System.out.println(c+"   "+fact);
	}
	}

}
