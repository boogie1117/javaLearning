import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 *
 * @Description 通配符?的使用
 * @author  Boogie
 * @date 2020年3月11日下午12:24:41 
 *
 */
public class GenericTest2 {

	public static void main(String[] args) {
			List<String> list1=null;
			List<Integer>list2= new ArrayList<Integer>();
			list2.add(123);
			list2.add(456);
			//?代表所有类
			List<?>  list=null;
	//		使用通配符的list就不能向其内部添加数据了，add（）方法会出错
	//		list.add("132");//出错了
			//但是可以读数据,读取的类型为Object
			list=list2;
			Object object = list.get(0);
			System.out.println(object);
			//extends小于等于
			List<? extends Person> lista= null;
			//super大于等于
			List<? super Person> listb= null;
			
			List<Student> listc=new ArrayList<Student>();
			List<Person> listd=new ArrayList<Person>();
			List<Object> liste=new ArrayList<Object>();
			
			lista= listc;
			lista=listd;
//			lista=liste;出错了
			
//			listb= listc;出错了
			listb=listd;
			listb=liste;
			
			//读数据
			Iterator<? extends Person> iterator = lista.iterator();
			Person p=lista.get(0);//大于等于
//			Student s=lista.get(0);报错
			
			//写数据
			//extends不能写数据
//			lista.add(new Student(null, 0));错的
			//有可能？小于student，所以不允许
//			lista.add(new Person("123",123));错的
			//super可以写小于等于他的
			listb.add(new Person("ad",132));//可以
			listb.add(new Student("ads",1));
		
		}
	

public void print1 (List<?> list) {
	Iterator<?> iterator=list.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
}

}
