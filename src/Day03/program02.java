package Day03;

public class program02 {

	public static void main(String[] args) {
		program02 msp = new program02();
		msp.addmethod(10,20);
		submethod(20,30);
		msp.mulmethod(30,40);
	}
public void addmethod(int a,int b)
{
	System.out.println(a+b);
}
public static void submethod(int a,int b)
{
	System.out.println(a-b);	
}
public void mulmethod(int a,int b)
{
	System.out.println(a*b);
}

	
}



