package day14;

public class octal2binary {

	public static void main(String[] args) {
		int x=41;
		int decimal=0;
		int rem;
		int i=0;
		while(x>0) {
			rem=x%10;
			decimal=(int) (decimal+(rem*Math.pow(8, i)));
			x=x/10;
			i++;
		}
			System.out.println("octal to decimal no "+decimal);
			String y=" ";
			while(decimal>0) {
				int a=decimal%2;
				y=a+y;
				decimal=decimal/2;
				
			}
			System.out.println("decimal to binary no "+y);
	}

}
