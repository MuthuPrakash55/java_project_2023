package day07;

public class program05 {

	public static void main(String[] args) {
		int a=400;
		int b=400;
		int c=500;
	System.out.println("program starts");
	if((a>b)&&(a>c)) {
		System.out.println("a is greater than b and c");
	}
	else if((a<b)&&(b>c)) {
		System.out.println("b is greater than a and c");
	}
	else if ((a==b)&&(a>c)) {
		System.out.println("a and b are greater");
	}
	else {
		System.out.println("c is greater than a and b");
	}
	System.out.println("program ends");	


	}

}
