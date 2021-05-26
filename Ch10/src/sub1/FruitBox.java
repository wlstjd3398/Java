package sub1;

public class FruitBox<T> {
	
	
	private T fruit;	// 외부에서 직접 참조 못하게함
	
	public T getFruit() {	// 외부에서 못하니 내부에서 갖다 써라
		return fruit;
	}
	
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
	
	
}
