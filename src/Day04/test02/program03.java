package Day04.test02;
import Day04.test01.program01;
public class program03 extends program01 {
	public static void main(String[] args) {
		addmethod(10,20);
		//submethod(30,20);// it is private method-not visible
		mulmethod(30,40);
		//sqrmethod(10);// it is default method-not visible
		System.out.println("##########");
		program03 x=new program03();
		x.addmethodnonstatic(20,20);
		//x.submethodnonstatic(30,20);//it is private method - not visible
		x.mulmethodnonstatic(40,40);
		//x.sqrmethodnonstatic(20);// it is default method-not visible
		
	}
}
