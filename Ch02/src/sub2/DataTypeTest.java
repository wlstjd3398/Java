package sub2;
/*
 * 날짜 : 2021/05/17
 * 이름 : 김철학
 * 내용 : 자바 변수의 자료형 실습하기
 */
public class DataTypeTest {
	public static void main(String[] args) {
	
		//한줄복사는 ctrl+alt+방향키 밑으로
		//한줄삭제는 ctrl+d
		
		
		//정수형(크기차이로)
			//byte는 127까지 저장가능, 8bit=1byte 가능
			//short는 32767까지 저장가능, 2byte 가능
			//int는 214748347까지 저장가능, 4byte 가능
			//long는 엄청나게 긴것까지 저장가능, 끝에 접미사 L씀, 8byte 가능
		byte num1 = 127;
		short num2 = 32767;
		int num3 = 214748347;
		long num4 = 1000L;
		
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
		System.out.println("num3 : "+num3);
		System.out.println("num4 : "+num4);
		
		//실수형
		float var1 = 1.123456789f; //소수점 7자리까지
		double var2 = 1.1234567890123456789; //소수점 16자리까지 저장
		
		System.out.println("var1 : "+var1);
		System.out.println("var2 : "+var2);
		
		//논리형
		boolean value1 = true;
		boolean value2 = false;
		
		System.out.println("value1 : "+value1);
		System.out.println("value2 : "+value2);
		
		//문자형
		char ch1 = 'A'; //문자형은 ''씀
		char ch2 = '가'; //'가위' 안됨 -> 문자열임
		
		System.out.println("ch1 :"+ch1);
		System.out.println("ch2 :"+ch2);
		
		//문자열
		String str1 = "Apple"; //문자열은 ""씀
		String str2 = "가위";
		String str3 = "A";
		String str4 = "가";
		
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		System.out.println("str3 : "+str3);
		System.out.println("str4 : "+str4);
	}
}
