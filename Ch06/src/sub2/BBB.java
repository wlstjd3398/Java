package sub2;

// final Ŭ������ ��ӹ����� ���� Ŭ����
public class BBB extends AAA {
	
	@Override
	// final�� ���� Override�� �ȵ�
	public final void method1(){
		System.out.println("BBB - method1...");
	}
	// Overload
	public void method2(int a){
		System.out.println("BBB - method2...");
	}
	// Overload
	public void method3(){
		System.out.println("BBB - method3...");
	}
}
