package sub1;
/*
 * ��¥ : 2021/05/20
 * �̸� : ��ö��
 * ���� : �ڹ� �޼���(�Լ�) ������ �ǽ��ϱ�
 */
public class MethodScopeTest {
	//�������� : �޼��� �ܺο� ������ ����, 
	static int result = 0;
	
	public static void main(String[] args) {
		
		//�������� : �޼��� ���ο� ������ ����, �޼��尡 ����Ǹ� �޸𸮿��� ������
		
		int start = 1;
		int end = 10;
		
		return sum(start, end);
		System.out.println("result : "+result);
		
	}//main end
	
	public static int sum(int s, int e) {
		//�Ű����� s, e�� �������� / �������� sum 
		int sum = 0;
		
		for(int k=s; k<=e; k++) {
			sum += k;
		}
		return sum;
	}
	
	
	
}
