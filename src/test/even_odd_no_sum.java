package test;

public class even_odd_no_sum {
         public int even1(int n){
	            int a=0;
	            int even1=0;
	            
	             while(a<=n) {
	            	 if(a%2==0) {
		         even1=even1+a;
	            	 }
	            	 a=a+1;
	               }
	             System.out.println("sum of even number is -"+even1);
	             return even1;
	}
      public int odd(int n) {
    	  int b=0;
    	  int odd=0;
    	   do {
    		  if(b%2!=0) {
    			  odd=odd+b;
    			  System.out.println(b+"  "+odd);
    			
    			  }
    		  b=b+1; 
    	  }while(b<=n);
    	  
      System.out.println("sum of odd numers is -"+odd);
      return odd;
      }
}
