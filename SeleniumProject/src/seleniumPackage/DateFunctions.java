package seleniumPackage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		c.add(Calendar.MONTH, 2);
		
		
		Date dt =c.getTime();
		SimpleDateFormat sdf1 = new SimpleDateFormat("MMMM YYYY");
		System.out.println( sdf1.format(dt));
		 
		
		
		
		String s ="1234";
		//Conversion string to integer
		int i = Integer.parseInt(s);
		System.out.println(i*2);
		
		//Conversion of integer to a String
		s= Integer.toString(i);
		System.out.println(s.length());
		
		
		
		Date d = new Date();
		long l = d.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");
		System.out.println(sdf.format(new Date()));
	}

}
