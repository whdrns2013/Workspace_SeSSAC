package kr.ac.sesac.exam07;

import java.io.File;

public class ErrorExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int a = (int)1.2; // compile error
//		// runtime exception
//		System.out.println(4 / 0); // Arithmetic
//		System.out.println(new String().charAt(1)); // IndexOutOfBounds
//		String str = null;
//		System.out.println(str.equals("")); // NullPointer
//		int[] arrs = new int[-1]; // NegativeArraySize
		String s = "Exception";
		int count = s.indexOf("a");
		int[] arrays = new int[count]; // NegativeArraySize
		System.out.println(arrays);
		// exception
//		new File("").createNewFile();
		
		
	}

}
