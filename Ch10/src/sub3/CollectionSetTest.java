package sub3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 *  날짜 : 2021/05/26
 *  이름 : 김철학
 *  내용 : 자바 Collection 집합 실습하기
 */
public class CollectionSetTest {
	public static void main(String[] args) {
		
		// Set 생성
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(3); // 중복허용안되서 거부
		set.add(5);
		
		// Set 원소 갯수 -> 배열에서는 size, list에서는 length
		System.out.println("set 원소 갯수 : "+set.size());
		
		// Set 원소 출력 -> Iterator 손을 집어넣어서 아무거나 손에 집히는거 꺼낸다
		Iterator<Integer> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next()+", ");
		}
		
		
	}
}
