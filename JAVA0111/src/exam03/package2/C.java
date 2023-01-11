package exam03.package2;

import exam03.package1.A;

public class C {
	public C() {
		A a = new A();
		
		a.field1 = 1;	//public 모든 패키지에서 접근 가능
//		a.field2 = 1;	//default 다른 패키지에서 있어서 접근 불가능
//		a.field3 = 1;	//private 같은 클래스가 아니라서 접근 불가능
		
		a.method1();	//public 모든 패키지에서 접근 가능
//		a.method2();	//default 다른 패키지에 있어서 접근 불가능
//		a.method3();	//private 같은 클래스가 아니라서 접근 불가능
	}
}
