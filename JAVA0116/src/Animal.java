
public abstract class Animal {	//abstract 키워드 붙혀서 추상클래스
	
	public void breathe() {		//일반 메소드
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();	//추상 메소드 선언 : 사운드라는 기능을 자식에서 반드시 구현

}
