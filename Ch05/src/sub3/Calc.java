package sub3;
/*
 * 날짜 : 2021/05/24
 * 이름 : 김철학
 * 내용 : 자바 정적(클래스) 변수, 정적(클래스) 메서드 실습하기
 */
public class Calc {
	
	private static Calc instance = new Calc();
	
	public static Calc getInstance() {
		return instance;
	}
	
	private Calc() {}
	
	public int plus(int x, int y) {
		return x+y;
	}
	public int minus(int x, int y) {
		return x-y;
	}
	public int multi(int x, int y) {
		return x*y;
	}
	public int div(int x, int y) {
		return x/y;
	}
}
