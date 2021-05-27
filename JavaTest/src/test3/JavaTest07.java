package test3;
/*
 * 날짜 : 2021/05/20
 * 이름 : 김철학
 * 내용 : 자바 삼항연산자 연습문제
 */
public class JavaTest07 {
public static void main(String[] args) {
	int x = 12;
	int y = 21;
	int max = x > y ? x : y;
	//x > y true 면 x, false면 y
	
	System.out.println("x와 y 중 큰 수 :"+max);
}
}
