package sub1;

/*
 * 날짜 : 2021/05/24
 * 이름 : 김철학
 * 내용 : 자바 클래스 실습하기
 */
public class ClassTest {
	public static void main(String[] args) {
		
		// 참조변수kb, 객체생성new, 초기화Account(), 대입new 에서 = kb  
		Account kb = new Account("국민은행", "123-1213-1234", "김유신", 10000);
		Account wr = new Account("우리은행", "121-1010-1021", "김춘추", 30000);
	
		// 객체 멤버 초기화
		//kb.bank = "국민은행";
		//kb.id = "123-1213-1234";
		//kb.name = "김유신";
		//kb.money = 10000;
		
		//wr.bank = "우리은행";
		//wr.id = "121-1010-1021";
		//wr.name = "김춘추";
		//wr.money = 30000;
		
		// 객체 활용
		kb.deposit(40000);
		kb.withdraw(5000);
		//캡슐화 적용으로 취약코드 예방
		//kb.money++; // 취약코드(위험한 코드) 클래스에 직접참조하면 위험함
		kb.show();
		
		wr.deposit(30000);
		wr.withdraw(7000);
		//캡슐화 적용으로 취약코드 예방
		//wr.money -= 1; // 취약코드(위험한 코드) 클래스에 직접참조하면 위험함
		wr.show();
	}
}
