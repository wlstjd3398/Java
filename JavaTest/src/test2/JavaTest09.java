package test2;
/*
 * 날짜 : 2021/05/20
 * 이름 : 김철학
 * 내용 : 자바 자료구조 스택(stack) 연습문제
 */
public class JavaTest09 {
	static int STACK_SIZE = 10;
	//stack_size는 0개짜리 공간을 나타낸것
	static int stack[] = new int[STACK_SIZE];
	static int top = 0;
	
	public static void main(String[] args) {
		
		push(100);
		push(200);
		push(300);
		
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());	
	}
	
	public static void push(int data) {
		if(top == STACK_SIZE) {
			System.out.println("더이상 데이터를 저장 할 수 없습니다.");
		}
		stack[top++]=data;
	}
	
	public static int pop() {
		if(top == 0) {
			System.out.println("데이터가 없습니다.");
			return 0;
		}
		return stack[--top];
		//[top--]; 왜 그런지 리뷰해보기
	}
}
