import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @Description:TreeMap
 * @author  Boogie
 * @date 2020年3月10日下午6:18:10 
 *
 */
class User1{
	String name;
	int age;
	public User1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User1 other = (User1) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
public class TreeMapTest {

	
	public static void main(String[] args) {
		
		TreeMap map= new TreeMap(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				if(o1 instanceof User1&&o2 instanceof User1) {
					User1 u1=(User1)o1;
					User1 u2=(User1)o2;
					return Integer.compare(u1.age, u2.age);
				}
				throw new RuntimeException("类型不匹配");
			}
			
		});
		User1 u1= new User1("Tom",20);
		User1 u2= new User1("Jerry",30);
		User1 u3= new User1("Jack",25);
		User1 u4= new User1("Rose",50);
		
		map.put(u1, 98);
		map.put(u2, 88);
		map.put(u3, 50);
		map.put(u4, 98);
		Set set = map.keySet();
		Iterator iterator1=set.iterator();
		while(iterator1.hasNext())
		{
			Object key=iterator1.next();
			Object value1=map.get(key);
			System.out.println(key+"*"+value1);
		
	}
}}
