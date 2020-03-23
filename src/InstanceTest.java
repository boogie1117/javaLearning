import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * Instance时间线上的瞬时点
 * @author lenovo
 *
 */
public class InstanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Instant instant= Instant.now();//本初子午线的时间点，北京时间要加上时区
		System.out.println(instant);
		//根据北京时间添加时间的偏移量不改变instant的时间
		OffsetDateTime offsetDateTime=instant.atOffset(ZoneOffset.ofHours(8));
		System.out.println(offsetDateTime);
		//通过给给定毫秒数确定时间
		instant.ofEpochMilli(1550175314878l);
		
		
	}

}
