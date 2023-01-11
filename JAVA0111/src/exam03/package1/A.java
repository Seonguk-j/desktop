package exam03.package1;

public class A {
	//public : 모든 패키지 사용 가능
	public int field1;	
	
	//default : 같은 패키지 사용 가능
	int field2;
	
	//private : 클래스 내부에서 사용 가능
	private int field3;
	
	//생성자 선언
	public A() {
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();
	}
	
	//public : 모든 패키지 사용 가능
	public void method1() {
	}

	//default : 같은 패키지 사용 가능
	void method2() {
	}
	
	//private : 클래스 내부에서 사용 가능
	private void method3() {
	}
}
