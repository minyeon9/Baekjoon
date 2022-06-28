import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int h = 0;
		int m = 0;
		
		Scanner sc = new Scanner(System.in);
		
		h = sc.nextInt();
		m = sc.nextInt();
		
		if ( m < 45 ) {
			h--;
			m = 60 - 45 + m;
			
			if ( h < 0 ) {
				h = 23;
			}
			
			System.out.println( h + " " + m );
			
		} else {
			System.out.println( h + " " + (m - 45) );
		}
	}

}