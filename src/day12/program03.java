package day12;

public class program03 {

	public static void main(String[] args) {
		int x=0;
		int y=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(x+"\t");
				int z=x+y;
				x=y;
				y=z;
			}
			System.out.println();
		}

	}

}
