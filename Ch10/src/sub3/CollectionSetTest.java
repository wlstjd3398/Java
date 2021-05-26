package sub3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 *  ��¥ : 2021/05/26
 *  �̸� : ��ö��
 *  ���� : �ڹ� Collection ���� �ǽ��ϱ�
 */
public class CollectionSetTest {
	public static void main(String[] args) {
		
		// Set ����
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(3); // �ߺ����ȵǼ� �ź�
		set.add(5);
		
		// Set ���� ���� -> �迭������ size, list������ length
		System.out.println("set ���� ���� : "+set.size());
		
		// Set ���� ��� -> Iterator ���� ����־ �ƹ��ų� �տ� �����°� ������
		Iterator<Integer> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next()+", ");
		}
		
		
	}
}
