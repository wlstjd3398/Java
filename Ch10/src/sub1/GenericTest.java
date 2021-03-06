package sub1;
/*
 *  날짜 : 2021/05/26
 *  이름 : 김철학
 *  내용 : 자바 Generic 클래스 실습하기
 */
public class GenericTest {
	public static void main(String[] args) {
		
		Apple apple = new Apple("한국", 2000);
		Banana banana = new Banana("대만", 3000);
		
		FruitBox<Apple> box1 = new FruitBox();
		box1.setFruit(apple);
		
		FruitBox<Banana> box2 = new FruitBox();
		box2.setFruit(banana);
		
		// apple 되는데 banana 안되서 FruitBox를 generic 클래스 설정함
		
		
		box1.getFruit().toString();
		box2.getFruit().toString();
		
	
	}
}
