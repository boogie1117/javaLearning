/**
 * 这个文件用于返回两个字符串的最大子字符串
 * @author lenovo
 *
 */
public class StringTest {

	public String getMaxSameString(String str1,String str2) {
		if(str1!=null&&str2!=null) {
			String maxStr = (str1.length()>=str2.length())?str1:str2;
			String minStr = (str1.length()<str2.length())?str1:str2;
			int length = minStr.length();
			for(int i= 0;i<length;i++) {
				for(int x=0,y=length-i;y<=length;x++,y++) {
					String subStr = minStr.substring(x,y);
					if(maxStr.contains(subStr)) {
						return subStr;
					}
				}
			}
			
		}
		return null;
	}
	
	public static void main(String[] args) {
		String str1="helloworldhahahhazaoanya";
		String str2="hahahahcsjdlv";
		StringTest s=new StringTest();
		String str= s.getMaxSameString(str1, str2);
		System.out.println(str);
	}
}
