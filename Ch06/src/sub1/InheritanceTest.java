package sub1;
/*
 * ��¥ : 2021/05/24
 * �̸� : ��ö��
 * ���� : �ڹ� Ŭ���� ��� �ǽ��ϱ�
 */

public class InheritanceTest {
	public static void main(String[] args) {
		
		StockAccount kb = new StockAccount("KB����", "121-101-2010", "ȫ�浿", 100000, "�Ｚ����", 10, 80000);
		
		kb.sell(5,  79000);
		kb.buy(10, 81000);
		kb.show();
		
	}
}
