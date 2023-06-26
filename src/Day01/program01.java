package Day01;

import java.util.Calendar;
import java.util.Date;

public class program01 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Calendar cal= Calendar.getInstance();
//		Date time=cal.getTime();
//		String timestamp=time.toString().replace(":", "").replace(" ", "");
//		System.out.println(timestamp);
		Date date=new Date();
		System.out.println(date);
		String filename=date.toString().replace(":", "").replace(" ", "");
		System.out.println(filename);
	}

}
