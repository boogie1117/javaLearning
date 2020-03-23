import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

/**
 *
 * @Description 标准的输入输出流、打印流、数据流、对象流
 *  * 标准的输入输出流
* * System.in:默认从键盘输入
* * System.out：默认从控制台输出
** 

** 数据流产生的文件不能直接打开读，只能用数据流读出来
* 
 * * 要想一个对象是可序列化的，需要在实例化的类中实现Serializable接口
* *该接口是一个标识接口，但是要提供一个标识属性serialVersionUID
* *自定义异常的时候也用到了serialVersionUID
**该类的所有属性也都是可序列化的
**static和transient修饰的属性是不可序列化的

 * @author  Boogie
 * @date 2020年3月12日上午8:49:18 
 *
 */
public class OtherStreamTest {

	
	@Test
	public void test() throws IOException {
		/*
		 * 标准的输入输出流
		 * System.in:默认从键盘输入
		 * System.out：默认从控制台输出
		 */
		
		//setIn()/setOut()
		
		
		//System.in-->BufferedReader(readline方法)
		BufferedReader br = null;
		try {
			InputStreamReader isr= new InputStreamReader(System.in);;
			br = new BufferedReader(isr);
			String data;
			while (true) {
				data= br.readLine();
				if(data.equalsIgnoreCase("e")||data.equalsIgnoreCase("exit")) {
					System.out.println("结束");
					break;
				}
				String upperCase= data.toUpperCase();
				System.out.println(upperCase);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(br!=null)
			br.close();
		}
		
	}
	
	/*
	 * 数据流
	 * 数据流产生的文件不能直接打开读，只能用数据流读出来
	 */
	@Test
	public void test3() throws IOException {
		
		DataOutputStream dos= new DataOutputStream(new FileOutputStream("data.txt"));
		dos.writeUTF("哈哈哈");
		dos.flush();
		dos.writeInt(123);
		dos.flush();
		dos.writeBoolean(true);
		dos.flush();
		dos.close();
	}@Test
public void test4() throws IOException {
	DataInputStream dis =new DataInputStream(new FileInputStream("data.txt"));
	String name = dis.readUTF();
	int num = dis.readInt();
	boolean b = dis.readBoolean();
	System.out.println(name+"+"+num+"+"+b);
}
	
	/*
	 * 对象流(要求对象可序列化)
	 * 序列化：将对象从内存中写入数据源中
	 * 反序列化：将数据源还原成对象（读入内存）
	 */
	@Test
	public void test5() throws IOException {
		//序列化,生成的文件不能直接 
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("obj.dat"));
			oos.writeObject(new String("哈哈哈哈"));
			oos.flush();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(oos!=null)
			oos.close();
		}
		
	}
	
	@Test
	public void test6() throws IOException, ClassNotFoundException {
		ObjectInputStream ois= new ObjectInputStream(new FileInputStream("obj.dat"));
		Object obj=ois.readObject();
		ois.close();
		String str= (String )obj;
		System.out.println(str);
	}
	
	@Test
	public void test7() throws IOException {
		//序列化,生成的文件不能直接 
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("obj.dat"));
			//对象必须是可序列化的
			/*
			 * 要想一个对象是可序列化的，需要在实例化的类中实现Serializable接口
			 *该接口是一个标识接口，但是要提供一个标识属性serialVersionUID
			 *自定义异常的时候也用到了serialVersionUID.
			 *该类的所有属性也都是可序列化的
			 */
			oos.writeObject(new Person("Tom",22));
			oos.flush();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(oos!=null)
			oos.close();
		}
		
	}
	
	@Test
	public void test8() throws IOException, ClassNotFoundException {
		ObjectInputStream ois= new ObjectInputStream(new FileInputStream("obj.dat"));
		Object obj=ois.readObject();
		ois.close();
		Person str= (Person )obj;
		System.out.println(str);
	}
}



