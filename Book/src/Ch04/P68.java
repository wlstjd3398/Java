package Ch04;

public class P68 {
	public static void main(String[] args) {
		//<< ����
		System.out.println(3 << 2);
		System.out.println("3�� ������ : "+Integer.toBinaryString(3));
		System.out.println("12�� ������ : "+Integer.toBinaryString(12));
		
		//>> ����
		System.out.println(8 >> 2);
		System.out.println("8�� ������ : "+Integer.toBinaryString(8));
		System.out.println("2�� ������ : "+Integer.toBinaryString(2));
		
		//>>> ����
		System.out.println(-8 >>> 3);
		System.out.println("-8�� ������ : "+Integer.toBinaryString(-8));
		System.out.println("-8 >>> 3 : "+Integer.toBinaryString(-8 >>> 3));
	}
}
