package day14;

public class hex2decimal {

	public static void main(String[] args) {
		String x="1DA6";
		int x1[]= {1,13,10,6};
		int z=0;
		
		int a=x1.length;		
		System.out.println(a);		
			int i=0;
			int b=a-1;
			while(b>=0) {
			while(i<a) 
			{					 
				z=(int)( z+(x1[i]*Math.pow(16, b)));
			b--;
				i++;			
			}
			System.out.println("The Decimal number of "+x+" is -"+z);
	}
		
}
		
	}

