
public class PromotionExample {

	public static void main(String[] args) {
		
		//구현 객체 생성
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		//인터페이스 A 변수 선언
		A a;
		
		//변수에 구현 객체 대입
		a = b;		//구현 클래스 -> 부모 인터페이스 : 자동 타입 변환
		a = c;		//구현 클래스 -> 부모 인터페이스 : 자동 타입 변환
		a = d;		//자식 클래스 -> 부모 인터페이스 : 자동 타입 변환
		a = e;		//자식 클래스 -> 부모 인터페이스 : 자동 타입 변환
		
		b = (B)a;	//구현 클래스 <- (구현 클래스)부모 인터페이스 : 강제 타입 변환
		
	}

}
