import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @Description:properties
 * @author  Boogie
 * @date 2020年3月10日下午6:29:41 
 *
 */
public class PropertitiesTest {
	
	
	public static void main(String[] args) throws IOException {
		Properties pros = new Properties();
		FileInputStream fis = new FileInputStream("jdbc.properties");
		pros.load(fis);
		String name = pros.getProperty("name");
		String password = pros.getProperty("password");
		System.out.println(name+"+"+password);
		fis.close();
		//Alt + Shift + z可以把一段代码包起来
		
	}
	
}
