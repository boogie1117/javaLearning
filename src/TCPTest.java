import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import org.junit.Test;

/**
 *
 * @Description 通过TCP连接实现客户端发文件，服务器端接受并发送确认
 * @author  Boogie
 * @date 2020年3月12日下午2:06:19 
 *
 */
public class TCPTest {

	@Test
	public void client() throws UnknownHostException, IOException {
		
		Socket socket= new Socket(InetAddress.getByName("127.0.0.1"),8899);
		
		OutputStream os= socket.getOutputStream();
		
		FileInputStream fis =new FileInputStream("a.jpg");
		
		byte[] buffer = new byte[1024];
		int len;
		while((len=fis.read(buffer))!=-1) {
			os.write(buffer,0,len);
		}
		socket.shutdownOutput();
		
		InputStream is = socket.getInputStream();
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		byte[] buffer1 = new byte[20]; 
		int len1;
		while((len1= is.read(buffer))!=-1) {
			baos.write(buffer1,0,len1);
		}
	}
	
	@Test
	public void server() throws IOException {
		
		ServerSocket ss = new ServerSocket(8899);
		Socket socket= ss.accept();
		
		InputStream is= socket.getInputStream();
		
		FileOutputStream fos= new FileOutputStream(new File("a2.jpg"));
		
		byte[] buffer= new byte[1024];
		int len;
		while((len=is.read(buffer))!=-1) {
			fos.write(buffer,0,len);
		}
		System.out.println("图片接收成功");
		
		OutputStream os = socket.getOutputStream();
		
		os.write("我已经收到了".getBytes());
		
		os.close();
		fos.close();
		is.close();
		socket.close();
		ss.close();
	}
	
}
