package exam02.package1;

public class B {
	//불린 public
	//정수 default
	//문자열 private
	
	A a1 = new A(true);		//public 접근 가능 : 모든 패키지에서 접근
	A a2 = new A(1);		//default 접근 가능 : 같은 패키지 안에서 접근
//	A a3 = new A("문자열");	//private 접근 불가능 : 같은 클래스에 없기 때문에
}
