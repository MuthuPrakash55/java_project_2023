package day14;
              //ARMSTRONG NUMBER
public class program03{

	public static void main(String[] args) {
		int  x1[]= {153, 370, 371, 507, 1634, 8208, 9476};
	for(int x:x1) {
		String y=String.valueOf(x);
		int count=y.length();
		double z=0;	
		for(int i=0;i<count;i++) {
			z=Math.pow(Integer.parseInt(y.charAt(i)+""), count)+z;		
		}
		if(z==x) {
			System.out.println("armstrong no  "+x);
		}		
	}		
	}

}
