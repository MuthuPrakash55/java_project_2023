package day06;

public class program03 {

	public static void main(String[] args) {
		int a=200;
		int b=30;
		int c=20;
		System.out.println((a>b)&&(b<a));//t && t----->true
		System.out.println((b>a)&&(c<a));//f && t----->false
		System.out.println((b>c)&&(a<c));//f
		System.out.println("###########");
		System.out.println((a>b)||(b>a));//t || f----->true
		System.out.println((c>b)||(c>a));//f || f----->false
		System.out.println((a>b)&&(b<a));
		System.out.println("***********");
		System.out.println(!(a>b));//! t---->false
		System.out.println(!(b>a));//! f---->true
		System.out.println(!(c>a));
	}

}
