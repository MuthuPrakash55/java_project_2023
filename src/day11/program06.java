package day11;

public class program06 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				if(j%2==1) {
					System.out.print(i+"\t");
				}
				else {
					System.out.print(i*i+"\t");
				}
			}
			System.out.println();
		}
	
	}
}

