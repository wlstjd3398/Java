package sub5;

public class AbstractTest {
	
	public static void main(String[] args) {
		
		// Unit unit = new Unit();
		
		// 다형성 적용으로 Marin, Zealot, Zergling -> Unit
		Unit marin = new Marin();
		Unit zealot = new Zealot();
		Unit zergling = new Zergling();
		
		marin.move();
		zealot.move();
		zergling.move();
		
		marin.attack();
		zealot.attack();
		zergling.attack();
		
		
	}
}
