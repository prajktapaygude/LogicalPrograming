package String;

import java.text.SimpleDateFormat;

import java.util.Date;

public class DateInSpecificFormat {
	public static void main(String[] args) {
		
		String pattern = "MM-dd-yyyy";
		
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		String date = sdf.format(new Date());
		System.out.println(date);
		
	}
}
