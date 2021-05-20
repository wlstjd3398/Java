package sub1;
/*
 * 날짜 : 2021/05/20
 * 이름 : 김철학
 * 내용 : 자바 메서드(함수) 타입 실습하기
 */
public class MethodTypeTest {
	
	
	public static void main(String[] args) {
		
		double r1 = type1(1.0);
		double r2 = type1(1.0);
		double r3 = type1(1.0);
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		
		type2(true);
		type2(false);
		
		boolean result = type3();
		System.out.println("type3() 리턴값 : "+result);
		
		type4();
		
		
	}//main end
	
	//type1 : 매개변수 o, 리턴값 : o
	public static double type1(double x) {
	double y = x + 3.14;
	return y;
	}
	
	//type2 : 매개변수 o, 리턴값 : x
	public static void type2(boolean status) {
		if(status) {
			System.out.println("참 입니다.");
		}else {
			System.out.println("거짓 입니다.");
		}
	}
	
	//type3 : 매개변수 x, 리턴값 : o
	public static boolean type3() {
	
		int num1 = 1, num2 = 2;
		
		if(num1 > num2) {
			return true;
		}else {
			return false;
		}
	}
	
	//type4 : 매개변수 x, 리턴값 : x (잘 안씀)
	public static void type4() {
		System.out.println("type4() 결과 : "+type1(0.1));
	}
	
}
