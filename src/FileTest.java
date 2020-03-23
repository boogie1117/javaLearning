import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @Description  File 累的使用
 * File 类代表了一个文件或者文件目录
 * @author  Boogie
 * @date 2020年3月11日下午5:10:01 
 *
 */
public class FileTest {

	public static void main(String[] args)   {
		
		//构造器1
		//相对路径，相对于当前项目来说（test包下）
		File file= new File("hello.txt");
		
		//绝对路径,包含盘符在内的路径
		//路径分隔符在Windows下是“\”Linux下
		File file1= new File("D:\\eclipse工作区\\Test\\hello.txt");
		
		//构造器2
		//父路径+子路径
		File file2= new File("D:\\eclipse工作区"+"Test");
		
		//构造器3
		File file3 = new File(file2,"hello.txt");
		
		
		//获取功能
		File path=file.getAbsoluteFile();
		file.getPath();
		file.getName();
		file.getParent();//相对路径找不到parent
		file.length();
		Date date= new Date(file.lastModified());
		
		File path1=file1.getAbsoluteFile();
		file1.getPath();
		file1.getName();
		file1.getParent();
		file1.length();
		file1.lastModified();//返回毫秒数
		
		//返回目录下的子目录或文件
		String[] list = file2.list();//返回文件或子目录的数组
		for(String str:list) {
			System.out.println(str);
		}
		File[] listFiles = file2.listFiles();
		for(File fl: listFiles) {
			System.out.println(fl);
		}
		
		//重命名
		file1.renameTo(file2);//要想保证返回true需要file1在硬盘中是存在的且file2不存在
		//执行结束后file1不再存在，file2存在
		
		
		//判断
		boolean exists = file.exists();
		boolean directory = file.isDirectory();
		boolean file4 = file.isFile();
		boolean canRead = file.canRead();
		boolean canWrite = file.canWrite();
		boolean hidden = file.isHidden();
		//对文件执行操作前先执行exists()方法
		
		//创建
		try {
			boolean createNewFile = file.createNewFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}//若不存在则创建，若存在则不创建
		file.mkdir();//若目录不存在则创建，否则不创建
		file.mkdirs();//若上层目录不存在一并创建
		
		//创建一个与filea目录相同的文件haha.txt
		File filea =new File("D:\\eclipse工作区\\Test\\hello.txt");
		File fileb =new File(filea.getParent(),"haha.txt");
		boolean createNewFile2 = false;
		try {
			createNewFile2 = fileb.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(createNewFile2) {
			System.out.println("创建成功");
		}
		
		//删除,要想删除成功，目录下不能有子目录
		boolean delete = file.delete();
		
		//判断指定目录下是否有“.jpg”结尾的文件
		String[] list1 =file.list();
		for(int i=0;i<list1.length;i++) {
					if (list1[i].endsWith("jpg")) {
						System.out.println("存在");;
					}

		}
	}
}
