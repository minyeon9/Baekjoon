import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		
		System.out.println( (a+b) % c );
		System.out.println( ((a%c) + (b%c)) % c );
		System.out.println( (a*b % c) );
		System.out.println( ((a%c) * (b%c))%c );
	
	}
}