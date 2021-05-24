package sub3;
/*
 * 날짜 : 2021/05/24
 * 이름 : 김철학
 * 내용 : 자바 정적(클래스) 변수, 정적(클래스) 메서드 실습하기
 */
public class Increment {

	public int num1;
	public static int num2;
	
	//Overload 메서드 이름같음 매개변수
	public Increment(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public Increment() {
		num1++;
		num2++;
		
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
	}
	
	public static void add() {
		//정적메서드에서는 none static 변수를 참조할수 없다.
		num2++;
	}
	
	
}
