import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @Description:Set接口的使用，set具有无序性、不可重复
 * //HashSet  LinkedHashSet  TreeSet 
 * @author  Boogie
 * @date 2020年3月10日下午2:04:48 
 *
 */
//LinkedHashSet 是HashSet的子类，在HashSet数组+链表的基础上，再添加数据的同时，记录了数据来的先后顺序

public class SetTest {

	public static void main(String[] args) {
		
		Set set=new LinkedHashSet();
		set.add(456);
		set.add(123);
		set.add("AA");
		set.add(new Person("Tom",22));
		
		//无序性  不等于随机性还是按照hash值排序的
		Iterator interator = set.iterator();
		while(interator.hasNext()) {
			System.out.println(interator.next());
		}
		//不可重复，保证添加的元素按照equals判断是不能返回true，本质上是拿equals比较
		//比较的是hashcode
		System.out.println("******");
		set.add(123);//不报错但不添加
		set.add(new Person("Tom",22));//不是拿equals判断的，重写HashCode方法后可保证类的不重复
		interator = set.iterator();
		while(interator.hasNext()) {
			System.out.println(interator.next());
		}
	}
	
}
