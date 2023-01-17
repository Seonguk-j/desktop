
public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("iPhone", "silver");
		
		System.out.println("모델 : " + myPhone.model);
		System.out.println("색상 : " + myPhone.color);
		System.out.println("와이파이 상태 : " + myPhone.wifi);
		
		System.out.println();
		
		myPhone.bell();
		myPhone.sendVoice("여보세요");
		myPhone.recieveVoice("안녕하세요! 저는 홍길동입니다.");
		myPhone.sendVoice("아~ 네, 반갑습니다.");
		myPhone.hangUp();
		
		System.out.println();
		
		myPhone.setWifi(true);
		myPhone.internet();
	}

}
