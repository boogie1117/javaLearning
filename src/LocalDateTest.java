import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * LocalDate、LocalTime、LocalDateTime
 * @author lenovo
 *
 */
public class LocalDateTest {
	public static void main(String[] args) {
		//获取当前日期now()
		//年月日
		LocalDate localDate=LocalDate.now();
		//时分秒
		LocalTime localTime=LocalTime.now();
		//年月日时分秒都有,用的频率更高
		LocalDateTime localDateTime=LocalDateTime.now();
		System.out.println(localDate);
		System.out.println(localTime);
		System.out.println(localDateTime);
		//of()设置指定的年月日时分秒且没有偏移量，calendar有偏移量年1900月1
		LocalDateTime day1 = LocalDateTime.of(2020, 1,1,13,25,50);
		System.out.println(day1);
		//getXxx()获取相关属性
		//这个月的第几天
		System.out.println(localDateTime.getDayOfMonth());
		//withXxx()体现LocalDateTime的不可变性
		LocalDateTime o=localDateTime.withDayOfMonth(22);
		System.out.println(localDateTime);
		System.out.println(o);
		//加plus
		LocalDateTime o1=localDateTime.plusMonths(3);
		System.out.println(localDateTime);
		System.out.println(o1);
		//减minus
		localDateTime.minusDays(5);
		
	}
}
