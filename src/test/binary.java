package test;

public class binary {

	public static void main(String[] args) {
		int x=1101001;
		int a;
		int rem;
		
		int decimal=0;
		int i=0;
		
		while(x>0) {
			rem=x%10;
			decimal=(int) (decimal+(rem*(2^i)));
			x=x/10;
			i++;
		}
		
	System.out.println(decimal);
	}

}
