package test3;
/* 
 * 날짜 : 2021/05/27
 * 이름 : 김철학
 * 내용 : 자바 클래스 연습문제
 */
public class JavaTest01 {
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		Name obj = new Name;
		obj.setName("홍길동");
		
		System.out.println(obj.getName());
	}

}
