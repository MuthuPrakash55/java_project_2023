package day14;

public class program02{

	public static void main(String[] args) {
		int x=153;
		String y= String.valueOf(x);
		int count=y.length();
		System.out.println(count);
		for(int i=0;i<count;i++) {			
			double z=Math.pow(Integer.parseInt(y.charAt(i)+""), count);
		System.out.println(z);
		}

	}

}
