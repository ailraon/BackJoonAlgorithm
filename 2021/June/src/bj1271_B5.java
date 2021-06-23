import java.math.BigInteger;
import java.util.Scanner;

public class bj1271_B5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		BigInteger Money = new BigInteger("0"); // 가진 돈
		BigInteger Share = new BigInteger("0"); // 돈 받으러 온 생명체의 수
		
		BigInteger balance = new BigInteger("0"); // 생명체 하나에게 돌아가는 돈의 양
		BigInteger remainder = new BigInteger("0"); // 1원씩 분배할 수 없는 돈
		
		Money = s.nextBigInteger();
		Share = s.nextBigInteger();
		
		balance = Money.divide(Share);
		remainder = Money.remainder(Share);
		
		System.out.println(balance);
		System.out.println(remainder);
	}
}
