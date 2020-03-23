import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @Description:List 动态数组
 * @author  Boogie
 * @date 2020年3月10日上午10:48:45 
 *
 */
public class ListTest {

	public static void main(String[] args) {
		/*
		 * ArrayList Vector LinkedList
		 * 相同：三个类都实现了List接口，存储数据的特点相同：存储有序、可重复
		 * 不同：ArrayList线程不安全，效率高。底层使用Object[]
		 * 			LinkedList对于频繁插入删除操作使用此类比ArrayList快。底层使用双向链表
		 * 			Vector线程安全，效率低。底层使用Object[]
		 */
		
		//常见方法
//		ArrayList list =new ArrayList();
		//一般若是知道集合的长度最好在new的时候使用带参数的构造器，以减少后期扩容时的时间
		ArrayList list = new ArrayList(10);
		
		//add(Object obj)增加
		list.add(123);
		list.add("abc");
		list.add(new Person("Tom",20));
		list.add(true);
		for(Object obj: list) {
			System.out.println(obj);
		}
		System.out.println("*********");
		//remove(int index)/remove(Object obj)删除
		list.remove(1);
		list.remove("abc");
		for(Object obj: list) {
			System.out.println(obj);
		}
		System.out.println("*********");
		
		//set(int index , Object obj)改
		list.set(0, 456);
		for(Object obj: list) {
			System.out.println(obj);
		}
		System.out.println("*********");
		
		//get(int index)查
		System.out.println(list.get(0));
		System.out.println("*********");
		
		//add(int index,Object obj)在index的位置上插入
		list.add(1, "haha");
		for(Object obj: list) {
			System.out.println(obj);
		}
		System.out.println("*********");
		
		//遍历
		//①Iterator迭代器遍历
		Iterator iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("*********");
		//② 增强for循环遍历
		for(Object o :list) {
			System.out.println(o);
		}
		System.out.println("*********");
		//③普通循环遍历
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
	
}
