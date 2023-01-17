
public class RemoteControlExample {

	public static void main(String[] args) {
		
		RemoteControl rc;					//통합 리모컨
		rc = new Television();				//TV 버튼
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		
		System.out.println();
		
		rc = new Audio();					//Audio 버튼
		rc.turnOn();
		rc.setVolume(6);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		
		System.out.println();
		
		RemoteControl.changeBattery();
		
//		Television tv = new Television();	//TV 리모컨
//		tv.turnOn();
//		Audio au = new Audio();				//audio 리모컨
//		au.turnOn();
		
		System.out.println();
		System.out.println("리모컨 최대 볼륨 : " + RemoteControl.MAX_VOLUME);
		System.out.println("리모컨 최소 볼륨 : " + RemoteControl.MIN_VOLUME);
		
//		RemoteControl.MAX_VOLUME = 20;		상수라 변경 불가
		
	}

}
