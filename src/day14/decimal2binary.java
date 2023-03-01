package day14;

public class decimal2binary {

	public static void main(String[] args) {
		int n=13, a;
		String x =" " ;
		 while(n > 0)
	        {
	            a = n % 2; 
	            x = a+x ;
	            n = n / 2;
	        }
	        System.out.println("Binary number of n :"+x);
	}

}
