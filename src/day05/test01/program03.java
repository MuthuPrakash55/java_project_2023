package day05.test01;

public class program03 extends program02{
	
	public static void main(String[] args) {
		program03 x = new program03();
		x.add(10,20.5);
				
	}
	@Override
	public void  add(int a, double b) {
		System.out.println((a*a)+(b*b));
	}
}
