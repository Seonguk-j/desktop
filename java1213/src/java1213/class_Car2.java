package java1213;

class Car {
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


public class class_Car2 {
	
	public static void main(String[] args) {
		Car mycar1 = new Car();		//mycar1의 인스턴스 생성 
		Car mycar2 = new Car();		//mycar2의 인스턴스 생성
		
		mycar1.color = "red";		//mycar1의 색상 red
		mycar2.color = "black";		//mycar2의 색상 back
		
		mycar1.speedUp();			//mycar1의 엑셀 메서드 호출
		mycar2.wiper();				//mycar2의 와이퍼 메서드 호출
		
		System.out.println("mycar1의 색 : " + mycar1.color);
		System.out.println("mycar2의 색 : " + mycar2.color);
		
		System.out.println("mycar1의 속도 : " + mycar1.speed);
		System.out.println("mycar2의 속도 : " + mycar2.speed);
		
		System.out.println("mycar1의 와이퍼 작동 여부 : " + mycar1.wiperOn);
		System.out.println("mycar2의 와이퍼 작동 여부 : " + mycar2.wiperOn);
	}
}
