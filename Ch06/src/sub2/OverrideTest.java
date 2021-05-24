package sub2;
/*
 * 날짜 : 2021/05/24
 * 이름 : 김철학
 * 내용 : 자바 오버라이드 메서드 실습하기
 * 
 *Override 메서드
 *부모클래스 메서드를 자식 클래스에서 다시 정의하는 메서드(재정의 메서드)
 *자식클래스에서 부모클래스의 메서드를 덮어씌운다 
 */
public class OverrideTest {
	public static void main(String[] args) {
		
		CCC c = new CCC();
		c.method1();
		c.method2();
		c.method2(100);
		c.method3();
		c.method3(200);
		
		//final 실습(final 쓰면 num이 상수가 됨 = 연산불가능상태로 마지막 변수가 됨)
		//final 변수는 상수, 대문자로 쓰임
		//final 메서드 : 오버라이드 금지
		//final 클래스 : 상속금지
		
		final int NUM = 1;
		//num += 1;
		
		
		
		
		
	}
}
