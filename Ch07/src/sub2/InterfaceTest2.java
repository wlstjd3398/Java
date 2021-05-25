package sub2;

public class InterfaceTest2 {
	public static void main(String[] args) {
		// 인터페이스 - 다중상속 효과
		SmartTv stv = new SmartTv();
		
		stv.powerOn();
		stv.booting();
		stv.internet();
		stv.powerOff();
		
		
	}
}
