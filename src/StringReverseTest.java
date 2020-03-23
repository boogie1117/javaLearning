import javax.sound.midi.Soundbank;

import org.junit.Test;

public class StringReverseTest {
	
	
	
	//方式1： 转化为char[]数组，对数组进行部分反转
	public String reverse(String str, int startIndex, int endIndex) {
		if(str!=null) {
			char[] ch=  str.toCharArray();
			for(int i=startIndex, j=endIndex;i<j;i++,j--)
			{
				char temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
				
			}
			return new String(ch);
		}
		return null;
	}
	//方式2利用String的拼接完成部分反转
	public String  reverse1(String str,int startIndex, int endIndex) {
		if(str !=null) {
			String str1=str.substring(0, startIndex);
//			System.out.println(str1);
			for(int i=endIndex;i>=startIndex;i--) {
				str1+=str.charAt(i);
			}
			str1+=str.substring(endIndex+1);	
			
			return str1;
		}
		return null;
	}
	//方式3利用StringBuffer或者StringBuilder的append()方法完成部分反转
	public String  reverse2(String str,int startIndex,int endIndex) {
		if(str!=null) {
			StringBuilder sb=new StringBuilder(str.substring(0, startIndex));
//			sb.append(str.substring(0, startIndex));
			for(int i=endIndex;i>=startIndex;i--) {
				sb.append(str.charAt(i));
			}
			sb.append(str.substring(endIndex+1));
			return sb.toString();
		}
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcdefg";
		StringReverseTest sr=new StringReverseTest();
		
		String reverse= sr.reverse2(str,2,5);
		System.out.println(reverse);
	}

}
