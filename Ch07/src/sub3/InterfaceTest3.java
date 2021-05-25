package sub3;

public class InterfaceTest3 {
	public static void main(String[] args) {
		// 인터페이스 - 객체간 결합도 완화
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		
		socket.switchOn();
		socket.switchOff();
		
		
	}
}
