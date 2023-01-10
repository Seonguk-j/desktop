package java1213;

class Car1 {
	//속성
	boolean powerOn;	//시동
	String color;		//차량의 색상
	int wheel;			//바퀴의 수
	int speed;			//속력
	boolean wiperOn;	//와이퍼
	
	void power() {powerOn = !powerOn;}	//시동 메서드
	void speedUp() {speed++;}			//엑셀 메서드
	void speedDown() {speed--;}			//브레이크 메서드
	void wiper() {wiperOn = !wiperOn;}	//와이퍼 메서드
}

public class class_Car {

	public static void main(String[] args) {
		Car myCar = new Car();	//인스턴스 생성
		
		System.out.println("시동 처음 초기화 : " + myCar.powerOn);
		System.out.println("차의 색상 초기화 : " + myCar.color);
		System.out.println("바퀴 수 초기화 : " + myCar.wheel);
		System.out.println("속력 초기화 : " + myCar.speed);
		System.out.println("와이퍼 초기화 : " + myCar.wiperOn);
		
		System.out.println();
		
		//메서드(기능) 실행
		myCar.power();		//시동 메서드 실행
		System.out.println("시동 메서드 동작 : " + myCar.powerOn);
		myCar.power();		//시동 메서드 실행
		System.out.println("시동 메서드 다시 동작 : " + myCar.powerOn);
		
		myCar.color = "black";		//색상 변수에 black 대입
		System.out.println("현재 차의 색상 : " + myCar.color);
		
	}

}
