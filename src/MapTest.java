import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @Description Map
 * 双列存储，存储key-value(类似于高中的映射) 对，key和value构成entry
 * key用set存，无序但不能重复key所在类要重写equals和hashcode方法
 * value可重复但无序用collection，value所在类要重写equals方法
 * 排序是按照key排序，与value无关，只考虑key的自然排序
 * hashmap（数组+链表+红黑树）（红黑树只有8以后才有）线程不安全，效率高，key或value可以值为null
 * hashtable线程安全，效率不高，key或value不可以值为null
 * LinkedHashMap适合频繁更改，在原有的hashmap底层结构的基础上添加了一对指针
 * @author  Boogie
 * @date 2020年3月10日下午3:56:17 
 *
 */
public class MapTest {

	
	public static void main(String[] args) {
		
		Map map=new HashMap();
//		map=new HashTable();
		
		
		//添加、修改也用put直接覆盖
		map.put("AA",123);
		map.put(789,123);
		map.put("SS",54);
		map.put("ll",583);
		map.put("AA",456);
		System.out.println(map);
		//putAll()
		Map map1=new HashMap();
		map1.put(123,"AS");
		map1.put(56, 46);
		
		map.putAll(map1);
		System.out.println(map);
		
		//删除，参数是key
		Object value =map.remove("AA");
		System.out.println(value);
		System.out.println(map);
		
		//clear()
//		map.clear();
		System.out.println(map);
		
		//get()
		System.out.println("**"+map.get(789));
		
		//contains()
		boolean isExist =map.containsKey(123);
		boolean isExist1=map.containsValue(123);
		System.out.println(isExist+"++"+isExist1);
		
		//isEmpty()与size()方法类似
		//equals()判断是否相等
		
		//遍历key
		Set set = map.keySet();
		Iterator iterator=set.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		System.out.println("+++++++");
		//遍历value
		Collection values=map.values();
		for(Object o:values) {
			System.out.println(o);
		}
		
		//遍历所有的KeyValue
		//方式一
		Set entrySet = map.entrySet();
		Iterator iterator2 = entrySet.iterator();
		while(iterator2.hasNext()) {
			Object o=iterator2.next();
			//集合中的元素都是entry
			Map.Entry entry=(Entry) o;
			System.out.print(entry.getKey()+"-");
			System.out.println(entry.getValue());;
			
			System.out.println("@@@@@@@@@@");
			//方式二
			Set set2 = map.keySet();
			Iterator iterator1=set.iterator();
			while(iterator1.hasNext())
			{
				Object key=iterator1.next();
				Object value1=map.get(key);
				System.out.println(key+"*"+value1);
			}
			
			
		}
	}
}
