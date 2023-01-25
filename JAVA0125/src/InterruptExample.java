
public class InterruptExample {

	public static void main(String[] args) {
		Thread thread = new PrintThread2();
		thread.start();
		
		try {
			Thread.sleep(1000);		//main 스레드 1초간 일시 정지
		}
		catch(InterruptedException e) {}
		
		thread.interrupt();			//thread에 대한 인터럽트 실행
	}

}
