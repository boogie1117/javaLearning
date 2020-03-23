import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @Description Collection是一个操作Collection(Set、List)、Map的工具类
 * Collections类中提供了多个synchroinizedXxx的方法，可使指定集合包装成线程同步的集合，从而解决ArrayList和HashMap的线程不安全问题
 * @author  Boogie
 * @date 2020年3月10日下午6:43:13 
 *
 */
public class CollectionsTest {

	
	public static void main(String[] args) {
		ArrayList list= new ArrayList();
		list.add(123);
		list.add("ac");
		list.add(true);
		//常用方法
		 //reverse(list)反转
		Collections.reverse(list);
		System.out.println(list);
		//shuffle(list)随机化处理
		Collections.shuffle(list);
		System.out.println(list);
		//sort(list)
//		Collections.sort(list);//类型必须是一致的否则会报错
		System.out.println(list);
		//sort(list,comparator)
		
		//swap(list, int ,int)交换指定位置上的元素
		
		//max(Collection),max(Collection,Comparator)
		//min(Collection),min(Collection,Comparator)
		
		//frequency(list,Object)
		int frequency = Collections.frequency(list, 123);
		System.out.println(frequency);
		
		 //copy(list,list1);l把list1复制到list中
		
		//replaceAll()
		
		//返回一个线程安全的list
		List synchronizedList = Collections.synchronizedList(list);
	}
}
