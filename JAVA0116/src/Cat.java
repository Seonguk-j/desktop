
public class Cat extends Animal {
	
	@Override		//부모의 추상 메소드를 오버라이딩을 통해 자식 클래스에서 구체적으로 구현
	public void sound() {
		System.out.println("야옹");
	}

}
