import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

/**
 * 
 *
 * @Description:iterator接口，又称迭代器用来遍历集合元素
 * @author  Boogie
 * @date 2020年3月10日上午9:58:07 
 *
 */
public class IteratorTest {

	public static void main(String[] args) {
		Collection coll= new ArrayList();
		//将元素添加到集合coll中
		coll.add("AA");
		coll.add("BB");
		coll.add(123);
		coll.add(new Date());
		//迭代器遍历集合
		Iterator iterator= coll.iterator();
//		方式一
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
//		若超过集合范围则报错
//		System.out.println(iterator.next());
		
//		方式二
//		for(int i=0;i<coll.size();i++)
//		{
//			System.out.println(iterator.next());
//		}
		
//		方式三  更推荐
		while (iterator.hasNext()) {//hashNext只是判断下一个元素是否存在
			System.out.println(iterator.next());//next则会将指针下移
			if("Tom".equals(iterator.next())) {
				iterator.remove();//删除操作
			}
			//迭代器遍历一次之后指针为空且在最下面，再次遍历需要重新创建迭代器
		}
		
		
	}
	
}
