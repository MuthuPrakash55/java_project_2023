package Day04.test01;

public class program02 extends program01 {

	public static void main(String[] args) {
		addmethod(10,20);
		//submethod(30,20);// it is private method-not visible
		mulmethod(30,40);
		sqrmethod(10);
		System.out.println("##########");
		program01 msp=new program01();
		msp.addmethodnonstatic(20,20);
		//msp.submethodnonstatic(30,20);//it is private method - not visible
		msp.mulmethodnonstatic(40,40);
		msp.sqrmethodnonstatic(30);
		
	}

}
