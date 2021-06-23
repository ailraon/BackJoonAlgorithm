import java.util.Scanner;

public class bj2475_B5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int result = 0;
		for(int i = 0; i < 5; i++) {
			int sum = s.nextInt();
			result += sum*sum;
		}
		System.out.println(result%10);
	}
}
