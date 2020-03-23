import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

/**
 *
 * @Description RandomAccessFile的使用
 * 是直接继承object类的子类，实现了datainput和dataoutput接口
 * 即可以作为输入流，也可以作为输出流
 * 作为输出流时，若写出到的文件不存在则自动创建一个，若存在则对文件内容进行从头覆盖
 * 
 * @author  Boogie
 * @date 2020年3月12日上午10:39:41 
 *
 */
public class RamdomAccessFileTest {
	public static void main(String[] args) throws IOException {
		
		RandomAccessFile rad= new RandomAccessFile(new File("hello.txt"),"r" ); 
		RandomAccessFile rad1= new RandomAccessFile(new File("hello1.txt"),"rw" ); 
		
		byte[] buffer =new byte[10];
		int len;
		while((len=rad.read(buffer))!=-1) {
			rad1.write(buffer,0,len);
		}
		rad.close();
		rad1.close();
	}

}
