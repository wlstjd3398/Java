package sub1;
/*
 * ��¥ : 2021/05/20
 * �̸� : ��ö��
 * ���� : �ڹ� �޼���(�Լ�) Ÿ�� �ǽ��ϱ�
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
		System.out.println("type3() ���ϰ� : "+result);
		
		type4();
		
		
	}//main end
	
	//type1 : �Ű����� o, ���ϰ� : o
	public static double type1(double x) {
	double y = x + 3.14;
	return y;
	}
	
	//type2 : �Ű����� o, ���ϰ� : x
	public static void type2(boolean status) {
		if(status) {
			System.out.println("�� �Դϴ�.");
		}else {
			System.out.println("���� �Դϴ�.");
		}
	}
	
	//type3 : �Ű����� x, ���ϰ� : o
	public static boolean type3() {
	
		int num1 = 1, num2 = 2;
		
		if(num1 > num2) {
			return true;
		}else {
			return false;
		}
	}
	
	//type4 : �Ű����� x, ���ϰ� : x (�� �Ⱦ�)
	public static void type4() {
		System.out.println("type4() ��� : "+type1(0.1));
	}
	
}
