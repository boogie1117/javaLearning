import java.util.Calendar;
import java.util.Date;

public class Calendartest {

	
	public static void main(String[] args) {
			
		
		//1.实例化
		Calendar calendar=Calendar.getInstance();
		System.out.println(calendar.getClass());
		
		//2.常用对象
		//get()
		int days = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(days);
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		//set()直接对calendar对象进行修改
		calendar.set(Calendar.DAY_OF_MONTH, 22);
		days=calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(days);
		//add()在calendar的基础上加几天，负数即为减几天
		calendar.add(Calendar.DAY_OF_MONTH, -3);
		//getTime()日历类-->Date
		Date date0=calendar.getTime();
		//setTime()Date-->日历类
		Date date=new Date();
		calendar.setTime(date);
		days=calendar.get(Calendar.DAY_OF_MONTH);

		
	}
	
	
}
