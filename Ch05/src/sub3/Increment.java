package sub3;
/*
 * ��¥ : 2021/05/24
 * �̸� : ��ö��
 * ���� : �ڹ� ����(Ŭ����) ����, ����(Ŭ����) �޼��� �ǽ��ϱ�
 */
public class Increment {

	public int num1;
	public static int num2;
	
	//Overload �޼��� �̸����� �Ű�����
	public Increment(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public Increment() {
		num1++;
		num2++;
		
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
	}
	
	public static void add() {
		//�����޼��忡���� none static ������ �����Ҽ� ����.
		num2++;
	}
	
	
}
