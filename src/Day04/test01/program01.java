package Day04.test01;

public class program01 {
	public static void addmethod(int a,int b)
	{
		System.out.println(a+b);
	}
	private static void submethod(int a,int b)
	{
		System.out.println(a-b);	
	}
     static void sqrmethod(int a)
	{
		System.out.println(a*a);
	}
	protected static void mulmethod(int a,int b)
	{
		System.out.println(a*b);
	}
	
	public void addmethodnonstatic(int a,int b)
	{
		System.out.println(a+b);
	}
	private  void submethodnonstatic(int a,int b)
	{
		System.out.println(a-b);	
	}
	protected void mulmethodnonstatic(int a,int b)
	{
		System.out.println(a*b);
	}
	 static void sqrmethodnonstatic(int a)
	{
		System.out.println(a*a);
	}
	 public static void main(String[] args) {
			addmethod(10,20);
			submethod(30,20);
			mulmethod(30,40);
			sqrmethod(10);
			System.out.println("##########");
			program01 msp=new program01();
			msp.addmethodnonstatic(10,20);
			msp.submethodnonstatic(30,20);
			msp.mulmethodnonstatic(30,40);
			msp.sqrmethodnonstatic(20);
			
		}
	}
