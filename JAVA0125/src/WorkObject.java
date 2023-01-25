
public class WorkObject {
	
	public synchronized void methodA() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + " : methodA 작업 실행");
		notify();			//다른 스레드 실행 대기 상태 만들기
		try {
			wait();			//자신의 스레드 일시 정지 상태
		}
		catch(InterruptedException e) {}
	}
	
	public synchronized void methodB() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + " : methodB 작업 실행");
		notify();			//다른 스레드 실행 대기 상태 만들기
		try {
			wait();			//자신의 스레드 일시 정지 상태
		}
		catch(InterruptedException e) {}
	}
	
}
