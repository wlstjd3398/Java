package test3;

import java.util.Scanner;


/*
 * ��¥ : 2021/05/20
 * �̸� : ��ö��
 * ���� : �ڹ� �⺻ ����� ��������
 */

public class JavaTest02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input;
		System.out.println("input �� �Է� : ");
		
		input = sc.nextInt();
		int result =(1+2) * input;
		
		System.out.println("(1 + 2) x input = "+result);
		
		String name;
		System.out.println("name �� �Է� : ");
		
		name = sc.next();
		String hello = "�ȳ�! "+name+"�� �ݰ����ϴ�.";
		System.out.println(hello);
	}
}
