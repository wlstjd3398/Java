package Ch04;

public class P61 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		// and ����
		System.out.println(a > b && a == 10);
		System.out.println(a > b && a == b);
		
		// or ����
		System.out.println(a > b  || a == b);
		System.out.println(a < b  || a == b);
		
		// xor ���� �������� true�϶� �����false, ������ true�϶� true���
		System.out.println(a > b ^ a == 10);
		System.out.println(a > b ^ a == b);
		
		// not ����
		System.out.println(!(a > b));
		System.out.println(!(a < b));
	}
}
