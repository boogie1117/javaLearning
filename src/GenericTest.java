import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @Description:泛型，是集合的元素类型单一，更加严谨
 * 使用泛型是一个类型，不能是基本类型
 * 泛型方法的测试在season类中
 * @author  Boogie
 * @date 2020年3月11日上午7:46:16 
 *
 */
public class GenericTest {

	public static void main(String[] args) {
		
		//使用泛型是一个类型，不能是基本类型
		//声明后只要用到list，类型一定是Integer
		ArrayList<Integer> list= new ArrayList<Integer>();
		
		list.add(123);
		list.add(456);
		list.add(123);
		//list.add("acd");报错，类型错误无法添加
		//遍历方式一
		for(Integer i: list) {
			//避免了强转操作
			int ii=i;
			System.out.println(ii);
		}
		System.out.println("*********");
		//遍历方式二
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("@@@@@@@@");
		
		//map
		Map<Integer, String> map= new HashMap<Integer, String>();
		map.put(123, "abc");
		map.put(465, "asd");
		map.put(789, "zxc");
		map.put(258, "qwe");
		
//		map.put("ca", 13);//报错
		
		Set<Map.Entry<Integer, String>> set =map.entrySet();
		Iterator<Entry<Integer, String>> iterator2 = set.iterator();
		while(iterator2.hasNext()) {
			Map.Entry<Integer, String> e =iterator2.next();
			Integer key=e.getKey();
			String value=e.getValue();
			System.out.println(key+"+"+value);
		}
	}
	
}
