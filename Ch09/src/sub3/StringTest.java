package sub3;

/*
 *  ��¥ : 2021/05/26
 *  �̸� : ��ö��
 *  ���� : String Ŭ���� �ǽ��ϱ�
 */
public class StringTest {
	public static void main(String[] args) {
		
		// ���ڿ� = ���� + �迭
		String str = "Hello";
		char[] arr = {'H', 'e', 'l', 'l', 'o'};
		
		// ���ڿ� ��ü(����)
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		String str3 = "Hello"; // literal ���ڿ�
		String str4 = "Hello";
		
		// ���ڿ� ��(str1, str2���� �ּҰ��� ����Ǿ��־ �ٸ�, stack��  ��������str1 str2�� ���ϴ� �� )
		// 	���ڿ��� �񱳿����ڷ� ����� �� ���� ����
		if(str1 == str2) {
			System.out.println("str1�� str2�� �������� ���� ����");
		}else {
			System.out.println("str1�� str2�� �������� ���� �ٸ���");
		}
		
		// str3, str4�� hello�� �ּҰ� ��ü�� ����
		if(str3 == str4) {
			System.out.println("str3�� str4�� �������� ���� ����");
		}else {
			System.out.println("str3�� str4�� �������� ���� �ٸ���");
		}
		
		// ���ڿ� ���Ҷ� ���� ��
		if(str1.equals(str4)) {
			System.out.println("str1�� str4�� �������� ���� ����");
		}else {
			System.out.println("str1�� str4�� �������� ���� �ٸ���");
		}
		
		
	}
}
