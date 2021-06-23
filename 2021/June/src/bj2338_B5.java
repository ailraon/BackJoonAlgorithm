import java.math.BigInteger;
import java.util.Scanner;

public class bj2338_B5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		BigInteger A = new BigInteger("0");
		BigInteger B = new BigInteger("0");
		BigInteger result = new BigInteger("0");
		
		A = s.nextBigInteger();
		B = s.nextBigInteger();
		
		result = A.add(B);
		System.out.println(result);
		result = A.subtract(B);
		System.out.println(result);
		result = A.multiply(B);
		System.out.println(result);
	}
}
