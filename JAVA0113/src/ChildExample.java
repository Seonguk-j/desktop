
public class ChildExample {

	public static void main(String[] args) {
		
		//자동 타입 변화
		Parent parent = new Child();
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
//		parent.field2 = "data2";	부모 타입으로 변환 : f2, m3()이 없기 때문에 에러발생
//		parent.method3();
		
		//강제 타입 변환
		Child child = (Child) parent;	//부모 타입에 f2, m3()가 붙혀서 타입 변환
		
		child.field2 = "data2";
		child.method3();
	
	}

}
