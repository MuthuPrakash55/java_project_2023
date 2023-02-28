package day14;

public class binary2decimal {

	public static void main(String[] args) {
		int x=1101;
		int decimal=0;
		int rem;
		int i=0;
		while (x>0) {
			rem=x%10;
			decimal=(int) (decimal+(rem*Math.pow(2, i)));
			x=x/10;
            i++;		
			
		}
		System.out.println(decimal);
	}
}
