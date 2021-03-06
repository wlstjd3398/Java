package sub4;

import java.util.HashMap;
import java.util.Map;

/*
 *  날짜 : 2021/05/26
 *  이름 : 김철학
 *  내용 : 자바 Collection 집합 실습하기
 */
public class MapTest {
	public static void main(String[] args) {
		// Map 생성 <key, value>
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(101, "김유신");
		map1.put(102, "김춘추");
		map1.put(103, "장보고");
		map1.put(104, "강감찬");
		map1.put(105, "이순신");
		
		// Map 데이터 갯수
		System.out.println("map1 데이터 갯수 : "+map1.size());
		
		// Map 데이터 출력
		System.out.println("map1 101번 데이터 :"+map1.get(101));
		System.out.println("map1 103번 데이터 :"+map1.get(103));
		System.out.println("map1 105번 데이터 :"+map1.get(105));
		
		
	}
}
