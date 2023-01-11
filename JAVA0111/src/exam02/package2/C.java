package exam02.package2;

import exam02.package1.A;

public class C {
	//불린 public
	//정수 default
	//문자열 private
	
	A a1 = new A(true);		//public 접근 가능 : 모든 패키지에서 접근
//	A a2 = new A(1);		//default 접근 가능 : 다른 패키지라서 접근 불가능
//	A a3 = new A("문자열");	//private 접근 불가능 : 다른 패키지면서 다른 클래스라서 접근 불가능
}
