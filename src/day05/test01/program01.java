package day05.test01;
// METHOD OVERLOADING
public class program01 {

	public static void main(String[] args) {
		add(10,20);
		add(1.5,2.5);
		add(40,50,60);
		System.out.println(main(1,2));
		main();
	}
	public static double main(double a,double b) {
		return a+b;           // main method overloading
	}
	public static void main() {
		System.out.println("good morning");
	}
public static void add(int a, int b) {
	System.out.println(a+b);
}
public static void add(double a, double b) {
	System.out.println(a*b);
}
public static void add(int a, int b,int c) {
	System.out.println(a+b+c);
}
}
