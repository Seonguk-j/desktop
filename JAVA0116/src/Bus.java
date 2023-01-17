
public class Bus implements Vehicle{

	//run 메소드 오버라이딩
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	//추가 메소드
	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}

}
