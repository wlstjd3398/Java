package test3;

/*
 * ��¥ : 0000/00/00
 * �̸� : ȫ�浿
 * ���� : �ڹ� Ŭ���� ��������
 */

public class JavaTest01 {
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		JavaTest01 obj = new JavaTest01();		
		obj.setName("ȫ�浿");
		
		System.out.println(obj.getName());		
	}	
}