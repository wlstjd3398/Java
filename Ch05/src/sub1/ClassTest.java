package sub1;

/*
 * ��¥ : 2021/05/24
 * �̸� : ��ö��
 * ���� : �ڹ� Ŭ���� �ǽ��ϱ�
 */
public class ClassTest {
	public static void main(String[] args) {
		
		// ��������kb, ��ü����new, �ʱ�ȭAccount(), ����new ���� = kb  
		Account kb = new Account("��������", "123-1213-1234", "������", 10000);
		Account wr = new Account("�츮����", "121-1010-1021", "������", 30000);
	
		// ��ü ��� �ʱ�ȭ
		//kb.bank = "��������";
		//kb.id = "123-1213-1234";
		//kb.name = "������";
		//kb.money = 10000;
		
		//wr.bank = "�츮����";
		//wr.id = "121-1010-1021";
		//wr.name = "������";
		//wr.money = 30000;
		
		// ��ü Ȱ��
		kb.deposit(40000);
		kb.withdraw(5000);
		//ĸ��ȭ �������� ����ڵ� ����
		//kb.money++; // ����ڵ�(������ �ڵ�) Ŭ������ ���������ϸ� ������
		kb.show();
		
		wr.deposit(30000);
		wr.withdraw(7000);
		//ĸ��ȭ �������� ����ڵ� ����
		//wr.money -= 1; // ����ڵ�(������ �ڵ�) Ŭ������ ���������ϸ� ������
		wr.show();
	}
}
