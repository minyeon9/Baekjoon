import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        int korea = 1998;
		int thailand = 2541;
		int gap = thailand - korea; // 543
		
		Scanner sc = new Scanner(System.in);
		
		int scInt = sc.nextInt();
		
		System.out.println(scInt - gap);
    }
}