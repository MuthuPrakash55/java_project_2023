package test;

public class print_count_primeno {
	public static void main(String[] args) {
		int total=0;		
			for(int i=2;i<=100;i=i+1) {
				int count=0;
			for(int j=2;j<i;j=j+1) {
				if(i%j==0) {
					count=count+1;
				}				
			}			
			if(count==0) {
				total=total+1;
				System.out.println(i);
				}
					}
		System.out.println("&&&&&&&&&&&&&&&&&&&");
		System.out.println(total);
		
	}
}
