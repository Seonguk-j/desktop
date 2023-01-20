package thread;

class MyThread3 implements Runnable {
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("<" + Thread.currentThread().getName() + ">");
		}
		for(int i = 0; i < 1000; i++) {		//시간 지연
		}
	}
}

public class Thread2 {

	public static void main(String[] args) {
		
		Runnable t = new MyThread3();
		Thread t1 = new Thread(t, "thread1");
		t1.setPriority(1);		//우선순위 1로 지정
		System.out.println("t1의 우선순위는 : " + t1.getPriority());
		
		Thread t2 = new Thread(t, "thread2");
		//우선순위 지정 없음
		System.out.println("t2의 우선순위는 : " + t2.getPriority());

		Thread t3 = new Thread(t, "thread3");
		t3.setPriority(10);		//우선순위 1로 지정
		System.out.println("t3의 우선순위는 : " + t3.getPriority());
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
