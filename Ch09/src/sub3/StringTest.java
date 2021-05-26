package sub3;

/*
 *  날짜 : 2021/05/26
 *  이름 : 김철학
 *  내용 : String 클래스 실습하기
 */
public class StringTest {
	public static void main(String[] args) {
		
		// 문자열 = 문자 + 배열
		String str = "Hello";
		char[] arr = {'H', 'e', 'l', 'l', 'o'};
		
		// 문자열 객체(정석)
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		String str3 = "Hello"; // literal 문자열
		String str4 = "Hello";
		
		// 문자열 비교(str1, str2에는 주소값이 저장되어있어서 다름, stack에  참조변수str1 str2를 비교하는 것 )
		// 	문자열은 비교연산자로 동등비교 할 일이 없다
		if(str1 == str2) {
			System.out.println("str1과 str2의 참조값이 서로 같다");
		}else {
			System.out.println("str1과 str2의 참조값이 서로 다르다");
		}
		
		// str3, str4는 hello의 주소값 자체가 같음
		if(str3 == str4) {
			System.out.println("str3과 str4의 참조값이 서로 같다");
		}else {
			System.out.println("str3과 str4의 참조값이 서로 다르다");
		}
		
		// 문자열 비교할때 쓰는 것
		if(str1.equals(str4)) {
			System.out.println("str1과 str4의 참조값이 서로 같다");
		}else {
			System.out.println("str1과 str4의 참조값이 서로 다르다");
		}
		
		
	}
}
