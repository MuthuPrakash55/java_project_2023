package Day03.test01;

public class program02 extends program01{
     //program01-superclass(parent class)
	//program02-subclass(child class)
	public static void main(String[] args) {
		program02 msp = new program02();
		msp.addmethod(10,20);
		submethod(20,30);
		msp.mulmethod(30,40);
	}

}
