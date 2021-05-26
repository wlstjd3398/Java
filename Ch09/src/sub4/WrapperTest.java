package sub4;
/*
 *  ��¥ : 2021/05/26
 *  �̸� : ��ö��
 *  ���� : Wrapper �ǽ��ϱ�
 */
public class WrapperTest {

	public static void main(String[] args) {
		
		
		// �⺻Ÿ��(primitive)
		// 		�⺻Ÿ���� ��ü�� �����(���Ѵ�?)
		int var1 = 1;
		double var2 = 2.13;
		boolean var3 = true;
		char var4 = 'A';
		
		// Wrapper Ŭ������ ����(Boxing)
		//		Ŭ����Ÿ�� Integer, w1 ����
		Integer w1 = var1;
		Double w2 = var2;
		Boolean w3 = var3;
		Character w4 = var4;
		
		System.out.println("w1 : "+w1);
		System.out.println("w2 : "+w2);
		System.out.println("w3 : "+w3);
		System.out.println("w4 : "+w4);
		
		// Wrapper Ȱ�� : ���ڿ� -> �⺻Ÿ�� ��ȯ
		String str1 = "1";
		String str2 = "2.13";
		String str3 = "true";

		int val1 = Integer.parseInt(str1);
		double val2 = Double.parseDouble(str2);
		boolean val3 = Boolean.parseBoolean(str3);

		System.out.println("val1 : "+val1);
		System.out.println("val2 : "+val2);
		System.out.println("val3 : "+val3);
		
		// Wrapper Ȱ�� : ���ڿ� -> Wrapper ��ȯ
		Integer wr1 = Integer.valueOf(str1);
		Double wr2 = Double.valueOf(str2);
		Boolean wr3 = Boolean.valueOf(str3);
		
		System.out.println("wr1 : "+wr1);
		System.out.println("wr2 : "+wr2);
		System.out.println("wr3 : "+wr3);
		
		// Wrapper Ȱ�� : Wrapper -> ���ڿ� ��ȯ
		String s1 = wr1.toString();
		String s2 = wr2.toString();
		String s3 = wr3.toString();
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
	
	}
}
