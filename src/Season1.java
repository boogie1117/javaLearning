import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

interface Info{
	void show() ;
}
public enum Season1 implements Info{
	
	//枚举类的对象要在声明属性和方法之前，否则会报错
	SPRING("春天"){
		@Override
		public void show() {
			System.out.println("春天在哪里");
		}
	},
	SUMMER("夏天"){
		@Override
		public void show() {
			System.out.println("夏天在哪里");
		}
	},
	AUTUMN("秋天"){
		@Override
		public void show() {
			System.out.println("秋天在哪里");
		}
	},
	WINTER ("冬天"){
		@Override
		public void show() {
			System.out.println("冬天在哪里");
		}
	};
	private final String seasonName;
	
	private Season1(String seasonName) {
		this.seasonName=seasonName;
	}
	public String getSeasonName() {
		return seasonName;
	}
	@Override
	public String toString() {
		return "Season1 [seasonName=" + seasonName + "]";
	}
//	@Override
//	public void show() {
//		System.out.println("这是一个季节");
//		
//	}
	
	//泛型方法
	public <E> List<E> cc(E[] arr){
		
		ArrayList<E> list =new ArrayList<E>();
		
		for(E e:list) {
			list.add(e);
		}
		return list;
//		return null;
		
	}
	
}