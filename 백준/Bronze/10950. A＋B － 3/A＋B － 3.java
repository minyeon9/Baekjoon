import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* for문 */
		Scanner sc = new Scanner(System.in);
		int t = 0;
		int a = 0;
		int b = 0;
		
		t = sc.nextInt();
		
		
		for(int i = 0; i < t; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			
			System.out.println(a + b);
		}
		
	}

}