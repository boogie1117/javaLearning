import java.util.Arrays;
import java.util.Comparator;

import javax.management.RuntimeErrorException;

class good {
	private String name;
	public good(String name, int price) {
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
	public String toString() {
		return "good [name=" + name + ", price=" + price + "]";
	}
	
}
public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		good arr[]= new good[4];
		arr[0]=new good("商品1",50);
		arr[1]=new good("商品2",45);
		arr[2]=new good("商品3",60);
		arr[3]=new good("1商品4",45);
		Arrays.sort(arr,new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				if(o1 instanceof good&&o2 instanceof good) {
					good g1=(good)o1;
					good g2=(good)o2;
					if(g1.getPrice()>g2.getPrice())return 1;
					else if(g1.getPrice()>g2.getPrice())return -1;
					else return g1.getName().compareTo(g2.getName());
				}
				throw new RuntimeException("类型错误！！");
			}
		});
		System.out.println(Arrays.toString(arr));
//		for(int i=0;i<arr.length;i++)System.out.println(arr[i]);		
	}

}
