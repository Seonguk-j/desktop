package package2;

import package1.A;

public class D extends A{
	public D() {
		super();
	}
	
	public void method1() {
		this.field = "value";
		this.method();
	}
	
	public void method2() {
		// 패키지가 달라서
		A a = new A();
		a.field = "value";
		a.method();
	}
}
