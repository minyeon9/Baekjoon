import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int t = sc.nextInt();
		
		h += t / 60; // t의 몫
		m += t % 60; // t로 나눈 나머지
		
		// 60분 이상일 경우
		if(m >= 60) {
			h += 1;  // h에 1시간 추가
			m -= 60; // m에서 -60분 
		}
		
		// 시간이 23시보다 클 경우
		if(h > 23) {
			h -= 24;
		}
		
		System.out.println(h + " " + m);	
	}
}