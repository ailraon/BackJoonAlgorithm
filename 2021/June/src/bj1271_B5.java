import java.math.BigInteger;
import java.util.Scanner;

public class bj1271_B5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		BigInteger Money = new BigInteger("0"); // ���� ��
		BigInteger Share = new BigInteger("0"); // �� ������ �� ����ü�� ��
		
		BigInteger balance = new BigInteger("0"); // ����ü �ϳ����� ���ư��� ���� ��
		BigInteger remainder = new BigInteger("0"); // 1���� �й��� �� ���� ��
		
		Money = s.nextBigInteger();
		Share = s.nextBigInteger();
		
		balance = Money.divide(Share);
		remainder = Money.remainder(Share);
		
		System.out.println(balance);
		System.out.println(remainder);
	}
}
