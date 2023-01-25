
public class SafeStopExample {

	public static void main(String[] args) {
		PrintThread printThread = new PrintThread();
		printThread.start();		//stop이 들어오기 전까지 계속 실행중 출력
		
		try {
			Thread.sleep(3000);		//main 부분을 3초간 실행 중지
		}
		catch(InterruptedException e) {}
		
		printThread.setStop(true);	//3초 뒤에 stop 실행
	}

}
