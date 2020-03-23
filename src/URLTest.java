import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @Description URL在服务器下载文件
 * @author  Boogie
 * @date 2020年3月12日下午2:49:35 
 *
 */
public class URLTest {

	public static void main(String[] args) throws IOException {
		//这个路径不太明白
		URL url = new URL("http://localhost:8088/examples/a.jpg");
		
		HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection(); 
		
		httpURLConnection.connect();
		
		InputStream is = httpURLConnection.getInputStream();
		FileOutputStream fos =new FileOutputStream("aa.jpg");
		
		byte[] buffer= new byte[1024];
		int len;
		while((len=is.read(buffer))!=-1) {
			fos.write(buffer,0,len);
		}
		
		is.close();
		fos.close();
		httpURLConnection.disconnect();;
	}
}
