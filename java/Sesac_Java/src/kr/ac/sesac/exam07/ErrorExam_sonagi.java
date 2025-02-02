package kr.ac.sesac.exam07;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ErrorExam_sonagi {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		// (1) 번 try
//
//		try {
//			BufferedReader reader = new BufferedReader(new FileReader("data/소나기.txt"));
//			String text = "";
//			while (true) {
//				String data = reader.readLine();
//				if (data == null)
//					break;
//				text += data + "\n";
//			}
//			reader.close();
//			System.out.println(text);
//		}
//		catch(Exception reader) {
//			reader.printStackTrace();
//		}
//		finally {
//			System.out.println("항상 실행");
//		}

		// (2) 번 try

		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new FileReader("data/소나기.txt"));
		} catch (FileNotFoundException errorbin) {
			// TODO Auto-generated catch block
			errorbin.printStackTrace();
		} finally {
			String text = "";
			while (true) {
				String data = reader.readLine();
				if (data == null)
					break;
				text += data + "\n";
			}
			reader.close();
			System.out.println(text);

		}

	}

}
