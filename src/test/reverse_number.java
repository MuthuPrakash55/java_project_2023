package test;

public class reverse_number {

	public static void main(String[] args) {
		int revno=0;
		int no=74365;
		while(no!=0) {
			revno=revno*10;    //0  50   560   5630   56340
			revno=revno+no%10;//5   56   563   5634   56347
			no=no/10;        //7436 743  74    7          0
		}
		System.out.println(revno);
		System.out.println("#################");
		
		int reverse=0;
		int number=98765;
		for (;number!=0;number=number/10) {
			reverse=reverse*10;
			reverse=reverse+number%10;
		}
		System.out.println(reverse);
	}

}
