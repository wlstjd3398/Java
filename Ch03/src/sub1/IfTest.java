package sub1;

import java.util.Scanner;

/*
 * ��¥ : 2021/05/18
 * �̸� :��ö��
 * ���� : �ڹ� if ���ǹ� �ǽ��ϱ�
 */
public class IfTest {
	public static void main(String[] args) {
		
		//if
		int num1 = 1;
		int num2 = 2;
		
		if (num1 > 0) {
			
			if (num2 > 1 ) {
				System.out.println("num1�� 0���� ũ�� num2�� 1���� ũ��.");
			}
		}
			// ���Ʒ� ���� ����
		if (num1 > 0&& num2 > 1) {
			System.out.println("num1�� 0���� ũ�� num2�� 1���� ũ��.");
		}
		
		
		//if ~ else
		int var1 = 1;
		int var2 = 2;
		
		if(var1 > var2) {
			//������ ��
		System.out.println("var1�� var2���� ũ��.");
		}else {
			//������ ����
		System.out.println("var1�� var2���� �۴�.");	
		}
		
		
		//if ~ else if ~ else
		int n4 = 4;
		int n3 = 3;
		int n2 = 2;
		int n1 = 1;
		if(n1 > n2) {
			System.out.println("n1�� n2���� ũ��.");
		}else if(n2 > n3) {
			System.out.println("n2�� n3���� ũ��.");
		}else if(n3 > n4) {
			System.out.println("n3�� n4���� ũ��.");
		}else {
			System.out.println("n4�� ���� ũ��.");
		}
		
		
		//��������
		Scanner sc = new Scanner(System.in);
			//scanner�� scanġ�� ctrl+spacebar�ϸ�  ���� import ����������
		System.out.print("���� �Է� : ");
			//ln�� ������ �ٹٲ� ����
		int score = sc.nextInt();
		
		System.out.println("�Է� ���� : "+score);
		
		
		
		
		if (score >= 90) {
			//90 ~ 100
			System.out.println("A�Դϴ�.");
		}else if (score >= 80 && score < 89) {
			//80 ~ 89
			System.out.println("B�Դϴ�.");
		}else if (score >= 70 && score < 79) {
			//70 ~ 79
			System.out.println("C�Դϴ�.");
		}else if (score >= 60 && score < 69) {
			//60 ~ 69
			System.out.println("D�Դϴ�.");
		}else {
			//0 ~ 59
			System.out.println("F�Դϴ�.");
		}
		
		
		
	}
}
