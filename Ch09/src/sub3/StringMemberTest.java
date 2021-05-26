package sub3;

/*
 *  ��¥ : 2021/05/26
 *  �̸� : ��ö��
 *  ���� : String ��� �ǽ��ϱ�
 */
public class StringMemberTest {

	public static void main(String[] args) {
		
		// ��ü str�� ���� ����� �ִ� �޼��尡 �ִ�, ���������ϴ°ɷ� ���� �ƴ�
		String str = "Hello Korea";
		
		
		// length - ���ڰ���
		System.out.println("str ���ڿ� ���� : "+str.length());
		
		// charAt - ���ڿ����� Ư������ ����
		System.out.println("str 1��° ���� : "+str.charAt(0));
		System.out.println("str 7��° ���� : "+str.charAt(6));
		
		// substring - ���ڿ� �ڸ���
		System.out.println("str���� 0 ~ 5���� ���ڿ� : "+str.substring(0, 5));
		System.out.println("str���� 6 ~ ���������� ���ڿ� : "+str.substring(6));
		
		// indexOf, lastIndexOf - ���ڿ����� Ư������ �ε���(0���� �����ϴ� ������ȣ, ÷�ڹ�ȣ) ����
		System.out.println("str���� �տ��� ���� ���� e �ε��� : "+str.indexOf("e"));
		System.out.println("str���� �տ��� ���� ���� e �ε��� : "+str.lastIndexOf("e"));
		
		// replace - ���ڿ� ��ü
		System.out.println("str ���ڿ����� 'Korea'�� 'Busan'���� ��ü : "+str.replace("Korea", "Busan"));
		System.out.println("str ���ڿ����� 'Hello'�� 'Welcome'���� ��ü : "+str.replace("Hello", "Welcome"));
		
		// valueOf - �⺻Ÿ��(int, double, boolean, char..-> stack�� ����Ǵ� �ֵ�) ������ ���ڿ��� ��ȯ
		int var1 = 1;
		double var2 = 2.13;
		boolean var3 = true;
		
			// Casting ����ƴ�, s3 ����� ���� ����
		String s1 = String.valueOf(var1);
		String s2 = String.valueOf(var2);
		String s3 = ""+var3;
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
		

	}
}
