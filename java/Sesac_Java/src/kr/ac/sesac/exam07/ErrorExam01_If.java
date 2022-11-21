package kr.ac.sesac.exam07;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ErrorExam01_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String numStr = " 123";
//		int num = Integer.parseInt(numStr); // NumberFormatException
//		Object obj = new String("a");
//		int a = (Integer) obj; // ClassCastException
		
		
		
		String numStr = " 123";
		Pattern p = Pattern.compile("^[0-9]*$");
		Matcher m = p.matcher(numStr);
		boolean isNumber = m.matches();
		if(isNumber) {
		int num = Integer.parseInt(numStr);
		}
		
		Object obj = new String("a");
		if(obj instanceof Integer) {
		int a = (Integer) obj;
		} else if(obj instanceof String) {
		String a = (String) obj;
		}
		System.out.println(a);
		
		
	}

}
