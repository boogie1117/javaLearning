
public class SubStringCountTest {

	
	public int getCount(String mainString, String subString) {
		if(subString.length()<=mainString.length()) {
			int index =0;
			int count=0;
			while((index=mainString.indexOf(subString,index))!=-1) {
				count++;
				index+=subString.length();
			}
			return count;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abjijiljabjjdjcabkcokob";
		SubStringCountTest s=new SubStringCountTest();
		int count = s.getCount(str, "ab");
		System.out.println(count);
	}

}
