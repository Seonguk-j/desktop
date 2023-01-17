class Car {
	//필드(속성, 객체 변수)
	boolean powerOn;	//false
	String color;		//null
	int wheel;			//0
	int speed;			//0
	boolean wiperOn;	//false
	
	//메소드(함수, 기능, 펑션)	이름()
	void power() {powerOn = !powerOn;}
	void speedUp() {speed++;}
	void speedDown() {speed--;}
	void wiper() {wiperOn = !wiperOn;}
}
