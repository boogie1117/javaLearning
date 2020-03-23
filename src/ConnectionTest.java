
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * 
 *
 * @Description:集合方法的使用 
 * @author  Boogie
 * @date 2020年3月10日上午8:35:21 
 *
 */
public class ConnectionTest {

		public static void main(String[] args) {
			Collection coll= new ArrayList();
			//add(Object e)：将元素e添加到集合coll中
			coll.add("AA");
			coll.add("BB");
			coll.add(123);//会自动转化为Integer类型
			coll.add(new Date());
			
			//size()：获取添加元素的个数
			System.out.println(coll.size());
		
			//addAll():将一个集合的所有元素添加到另一个集合中
			Collection coll1= new ArrayList();
			coll1.add(456);
			coll1.add("CC");
			coll1.add(new Person("Tom",20));
			coll.addAll(coll1);
			System.out.println(coll.size());
			
			//clear()清空集合中的所有元素
			//coll.clear();
			
			//isEmpty()判断集合是否为空
			System.out.println(coll.isEmpty());
			
			//contains()判断是否包含,调的是equals方法，要求我们重写自定义类的equals方法
			System.out.println("*******************");
			 boolean contains =coll.contains(123);
			 System.out.println(contains);
			 contains =coll.contains(new String("Tom"));
			 System.out.println(contains);
			 contains =coll.contains(new Person("Tom",20));
			 System.out.println(contains+"***");//true
			 
			//containsAll()
			 System.out.println("****");
			 boolean contains1= coll.containsAll(coll1);
			 System.out.println(contains1);
			 
			 //remove()从当前集合删除元素找到返回true，没找到返回false
			 //也需要重写equals方法
//			 contains1=coll.remove(123);
			 coll.remove(123);
			 System.out.println(contains1);
			 
			 //removeAll()差集，从当前集合中删去和另一个集合相同的元素
			 coll.removeAll(coll1);
			 //retainAll()交集，获取当前集合和另一集合的交集，保留一样的删除不一样的
			 coll.retainAll(coll1);
			 
			 //equals()，当前集合和另一集合元素完全一样，ArrayList要求顺序也一样
			 coll.equals(coll1);
			 
			 //hashCode()返回当前对象的哈希值
			 System.out.println(coll.hashCode());
			 
			 //集合-->数组toArray()
			 Object[] arr=coll.toArray();
			 for(int i=0;i<arr.length;i++)
				 System.out.println(arr[i]);
			 
			 //数组-->集合
			 List<String>  list= Arrays.asList(new String[] {"AA","BB","CC" });
			 System.out.println(list);
			 
			 //这种方法认为是一个元素
			 List<int[]> arr1=Arrays.asList(new int[] {123,456});
			 //下面是多个元素的形式
			 List arr3=Arrays.asList(new Integer[] {123,456});
			 List arr2=Arrays.asList(123,456);
			 System.out.println(arr1);
			 System.out.println(arr2);
			 System.out.println(arr3);
			 
		}
}
