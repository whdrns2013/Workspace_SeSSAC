package kr.ac.sesac.exam06;

public class SoundMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sound piano = new Piano();
		System.out.println(((Piano) piano).sound());
		
		
//		1부터 n까지의 홀수의 합 For 문 이용
		
		int n = 1700;
		int sum = 0;
		
		for ( int i = 0 ; i <= n ; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		
		System.out.println(sum);
		
		
		
		
		
//		1부터 n까지의 홀수의 합 while 문 이용
		
		int m = 1700;
		int sumWhile = 0;
		int j = 0;
		
		while ( j <= m) {
			if (j % 2 == 1) {
				sumWhile += j;
			}
			j++;
		}
		
		System.out.println(sumWhile);
		
		
		
		
		
	}

}
