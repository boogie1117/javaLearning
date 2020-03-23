import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 这是关于SimpleDateFormat的测试和使用
 * @author boogie
 *
 */
public class SimpleDateFormatTest {

	public static void main(String[] args) {
		//先实例化一个SimpleDateFormat的对象
		SimpleDateFormat sdf= new SimpleDateFormat();
		SimpleDateFormat sdf1= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date1=new Date();
		System.out.println(date1);
		//格式化
		String date2=sdf.format(date1);
		System.out.println(date2);
		String date4="2020-03-09 12:00:00";
		try {
			//解析
			Date date3=sdf1.parse(date4);
			//转化为数据库中的date类型  java.sql.Date是java.util.Date的子类
			java.sql.Date date5= new java.sql.Date(date3.getTime());
			System.out.println(date5);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(date3);
	}
	
}
