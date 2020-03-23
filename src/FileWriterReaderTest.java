import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

/**
 * 
 *
 * @Description 字符流reader 、writer的使用
 * @author  Boogie
 * @date 2020年3月11日下午6:59:23 
 *
 */
public class FileWriterReaderTest {

	public static void main(String[] args) throws IOException {
		
		File file =new File("hello.txt");
		//将项目test下的hello.txt文件读入控制台输出
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(file);
			int read = fileReader.read();
			//方式一
			while(read!=-1) {//数据读完返回-1
				System.out.print((char)read);
				read = fileReader.read();
			}
			//方式二
			while((read = fileReader.read())!=-1) {//数据读完返回-1
				System.out.print((char)read);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//不管流有没有问题都关闭，防止资源浪费
			fileReader.close();
		}
		
		
	}
	@Test
	public void testReader() throws IOException {
		File file = new File("hello.txt");
		FileReader fr = null;
		try {
			fr = new FileReader(file); 
			char[] cbuf =new char[5];
			int len;
			//错的
//		while((len= fr.read(cbuf))!=-1) {
//			for(int i=0;i<cbuf.length;i++) {
//				System.out.print(cbuf[i]);
//			}
//			System.out.println("");
//		}
			//方式一
			while((len= fr.read(cbuf))!=-1) {
				for(int i=0;i<len;i++) {
					System.out.print(cbuf[i]);
				}
				System.out.println("");
			}
			//方式二
			String str = new String(cbuf,0,len);  
			System.out.println(str);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			fr.close();
		}
		
	}
	
	
	@Test
	public void testWriter() throws IOException {
		
		
		File file = new File("hello1.txt");//不存在的文件帮你创建
		//若存在覆盖原有文件的内容
		File file1 = new File("D:\\hello1.txt");
		System.out.println(file.getPath());
		FileWriter fw =new FileWriter(file,true);//不会对原有文件覆盖
		FileWriter fw1 =new FileWriter(file1,true);//对原有文件覆盖
		fw.write("I have a dream!\n");
		fw.write("You  have a dream!");
		fw.close();
	}
	
	
	@Test
	public void testReadWrite() throws IOException {
		
		
		File file =new File("hello.txt");
		File file1 = new File ("hello1.txt");
		
		
		
		FileReader fileReader = null;
		FileWriter fileWriter = null;
		try {
			fileReader = new  FileReader(file);
			fileWriter = new FileWriter(file1);
			
			char[] cbuf = new char[5];
			int len;
			while ((len=fileReader.read(cbuf))!=-1) {
				fileWriter.write(cbuf,0,len);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		fileReader.close();
		fileWriter.close();
		}
		
	}
}
