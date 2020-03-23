import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import org.junit.Test;

/**
 *
 * @Description InputStreamReader 将字节流转化为字符流的转化流
 * OutputStreamWriter 将字符流转化为字节流的转化流 
 * @author  Boogie
 * @date 2020年3月12日上午8:15:22 
 *
 */
public class InputStreamReaderTest {

	//输入
	@Test
	public void test1() throws IOException {
		
		File file = new File("hello.txt");
		InputStreamReader isr = null;
		try {
			FileInputStream fis = new FileInputStream(file);
			isr = new InputStreamReader(fis,"UTF-8");
			char[] cbuf =new char[20];
			int len;
			while((len=isr.read(cbuf))!=-1) {
				String  data = new String(cbuf,0,len);
				System.out.println(data);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(isr!= null)
			isr.close();
		}
		
		
	}
	
	
	//输出
	@Test
	public void test2() throws IOException {

		File file1 = new File("hello.txt");
		File file2 = new File("hello_gbk.txt");
	
		InputStreamReader isr = null;
		OutputStreamWriter osw = null;
		try {
			FileInputStream fis = new FileInputStream(file1);
			FileOutputStream fos = new FileOutputStream(file2);

			isr = new InputStreamReader(fis,"UTF-8");
			osw = new OutputStreamWriter(fos,"gbk");

			char[] cbuf =new char[20];
			int len;
			while((len=isr.read(cbuf))!=-1) {
				osw.write(cbuf,0,len);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(isr!=null)
			isr.close();
			if(osw!=null)
			osw.close();
		}
		
		
	}
}
