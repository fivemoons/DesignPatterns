package strategy;

import java.io.Serializable;
import java.util.Comparator;

public class Host {
	private static class StrLenCmp implements Comparator<String>, Serializable{
		public int compare(String s1, String s2){
			return s1.length() -s2.length();
		}
		//Returned comparator is serializable
		public static final Comparator<String>
			STRING_LENGTH_COMPARATOR = new StrLenCmp();
		
		
		//String类利用这种模式，CASE_INSENSITIVE_ORDER域 导出不区分大小写的字符串比较器
	} 
}
