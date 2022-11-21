package kr.ac.sesac.exam07;

import java.rmi.AccessException;

public class ThrowsExam {
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub

	private String strNum;
	private String num;
	
	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}

	public void check() throws AccessException, ClassCastException{
		try {
			int num = Integer.parseInt(strNum);
			Object obj = new String(this.num);
			int a = (Integer) obj;
		}catch(NumberFormatException errorbin){
			throw new AccessException("숫자 변환 실패");
		}catch(ClassCastException errorbin) {
			throw new ClassCastException("캐스팅 실패");
		}finally {
		}
	}
public static void main (String args[]) throws AccessException, ClassCastException{
	
	ThrowsExam throwsExam = new ThrowsExam();
	
	throwsExam.setNum("123");
	throwsExam.setStrNum("abc");
	try {
		throwsExam.check();
	} catch (Exception e) {
		e.printStackTrace();
	}
}}
