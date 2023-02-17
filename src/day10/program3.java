package day10;

public class program3 {

	public static void main(String[] args) {
		int table=3;
		
		System.out.println("......while program......!");
		int a=1;
		while(a<=10) {
			System.out.println(table+" x "+a+"="+table*a);
			a=a+1;
		}
		
		System.out.println("......do-while program......!");
		
	int b=1;
	do {
		System.out.println(table+"x"+b+"="+table*b);
	b=b+1;
	}while(b<=5);
	
	System.out.println("......for program......!");
	
	for(int c=1;c<=5;c=c+1) {
		System.out.println(table+"x"+c+"="+table*c);
	}
	}

}
