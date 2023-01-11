package exam03.package1;

public class B {
	public void method() {
		A a = new A();
		
		a.field1 = 1;	//public 모든 패키지에서 접근 가능
		a.field2 = 1;	//default 같은 패키지에서 접근 가능
//		a.field3 = 1;	//private 같은 클래스가 아니라서 접근 불가능
		
		a.method1();	//public 모든 패키지에서 접근 가능
		a.method2();	//default 같은 패키지에서 접근 가능
//		a.method3();	//private 같은 클래스가 아니라서 접근 불가능
	}
}
