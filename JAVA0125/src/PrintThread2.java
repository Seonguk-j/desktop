
public class PrintThread2 extends Thread {
	public void run() {
//		try {
//			while(true) {
//				System.out.println("실행 중");
//				Thread.sleep(1);		//인터럽트 예외가 발생할 수 있게 일시 정지 상태만들기 
//			}
//		}
//		catch(InterruptedException e) {}
		while(true) {
			System.out.println("실행 중");
			if(Thread.interrupted()) {		//인터럽트가 걸렸는지 확인
				break;						//break문으로 while 반복문 빠져나가기
			}
		}
		
		System.out.println("리소스 정리");
		System.out.println("실행 종료");
	}
}
