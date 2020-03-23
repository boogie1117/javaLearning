import java.util.Arrays;

/**
 * 实现Comparable接口重写CompareTo()方法
 * @author lenovo
 *
 */
//方法1 在类中实现CompareTo方法
class goods implements Comparable{
	private String name;
	public goods(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	private int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public int compareTo(Object o) {
		if(o instanceof goods) {
			goods g= (goods)o;
			if(this.price>g.price)return 1;
			else if(this.price<g.price)return -1;
			else return this.name.compareTo(g.name);
		}
		throw new RuntimeException("类型错误");
		
	}
	@Override
	public String toString() {
		return "goods [name=" + name + ", price=" + price + "]";
	}
	
}
public class CompareToTest {
		public static void main(String[] args) {
				goods arr[]= new goods[4];
				arr[0]=new goods("商品1",50);
				arr[1]=new goods("商品2",45);
				arr[2]=new goods("商品3",60);
				arr[3]=new goods("1商品4",45);
				Arrays.sort(arr);
				for(int i=0;i<arr.length;i++)System.out.println(arr[i]);
//				System.out.println(arr);
		}
}
