package sub1;

public class FruitBox<T> {
	
	
	private T fruit;	// �ܺο��� ���� ���� ���ϰ���
	
	public T getFruit() {	// �ܺο��� ���ϴ� ���ο��� ���� ���
		return fruit;
	}
	
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
	
	
}
