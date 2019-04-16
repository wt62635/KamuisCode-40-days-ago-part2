
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateFormatDemo01 {
	public static void main(String[] args) {
		Date date = new Date();
		
		DateFormat df;
		
		df =new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(df.format(date));
		df =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));
		df =new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss");
		System.out.println(df.format(date));
		
		TimeZone z = TimeZone.getTimeZone("GMT+8");
		System.out.println(df.format(date));
		df =new SimpleDateFormat("yyyy/MM/dd a HH:mm:ss");
		df.setTimeZone(z);
		System.out.println(df.format(date));
		df =new SimpleDateFormat("yyyy/MM/dd a HH:mm:ss");
		TimeZone z1 = TimeZone.getTimeZone("GMT+9");
		System.out.println(df.format(date));
	}
}
