import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

/**
 *
 * @Description 缓冲流 提高流的读写速度
 * 处理流就是套接在已有的流之上的流
 * 关闭时只关闭最外层即可，因为会自动关闭内层的
 * BufferedInputStream
 * BufferedOutputStream
 * BufferedReader
 * BufferedWriter
 * @author  Boogie
 * @date 2020年3月11日下午9:12:27 
 *
 */
public class BufferedTest {

	
	@Test
	public void BufferedStreamTest() throws IOException {
		File file =new File("a.jpg");
		File file1 =new File("n.jpg");
		File file0 =new File("a.jpg");
		File file01 =new File("n.jpg");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			fis = new FileInputStream(file);
			fos = new FileOutputStream(file1);
			
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			byte[] buffer= new byte[5];
			int len;
			while((len = bis.read())!=-1) {
				bos.write(buffer,0,len);
			}
			
			BufferedReader br= new BufferedReader(new FileReader(file0));
			BufferedWriter bw = new BufferedWriter(new FileWriter(file01));
			
			String data;
			while((data=br.readLine())!=null) {
				bw.write(data);
				bw.newLine();//提供换行操作
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			//先关闭外层的，再关闭内部的
			if(bis!=null)
			bis.close();
			if(bos!=null)
			bos.close();
			if(fis!=null)
			fis.close();
			if(fos!=null)
			fos.close();
		}
		
		
		
	}
}
