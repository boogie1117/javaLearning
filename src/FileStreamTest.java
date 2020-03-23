import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

/**
 *
 * @Description 字节流的使用 
 * FileInputStream\ FileOutputStream
 * 文本文件用字符流传.txt.java.c...
 * 非文本文件用字节流传.jpg.png...
 * @author  Boogie
 * @date 2020年3月11日下午8:33:58 
 *
 */
public class FileStreamTest {

	
	@Test
	public void test() throws IOException {
		
		
		File file =new File("hello.txt");
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			
			byte[] buffer =new byte[5];
			int len;
			while((len=fis.read(buffer))!=-1) {
				String str = new String(buffer, 0 ,len);
				System.out.println(str);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			fis.close();
		}
		
		//用字节流输出汉字会出现乱码的情况，最好用字符流来传
	}
	public void copyPic(String src, String des) throws IOException {
		File f1= new File(src);
		File f2= new File(des);
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(f1);
			fos = new FileOutputStream(f2);
			
			byte[] arr = new byte[5];
			int len;
			while((len=fis.read(arr))!=-1) {
				fos.write(arr,0,len);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(fos!=null) fos.close();
				
			if(fis!=null) fis.close();
			
		}
	}
	@Test
	public void test1() throws IOException {
		
		String src= "a.jpg";
		String des= "b.jpg";
		FileStreamTest f= new FileStreamTest();
		f.copyPic(src, des);
	}
	
}
