package sub3;
/*
 * ��¥ : 2021/05/18
 * �̸� : ��ö��
 * ���� : �ڹ� �迭 �ǽ��ϱ�
 */
public class ArrayTest {
	public static void main(String[] args) {
		
		//�迭 [�迭����] {������ �ε�����}  
		// -> ���̽� Ʃ��(��������Ʈ)�� ���, ����Ʈ(��������Ʈ) �κ��� arraylist�� ��������
		int[] nums = {1, 2, 3, 4, 5};
		
		
		//�迭 ����
		System.out.println("�迭 nums�� ������ ���� : "+nums.length);
		
		
		//�迭 ���� ���
		System.out.println("�迭 nums�� 1��° ���� : "+nums[0]);
		System.out.println("�迭 nums�� 2��° ���� : "+nums[1]);
		System.out.println("�迭 nums�� 3��° ���� : "+nums[2]);
		
		
		//�迭 �ݺ���
		for(int num : nums) {
			System.out.println("�迭 nums�� ���� : "+num);
		}
		
		
		//���ڿ� �迭
		String[] people = {"������", "������", "�庸��", "������", "�̼���"};
		
		for(String person : people) {
			System.out.println("people ���� : "+person);
		}
		
		
		
		
		
		
	}
}
