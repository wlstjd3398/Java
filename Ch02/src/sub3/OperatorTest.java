package sub3;
/*
 * ��¥ : 2021/05/17
 * �̸� : ��ö��
 * ���� : �ڹ� ������ �ǽ��ϱ�
 */
public class OperatorTest {
	
	public static void main(String[] args) {
		//���������
		int num1 = 1, num2 = 2, num3 = 3, num4 = 4;
		
		int rs1 = num1 + num2;
		int rs2 = num1 - num2;
		int rs3 = num2 * num3; //�ŵ������� **
		int rs4 = num4 / num2; 
		int rs5 = num4 % num3; //������
		
		System.out.println("rs1 : "+rs1);
		System.out.println("rs2 : "+rs2);
		System.out.println("rs3 : "+rs3);
		System.out.println("rs4 : "+rs4);
		System.out.println("rs5 : "+rs5);
		
		//����, ���� ������
		int n1 = 1;
		int n2 = 2;
		
		n1++;
		++n1;
		
		n2--;
		--n2;
		
		System.out.println("n1 : "+n1);
		System.out.println("n2 : "+n2);
		
		//���մ��� ������
		int var1 = 1;
		int var2 = 2;
		int var3 = 3;
		int var4 = 4;
		
		var1 += 1;
		var2 -= 2;
		var3 *= 3;
		var4 /= 4;
		
		System.out.println("var1 : "+var1);
		System.out.println("var2 : "+var2);
		System.out.println("var3 : "+var3);
		System.out.println("var4 : "+var4);

		//�񱳿�����
		int val1 = 1;
		int val2 = 2;
		
		boolean res1 =val1 > val2;
		boolean res2 =val1 < val2;
		boolean res3 =val1 >= val2;
		boolean res4 =val1 <= val2;
		boolean res5 =val1 == val2;
		boolean res6 =val1 != val2;
		
		System.out.println("res1 : "+res1);
		System.out.println("res2 : "+res2);
		System.out.println("res3 : "+res3);
		System.out.println("res4 : "+res4);
		System.out.println("res5 : "+res5);
		System.out.println("res6 : "+res6);
		
		//��������
		boolean result1 = (val1 > 1) && (val2 < 3); //val1�� 1���� ũ�� �׸��� val2�� 3���� �۴�&& = and
		boolean result2 = (val1 > 0) && (val2 < 3); //val1�� 0���� ũ�� �׸��� val2�� 3���� �۴�
		boolean result3 = (val1 > 1) || (val2 < 3); //val1�� 1���� ũ�� �Ǵ� val2�� 3���� �۴�
		boolean result4 = (val1 > 1) || (val2 < 2); //val1�� 1���� ũ�� �Ǵ� val2�� 2���� �۴�
		boolean result5 = !(val1 > val2); //val1�� val2���� ũ�� �ʴ�
		
		System.out.println("reslut1 : "+result1);
		System.out.println("reslut2 : "+result2);
		System.out.println("reslut3 : "+result3);
		System.out.println("reslut4 : "+result4);
		System.out.println("reslut5 : "+result5);
		
	}
}
