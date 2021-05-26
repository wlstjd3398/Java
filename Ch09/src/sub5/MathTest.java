package sub5;
/*
 *  날짜 : 2021/05/26
 *  이름 : 김철학
 *  내용 : 자바 Math 클래스 실습하기 P284
 */
public class MathTest {
	public static void main(String[] args) {
		
		// 객체 생성 못하게 막아놓음 생성할 일이 없음, 클래스 타입이름으로 바로 생성가능해서
		//Math math = new Math();
		
		
		System.out.println("PI값 : "+Math.PI);
		System.out.println("절대값 : "+Math.abs(-5));
		System.out.println("절대값 : "+Math.abs(-3.14));
		System.out.println("제곱근 : "+Math.sqrt(9));
		System.out.println("올림값 : "+Math.ceil(1.2));
		System.out.println("올림값 : "+Math.ceil(1.8));
		System.out.println("내림값 : "+Math.floor(1.2));
		System.out.println("내림값 : "+Math.floor(1.8));
		System.out.println("반올림 : "+Math.round(1.2));
		System.out.println("반올림 : "+Math.round(1.8));
		
		//random
		double num1 = Math.random(); // 0 ~ 1 사이 실수
		System.out.println("num1 : "+num1);
		
		double num2 = num1 * 10; // 0 ~ 10 사이 실수
		System.out.println("num2 : "+num2);
		
		double num3 = Math.ceil(num2); // 1 ~ 10 사이 정수
		System.out.println("num3 : "+num3);
		
		
		// 1 ~ 45 사이 정수
		double num = Math.ceil(Math.random() * 10);
		System.out.println("1 ~ 45 사이 임의의 정수 "+num);
		
		
		
	}
}
