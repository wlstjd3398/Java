package sub2;

// final 클래스로 상속받을수 없는 클래스
public class BBB extends AAA {
	
	@Override
	// final을 쓰면 Override가 안됨
	public final void method1(){
		System.out.println("BBB - method1...");
	}
	// Overload
	public void method2(int a){
		System.out.println("BBB - method2...");
	}
	// Overload
	public void method3(){
		System.out.println("BBB - method3...");
	}
}
