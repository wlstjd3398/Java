package sub2;
/*
 * ��¥ : 2021/05/17
 * �̸� : ��ö��
 * ���� : �ڹ� ������ �ڷ��� �ǽ��ϱ�
 */
public class DataTypeTest {
	public static void main(String[] args) {
	
		//���ٺ���� ctrl+alt+����Ű ������
		//���ٻ����� ctrl+d
		
		
		//������(ũ�����̷�)
			//byte�� 127���� ���尡��, 8bit=1byte ����
			//short�� 32767���� ���尡��, 2byte ����
			//int�� 214748347���� ���尡��, 4byte ����
			//long�� ��û���� ��ͱ��� ���尡��, ���� ���̻� L��, 8byte ����
		byte num1 = 127;
		short num2 = 32767;
		int num3 = 214748347;
		long num4 = 1000L;
		
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
		System.out.println("num3 : "+num3);
		System.out.println("num4 : "+num4);
		
		//�Ǽ���
		float var1 = 1.123456789f; //�Ҽ��� 7�ڸ�����
		double var2 = 1.1234567890123456789; //�Ҽ��� 16�ڸ����� ����
		
		System.out.println("var1 : "+var1);
		System.out.println("var2 : "+var2);
		
		//����
		boolean value1 = true;
		boolean value2 = false;
		
		System.out.println("value1 : "+value1);
		System.out.println("value2 : "+value2);
		
		//������
		char ch1 = 'A'; //�������� ''��
		char ch2 = '��'; //'����' �ȵ� -> ���ڿ���
		
		System.out.println("ch1 :"+ch1);
		System.out.println("ch2 :"+ch2);
		
		//���ڿ�
		String str1 = "Apple"; //���ڿ��� ""��
		String str2 = "����";
		String str3 = "A";
		String str4 = "��";
		
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		System.out.println("str3 : "+str3);
		System.out.println("str4 : "+str4);
	}
}
