import java.time.LocalDateTime ;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/**
 * 类似于SimpleTimeFormatter
 * @author lenovo
 *
 */
public class DateTimeFormatterTest{

	
	public static void main(String[] args) {
		//1.实例化
		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		LocalDateTime localDateTime=LocalDateTime.now();
		//2.格式化
		String str=dateTimeFormatter.format(localDateTime);
				System.out.println(str);
				//3.解析
				TemporalAccessor parse=dateTimeFormatter.parse(str);
				System.out.println(parse);
	}
}
