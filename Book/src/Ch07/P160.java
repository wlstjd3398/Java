package Ch07;

public class P160 {
	public static void main(String[] args) {
	MethodEx me = new MethodEx();
	
	me.one(); // �޼��� ����
	}
}

class MethodEx {
	void one() { // 1.
		two();
		System.out.println("one");
	}
	void two() { // 2.
		three();
		System.out.println("two");
	}
	void three() { // 3.
		System.out.println("three");
	}
}
