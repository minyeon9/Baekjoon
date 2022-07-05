import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        
		/*
		 * 입력 종료 End of File(EOF)
		 * - 입력에서 더이상 읽을 수 있는 데이터가 존재하지 않을 경우 반복문 종료
		 * 
		 * Scanner
		 * - scanner 메소드의 경우 읽을 데이터가 없을 경우 NoSuchElementException 발생
		 * 		- hasNext() / hasNextInt() 를 사용하여 정수가 아닐 경우 false 반환하여 반복문 종료
		 * 
		 * BufferedReader
		 * - null 반환
		 * 		- null인지 아닌지 구분하여 null일 경우 반복문 종료 
		 * 
		 * */
        
		Scanner sc = new Scanner(System.in);
		
		while ( sc.hasNextInt() ) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a + b);
		}
		
		// 참고 : https://st-lab.tistory.com/40
	}
}