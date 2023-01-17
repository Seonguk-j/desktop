class A {
}
class B extends A {
}
class C extends A {
}
class D extends B {
}
class E extends C {
}

public class PromotionExample {

	public static void main(String[] args) {
		//자동 타입 변환 : 상속 관계에서만 발생
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;		//자동 타입 변환(상속 관계)
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
//		B b3 = e;		//에러 : (상속 관계가 아니라서)
//		C c2 = d;
		
	}

}
