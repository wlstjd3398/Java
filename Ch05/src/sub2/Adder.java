package sub2;
/*
 * 날짜 : 2021/05/24
 * 이름 : 김철학
 * 내용 : 자바 객체 메모리 생성 실습하기
 */
public class Adder {
	
	private int x;
	
	public Adder(int x) {
		this.x = x;
		
	}
	
	
	// get, set 외부참조
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	
	// Overload 메서드(이름같음)
	public void add(int x) {
		this.x = x + 50;
	}
	public void add(int[] arr2) {
		arr2[0]++;
	}
	public void add(Adder a1) {
		a1.x = a1.x + 40;
	}
	public Adder addNew(Adder a2) {
		a2 = new Adder(1);
		return a2;
	}
	
}
