package sub2;
/*
 * ��¥ : 2021/05/18
 * �̸� : ��ö��
 * ���� : �ڹ� for �ݺ��� �ǽ��ϱ�
 */
public class ForTest {
	public static void main(String[] args) {
		
		//for (�ʱ��, ���ǽ�, ������)
		for(int i=1 ; i<=3 ; i++) {
			System.out.printf("%d.Hello Java! \n", i);
				//printf�� ������ ������ ��
		}
		
		
		//1���� 10���� ��
		int sum = 0;
		
		for(int k=1 ; k<=10 ; k++) {
			sum += k;
		}
		System.out.println("1���� 10������ �� : "+sum);
		
		
		//1���� 10���� ¦����
		int esum = 0;
		
		for(int k=1 ; k<=10 ; k++) {
			if(k % 2 == 0) {
				esum += k;
			}
		}
		System.out.println("1���� 10������ �� : "+esum);
		
		
		//��ø for
		for(int a=1 ; a<=3 ; a++) {
			
			System.out.println("a : "+a);
			for(int b=1 ; b<=5 ; b++) {
				System.out.println("b : "+b);
			}
		}
		
		
		//������
		for(int x=2 ; x<=9 ; x++) {
			
			for(int y=1 ; y<=9 ; y++) {
				int z = x * y;
				System.out.printf("%d x %d =%d\n", x, y, z);
			}
		}
		
		
		//���ﰢ��1
		for(int start=1; start<=10; start++) {
			
			for (int end=1 ; end <= start ; end++) {
				
				System.out.print("��");
			}
			System.out.print("\n");
		}
		
		
		//���ﰢ��2
		for(int a=1 ; a<=5 ; a++) {
			
			for(int b=1; b<=5-a; b++) {
				System.out.print("��");
			}
			for(int c=1; c<=a; c++) {
				System.out.print("��");
			}
			System.out.print("\n");
		}
		
	}
}
