package package2;

import package1.A;

public class C {
	
	A a = new A();		//a에 proteccted : 다른 패키지라서 접근이 불가능
	a.field = "value";
	a.method();

}
