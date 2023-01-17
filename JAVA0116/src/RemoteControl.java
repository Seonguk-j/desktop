//인터페이스에서는 상수와 추상메소드만 사용 가능

public interface RemoteControl {
	
	//추상 메소드
	void turnOn();
	void turnOff();
	
	/*
	//상수 선언
	int MAX_VOLUME = 10;	//static final 생략하더라도 상수로 취급
	int MIN_VOLUME = 0;
	
	//public 추상 메소드
	public void turnOn();	//abstract 생략하더라도 추상메소드로 동작
	public void turnOff();
	void setVolume(int volume);
	
	//디폴트 인스턴스 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
			setVolume(MIN_VOLUME);
		}
		else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	static void changeBattery() {
		System.out.println("리모컨 건전지를 교환합니다.");
	}
	*/

}