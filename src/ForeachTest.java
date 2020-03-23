import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @Description:5.0新增的foreach循环
 * @author  Boogie
 * @date 2020年3月10日上午10:22:26 
 *
 */
public class ForeachTest {

	
	public static void main(String[] args) {
		//遍历集合
		Collection coll= new ArrayList();
		//add(Object e)：将元素e添加到集合coll中
		coll.add("AA");
		coll.add("BB");
		coll.add(123);
		coll.add(new Date());
		//增强for循环遍历,内部也是迭代器
		//格式for(集合中元素类型 局部变量  ： 集合对象 )
		for(Object obj: coll) {
			System.out.println(obj);
		}
		//遍历数组
		System.out.println("+++++");
		int[] a = new int[] {1,2,3,4,5};
		for(int i:a) {
			System.out.println(i);
		}
		//增强for循环不会修改当前数组的元素
		
	}
}
