package test;

public class Testing {

	public static void main(String[] args) {
	int a;
	int n=100;
	int odd=0;
	System.out.println("........for program..........");
	for( a=0;a<=n;a=a+1) {
		if(a%2!=0) {
			odd=odd+a;
		}
	}
	System.out.println(odd);
	
	System.out.println("........while program..........");
	
	int b=0;
	int even=0;
	while(b<=n) {
		if(b%2==0) {
			even=even+b;
		}
		b=b+1;
	}
	System.out.println(even);
	System.out.println("........do while program..........");
	int c=0;
	int odd1=0;
	do {
		if(c%2!=0) {
			odd1=odd1+c;
		}
		c=c+1;
	}while(c<=n);
	System.out.println(odd1);
	}
	
	}
	


