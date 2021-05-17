package Ch04;

public class P63 {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		//&연산
		System.out.println(a == b & test());

		//&&연산
		System.out.println(a == b && test());
	}
	public static boolean test() {
		System.out.println("test()메서드 실행됨");
		return true;
	}
}
//논리연산에서 &&를 기준으로 오른쪽항이 true 이든 false 상관없이 false로 결정되어 오른쪽항 확인하지 않는것
//그러므로 실행속도 높임

