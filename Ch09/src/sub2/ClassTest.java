package sub2;

import sub1.Apple;

/*
 * 날짜 : 2021/05/25
 * 이름 : 김철학
 * 내용 : 자바 내장 클래스(기본 API 클래스) 실습하기
 *
 */
public class ClassTest {
	
	public static void main(String[] args) {
		// Class 클래스 : 객체를 동적 생성할 때 사용하는 클래스
		
		// 정적객체 : 객체생성안해도 객체가 생성되어있다
		Apple a1 = new Apple("한국", 3000);
		a1.toString();
		
		// 동적객체 : 객체 생성하는 동안 객체가 생성되는것
		try {
			Class cls = Class.forName("sub1.Apple");
			Apple a2 = (Apple)cls.newInstance();
			
			a2.toString();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
