package sub2;
/*
 * ��¥ : 2021/05/18
 * �̸� : ��ö��
 * ���� : �ڹ� While �ݺ��� �ǽ��ϱ�
 */
public class WhileTest {
	public static void main(String[] args) {
		
		//1���� 10���� ��
		int k = 1;
		int sum = 0;
		
		while(k <= 10) {
			sum += k;
			k++;
		}
		System.out.println("1���� 10���� �� : "+sum);
		
		//do ~ while
		int esum= 0;
		int i = 1;
		
		do {
			//���� 1���� �����ϴ� �ݺ���
			if(i % 2 == 0) {
			esum += i;
			}
			i++;
		}
		while(i <= 10);
		System.out.println("1���� 10���� ¦���� : "+esum);
		
		// break
		int num = 1;
		while(true) {
			
			num++;
			
			if(num % 5 == 0 && num % 7 == 0) {
				break;
			}
		}
		System.out.println("5�� 7�� �ּҰ���� : "+num);
		
		
		//continue
		int total = 0;
		for (int j=1 ; j<=10 ; j++) {
			if(j % 2 == 1) {
				continue;
			}
			
			total += j;
		}
		System.out.println("1���� 10���� ¦���� : "+total);
		
		
	}
}
