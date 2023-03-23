package day14;

public class primeno {

	public static void main(String[] args) {
		int x=26;
		boolean a=true;
		for(int i=2;i<x;i++) {
			if(x%i==0) {
				a=false;
				break;
			}
		}
		if(a) {
			System.out.println("prime "+ x);
		}
		else {
			System.out.println("not prime "+ x);
		}
				}
			}
		

	


