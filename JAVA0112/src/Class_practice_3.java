
class Cars {
	static int wheel = 4;	//클래스 변수, 정적멤버		<- 객체 선언 없이도 바로 사용 가능
	int speed;				//인스턴스 변수, 인스턴스 멤버	<- 객체가 선언이 되어야지만 사용 가능
}

public class Class_practice_3 {

	public static void main(String[] args) {
		System.out.println(Cars.wheel);		//객체 선언 없이 사용 가능. 클래스 변수(정적멤버) 접근 가능
//		System.out.println(Cars.speed);		//에러 발생
		
		Cars myCar1 = new Cars();			//객체 생성
		
		System.out.println(Cars.wheel);
		System.out.println(myCar1.speed);	//인스턴스 멤버에 접근 가능
		
		Cars myCar2 = new Cars();
		
		System.out.println("<변경 전>");
		System.out.println("myCar1.speed : " + myCar1.speed);
		System.out.println("myCar2.speed : " + myCar2.speed);
		System.out.println("myCar1.wheel : " + myCar1.wheel);
		System.out.println("myCar2.wheel : " + myCar2.wheel);
		
		myCar2.speed = 100;		//인스턴스 변수
		myCar2.wheel = 5;		//정적(클래스) 변수
		
		System.out.println("<변경 후>");
		System.out.println("myCar1.speed : " + myCar1.speed);
		System.out.println("myCar2.speed : " + myCar2.speed);
		System.out.println("myCar1.wheel : " + myCar1.wheel);
		System.out.println("myCar2.wheel : " + myCar2.wheel);
	}

}
