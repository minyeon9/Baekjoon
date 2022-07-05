import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int result = 0;
		
		if( a == b && b == c && a == c ) {
			result = 10000 + a * 1000;
		} else if ( a == b || a == c ) {
			result = 1000 + a * 100;
		} else if ( b == c ) {
			result = 1000 + b * 100;
		} else {
			/*
			 * 최대값 찾기
			 * 
			 * Math.max()
			 * - 두 인자 중 큰 값 리턴
			 * - 먼저 b, c 중 큰 값을 구하고 그값과 a를 다시 비교하여 리턴
			 * 
			 * */
			result = Math.max(a, Math.max(b, c)) * 100;
		}
		
		System.out.println(result);
			
		// 최대값 찾기
//		int[] numArray = {a, b, c};
//		int maxNum = numArray[0];
//		
//		for( int i : numArray ) {
//			if( i > maxNum ) {
//				maxNum = i;
//			}
//		}
//		
//		System.out.println(maxNum * 100);		
	}
}