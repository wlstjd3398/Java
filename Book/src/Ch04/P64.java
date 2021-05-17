package Ch04;

public class P64 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		
		//&연산-> &&연산 방어코드
		System.out.println(b > 0 && (a / b > 0));
	}
}
