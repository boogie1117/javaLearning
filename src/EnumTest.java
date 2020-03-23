import java.util.Arrays;

/**
 * 枚举类是确定个数对象的类，只有一个对象的就是单例
 * @Description:<功能的描述> 
 * @author  Boogie
 * @date 2020年3月9日下午8:16:02 
 *
 */
public class EnumTest {

	public static void main(String[] args) {
		//两种方式
		//方式一：自定义枚举类，现在一般不用
		Season spring= Season.SPRING;
		System.out.println(spring);
		//方拾二：用enum关键字
		Season1 winter=Season1.valueOf("WINTER");
		System.out.println(winter);
		//values()********
		Season1[] s=Season1.values();
		System.out.println(Arrays.toString(s));
	}
	
}

class Season{
	private final String seasonName;
	
	private Season(String seasonName) {
		this.seasonName=seasonName;
	}
	public String getSeasonName() {
		return seasonName;
	}
	@Override
	public String toString() {
		return "Season [seasonName=" + seasonName + "]";
	}
	//提供当前枚举类的多个对象
	public static final Season SPRING = new Season("春天");
	public static final Season SUMMER = new Season("夏天");
	
	public static final Season AUTUMN = new Season("秋天");
	public static final Season WINTER = new Season("冬天");
}
