import java.util.HashSet;
import java.util.Iterator;

/**
 * 一道经典的面试题
 *
 * @Description:<功能的描述> 
 * @author  Boogie
 * @date 2020年3月10日下午3:37:01 
 *
 */
class User{
	int id;
	String name;
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
}
public class HashDemo {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		User u1=new User(1001,"AA");
		User u2=new User(1001,"BB");
		
		set.add(u1);
		set.add(u2);
		
		Iterator iterator=set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("****");
		u1.name="CC";
		set.remove("AA");//不会删除成功因为当时加到list时算hash值的时候是按“AA”算的，现在是按照“CC”所找到的地址为空，删除失败
		iterator=set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("****");
		
		set.add(new User(1001,"CC"));
		//可以添加成功，是因为按照“CC”去算的hash值的那个位置没有元素，之前修改的那个还是在“AA”所算hash值的位置
		iterator=set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("****");
		
		set.add(new User(1001,"AA"));
		//可以添加成功，hash值虽然找到了一开始是“AA”的地方，但是equals不相同
		iterator=set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("****");
		
		
	}
	
}
