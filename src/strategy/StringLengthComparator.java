package strategy;

import java.util.Arrays;
import java.util.Comparator;

public class StringLengthComparator implements Comparator<String>{
	private StringLengthComparator(){}
	public static final StringLengthComparator INSTANCE 
		= new StringLengthComparator();
	public int compare(String s1, String s2){
		return s1.length() - s2.length();
	}
	
	//具体的策略类往往使用匿名类声明
	public static void main(String[] args) {
		Arrays.sort(new String[]{"abc","def"},new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
			
		});
	}
}
