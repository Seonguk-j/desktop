package thread;

//Thread 클래스 이용
class MyThread extends Thread {
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("스레드 진행중 " + i);
		}
	}
}

//Runnable 인터페이스 구현
class MyThread2 implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("러너블 진행중 " + i);
		}
	}
}

public class Thread1 {
	public static void main(String[] args) {
		MyThread th1 = new MyThread();		//Thread 상속한 클래스
		Runnable th2 = new MyThread2(); 	//Runnable 구현한 클래스
		Thread t = new Thread(th2);			//러너블로 구현한 클래스를 Thread 클래스에 대
		
		th1.start();
		t.start();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("메인함수 진행중 " + i);
		}
	}
}
