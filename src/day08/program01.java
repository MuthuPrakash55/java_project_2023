package day08;

public class program01 {

	public static void main(String[] args) {
		int a=0;
		int b=40;
		int c=40;
		int d=4;
	
		if((a>=b)&&(a>=c)&&(a>=d)) {
			if(a==b&&a==c&&a==d) {
				System.out.println("a,b,c & d are equal");
			}
			else if (a==b&&a>c&&a==d) {
				System.out.println("a,b & d are equal & greater than c");
			}
			else if(a>b&&a==c&&a==d) {
				System.out.println("a,c & d are equal & greater than b");
			}
			else if (a==d&&b==c) {
				System.out.println("a& d are equal & greater than b&c and b & c are equal");
			}
			else if (a==c&&b==d) {
				System.out.println("a& c are equal & greater than b&d and b & d are equal");
			}
			else if (a==b&&d==c) {
				System.out.println("a& b are equal & greater than d&c and d & c are equal");
			}
			else if(a==b&&a==c&&a>d) {
				System.out.println("a,b & c are equals and greater than d");	
		}
			else if (b>c&&a==d) {
				System.out.println("a& d are equal & greater than b and b is greater than c");
			}
			else if (a==c&&b>d) {
				System.out.println("a& c are equal & greater than b and b is greater than d");
			}
			else if (a==b&&d>c) {
				System.out.println("a& b are equal & greater than d and d is greater than c");
			}
			else if (a==b&&c>d) {
				System.out.println("a& b are equal & greater than c and c is greater than d");
			}
			else if (a==d&&c>b) {
				System.out.println("a& d are equal & greater than c and c is greater than b");
			}
			else if (a==c&&d>b) {
				System.out.println("a& c are equal & greater than d and d is greater than b");
			}
			else if(b>c&&c>d) {
				System.out.println("a is greater than b & b is greater than c and c is greater than d");
			}
			else if(c>b&&b>d) {
				System.out.println("a is greater than c & c is greater than b and b is greater than d");
			}
			else if(d>b&&b>c) {
				System.out.println("a is greater than d & d is greater than b and b is greater than c");
			}
			else if(d>c&&c>b) {
				System.out.println("a is greater than d & d is greater than c and c is greater than b");
			}
			else if(c>d&&d>b) {
				System.out.println("a is greater than c & c is greater than d and d is greater than b");
			}
			else if(b>d&&d>c) {
				System.out.println("a is greater than b & b is greater than d and d is greater than c");
			}
			else if(b>a&&b>c&&b==d) {
				System.out.println("b & d are equal & greater than a & c");
			}
			else if(a>b&&b==d&&b>c) {
				System.out.println("a is greater than b and b & d are equal & greater than c");
			}
			else if(a>b&&b==d&&b==c) {
				System.out.println("a is greater than b,c & d and b &c & d are equal ");
			}
			else if(a>b&&b==c&&b>d) {
				System.out.println("a is greater than b and b & c are equal & greater than d");
			}
			else if(a>d&&b==c&&d>b) {
				System.out.println("a is greater than d and d is greater than  b & c and b & c are equal ");
			}
			else if(a>b&&b==c&&b>d) {
				System.out.println("a is greater than b and b & c are equal and greater than d ");
			}
			else if(a>c&&d==c&&d>b) {
				System.out.println("a is greater than c and d & c are equal and greater than b ");
			}
			else if(a>b&&d==c&&b>d) {
				System.out.println("a is greater than b & b is greater than c and c & d are equal ");
			}
			else if(a>c&&b==d&&c>d) {
				System.out.println("a is greater than c and  c is greater than b and b & d are equal ");
			}
			else if(a>b&&b==d&&b>c) {
				System.out.println("a is greater than b and b & d are equal and greater than c");
			}
			else  {
				System.out.println("a is  greater than b & c & d");
			}
		}
		else if (b>=a&&b>=c&&b>=d) {
			if(b>a&&b==c&&b==d) {
				System.out.println("b,c & d are equal &  greater than a");
			}
			else if(b>d&&b==c&&d>a) {
				System.out.println("b & c  are equal & greater than d & d is greater than a");
			}
			
			else if(a>c&&c>d) {
				System.out.println("b is greater than a & a is greater than c and c is greater than d");
			}
			else if (b==c&&b>a&&a>d) {//
				System.out.println("b & c are equal & greater than a and a is greater than d");
			}
			else if (b>d&&d>a&&b==c) {
				System.out.println("b & c  are equal & greater than d and d is greater than a");
			}
			else if(c>a&&a>d) {
				System.out.println("b is greater than c & c is greater than a and a is greater than d");
			}
			else if(b==d&&d>a&&a>c) {
				System.out.println("b & d are equal & greater than a & a is greater than c");
			}
			else if(b==d&&d>c&&c>a) {
				System.out.println("b & d are equal & greater than c & c is greater than a");
			}
			
			else if(c>d&&d>a) {
				System.out.println("b is greater than c & c is greater than d and d is greater than a");
			}
			else if(a>d&&d>c) {
				System.out.println("b is greater than a & a is greater than d and d is greater than c");
			}
			else if (b>a&&a>d&&a==c) {
				System.out.println("b is greater than a & a and c are equal & greater than d");
			}
			else if (b>d&&d>a&&a==c) {
				System.out.println("b is greater than d & d is greater than a and a & c are equal");
			}
			else if (b>a&&a==d&&b==c) {
				System.out.println("b & c are equal & greater than a & a and d are equal");
			}
			else if (b>c&&c>a&&a==d) {
				System.out.println("b is greater than c & c is greater than a & a and d are equal");
			}
			else if (b==d&&b>a&&a==c) {
				System.out.println("b & d are equal & greater than a & a and c are equal");
			}
			else if (b>a&&a==d&&a==c) {
				System.out.println("b is greater than a and a & c &d are equal ");
			}
			else if (b>a&&a>c&&c==d) {
				System.out.println("b is greater than a and a is greater than c and c & d are equal ");
			}
			else if (b>a&&a==d&&d>c) {
				System.out.println("b is greater than a and a & d are equal and greater than c ");
			}
			else if (b>c&&c==d&&c>a) {
				System.out.println("b is greater than c and c & d are equal & greater than a");
			}
			else  {
				System.out.println("b is  greater than a & c & d");
			}
		}
		else if (c>=a&&c>=b&&c>=d) {
			
			if (c==d&&c>a&&a>b) {
				System.out.println("c & d are equal & greater than a and a is greater than b");
			}
			else if (c==d&&c>b&&b>a) {
				System.out.println("c & d are equal & greater than b and b is greater than a");
			}
			else if(a>b&&b>d) {
				System.out.println("c is greater than a & a is greater than b and b is greater than d");
			}
			else if(b>a&&a>d) {
				System.out.println("c is greater than b & b is greater than a and a is greater than d");
			}
			else if(d>a&&a>b) {
				System.out.println("c is greater than d & d is greater than a and a is greater than b");
			}
			else if(a>d&&d>b) {
				System.out.println("c is greater than a & a is greater than d and d is greater than b");
			}
			else if(d>b&&b>a) {
				System.out.println("c is greater than d & d is greater than b and b is greater than a");
			}
			else if(b>d&&d>a) {
				System.out.println("c is greater than b & b is greater than d and d is greater than a");
			}
			else if (c>b&&b>a&&a==d) {//
				System.out.println("c is greater than b & b is greater than a & a and d are equal");
			}
			else if (c>b&&b==d&b>a) {//
				System.out.println("c is greater than b & b and d are equal & greater than a");
			}
			else if (c==d&&c>b&&b==a) {
				System.out.println("c & d are equal & greater than b and b & a are equal");
			}
			else if (c>a&&a==d&&d>b) {
				System.out.println("c is greater than a and a & d are equal and greater than b");
			}
			else if (c>a&&a==b&&b>d) {
				System.out.println("c is greater than a and a & b are equal and greater than d");
			}
			else if (c>a&&b==d&&a>b) {
				System.out.println("c is greater than a and a is greater than b and b & d are equal");
			}
			else if (c>a&&a==d&&d==b) {
				System.out.println("c is greater than a and a & b &d are equal ");
			}
			else if (c>d&&a==b&&d>b) {
				System.out.println("c is greater than d and d is greater than a and a & b are equal ");
			}
			else {
				System.out.println("c is  greater than a,b & d");
			}
			}
		else if(d>=a&&d>=b&&d>=c)  {
		if(a>b&&b>c) {
			System.out.println("d is greater than a & a is greater than b and b is greater than c");
		}
		else if(b>a&&a>c) {
			System.out.println("d is greater than b & b is greater than a and a is greater than c");
		}
		else if(c>a&&a>b) {
			System.out.println("d is greater than c & c is greater than a and a is greater than b");
		}
		else if(c>b&&b>a) {
			System.out.println("d is greater than c & c is greater than b and b is greater than a");
		}
		else if(a>c&&c>b) {
			System.out.println("d is greater than a & a is greater than c and c is greater than b");
		}
		else if(d>a&&a==b&&a==c) {
			System.out.println("d is greater than a & a ,b & c are equal");
		}else if(b>a&&a==c) {
			System.out.println("d is greater than b & b is greater than a and a & c are equal");
		}
		else if(c>b&&c==a) {
			System.out.println("d is greater than a & a and c are equal & greater than b");
		}
		else if(d>b&&b>a&&a==c) {
			System.out.println("d is greater than b & b is greater than a & a and c are equal ");
		}
		else   {
			System.out.println("d is greater than b & b is greater than c and c is greater than a");
		}
		}
	}
}

	

	
	
	
	
	

	
	
	


