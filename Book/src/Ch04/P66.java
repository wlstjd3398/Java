package Ch04;

public class P66 {
	public static void main(String[] args) {
		System.out.println("2:"+Integer.toBinaryString(2)); //10���� 2�� 2�����κ�ȯ
		System.out.println("3:"+Integer.toBinaryString(3)); //10���� 3�� 2�����κ�ȯ
		
		//��Ʈ ������
		System.out.println("2&3 : "+(2 &3));
		System.out.println("2|3 : "+(2 |3));
		System.out.println("2^3 : "+(2 ^3));
		System.out.println("~3 : "+~3);
	
		//ù�ڸ��� ��ȣ�� ��Ÿ���� ��Ʈ�� �����Ͽ� ��� ��Ʈ�� �ݴ�� ��ȯ
		System.out.println("-3�� �������� :"+Integer.toBinaryString(~3));
		
		//~3�� 2�������� ����
		//ù�ڸ��� ��ȣ�� ��Ÿ���� ��Ʈ ������ 31�ڸ��� �����ڷ����� �޸𸮿� ����
		
		System.out.println(Integer.toBinaryString(~3).length());
		System.out.println(Integer.MAX_VALUE); //�����ڷ����� �ִ밪 (2�� 31�� -1)
		System.out.println(Integer.parseInt("111111111111111111111100",2)
				-Integer .MAX_VALUE-1 );
	}
}
