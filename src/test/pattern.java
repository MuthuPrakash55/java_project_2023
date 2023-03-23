package test;

public class pattern {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int k=5;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
			for(int i1=5;i1>=1;i1--) {
				for(int k=5;k>=i1;k--) {
					System.out.print(" ");
				}
				for(int j=i1;j>=1;j--) {
					System.out.print("*");
				}
				System.out.println();
		}

	}
	}


