package java1213;

class Check {
	//instanceVariable : iv		<- 인스턴스 변수
	//classVariable : cv		<- 클래스 변수
	//instanceMethod : im		<- 인스턴스 메서드
	//classMethod :cm			<- 클래스 메서드
	
	//클래스 멤버는 선언만 하더라도 메모리에 올라감
	//인스턴스 멤버는 new 인스턴스를 해야 메모리에 올라감
	
	static int cv = 5;		//클래스 변수
	int iv = 4;				//인스턴스 변수
	
	static void cm() {		//클래스 메서드
		
	}
	void im() {				//인스턴스 메서드
		
	}
	
	static void cm_Imember() {		//클래스 메서드가 인스턴스 멤버에 접근
		//System.out.println(iv);	//인스턴스 변수에 접근 X
		//im();						//인스턴스 메서드에 접근 X
	}
	
	void im_Cmember() {				//인스턴스 멤버가 클래스 멤버에 접근
		System.out.println(cv);		//클래스 변수에 접근 O
		cm();						//클래스 메서드에 접근 O
	}
	
	static void cm_Cmember() {		//클래스 멤버가 클래스 멤버에 접근
		System.out.println(cv);		//클래스 변수에 접근 O
		cm();						//클래스 메서드에 접근 O
	}
	
	void im_Imember() {				//인스턴스 멤버가 인스턴스 멤버에 접근
		System.out.println(iv);		//인스턴스 변수에 접근 O
		im();						//인스턴스 메서드에 접근 O
	}
}

public class class_instance {

	public static void main(String[] args) {
		//클래스 멤버와 인스턴스 멤버간의 참조 및 호출
		//인스턴스 멤버의 클래스 멤버 사용 -> 가능
		//클래스 멤버의 인스턴스 멤버 사용 -> 불가능
		//인스턴스 멤버의 인스턴스 멤버 사용 -> 가능
		//클래스 멤버의 클래스 멤버 사용 -> 가능
		
		Check.cm_Imember();	//실행불가	//클래스 멤버가 인스턴스 멤버에 접근
		Check.cm_Cmember();			//클래스 멤버가 클래스 멤버에 접근
		
		Check myinstance = new Check();
		myinstance.im_Cmember();	//인스턴스 멤버가 클래스 멤버에 접근
		myinstance.im_Imember();	//인스턴스 멤버가 인스턴스 멤버에 접근
	}

}
