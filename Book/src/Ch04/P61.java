package Ch04;

public class P61 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		// and 연산
		System.out.println(a > b && a == 10);
		System.out.println(a > b && a == b);
		
		// or 연산
		System.out.println(a > b  || a == b);
		System.out.println(a < b  || a == b);
		
		// xor 연산 양쪽항이 true일때 결과값false, 한쪽이 true일때 true출력
		System.out.println(a > b ^ a == 10);
		System.out.println(a > b ^ a == b);
		
		// not 연산
		System.out.println(!(a > b));
		System.out.println(!(a < b));
	}
}
