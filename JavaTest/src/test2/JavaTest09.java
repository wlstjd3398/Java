package test2;
/*
 * ��¥ : 2021/05/20
 * �̸� : ��ö��
 * ���� : �ڹ� �ڷᱸ�� ����(stack) ��������
 */
public class JavaTest09 {
	static int STACK_SIZE = 10;
	//stack_size�� 0��¥�� ������ ��Ÿ����
	static int stack[] = new int[STACK_SIZE];
	static int top = 0;
	
	public static void main(String[] args) {
		
		push(100);
		push(200);
		push(300);
		
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());	
	}
	
	public static void push(int data) {
		if(top == STACK_SIZE) {
			System.out.println("���̻� �����͸� ���� �� �� �����ϴ�.");
		}
		stack[top++]=data;
	}
	
	public static int pop() {
		if(top == 0) {
			System.out.println("�����Ͱ� �����ϴ�.");
			return 0;
		}
		return stack[--top];
		//[top--]; �� �׷��� �����غ���
	}
}
