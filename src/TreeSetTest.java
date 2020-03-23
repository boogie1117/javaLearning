import java.util.Iterator;
import java.util.TreeSet;

/**
 * 
 *
 * @Description:TreeSet的使用，可以按照对象的指定属性进行排序
 * 向TreeSet添加的数据必须是相同类的对象，不能添加不同类的对象
 * @author  Boogie
 * @date 2020年3月10日下午2:50:28 
 *
 */
//TreeSet中自然排序比较是按照CompareTo方法进行排序
//也可以定制排序，实现comparator接口
public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet set=new  TreeSet();
		//int型按大小排序
		set.add(123);
		set.add(987);
		set.add(789);
		//其他类的排序用重写compareTo方法（实现Comparable接口）
//		set.add("ABd");//报错，不能添加不同类的对象
		
		Iterator iterator=set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
}
