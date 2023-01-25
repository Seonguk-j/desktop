
public class ThreadNameExample {

	public static void main(String[] args) {
		//메인 스레드
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName() + " 실행");
		
		//추가 스레드
		for(int i = 0; i < 3; i++) {
			Thread threadA = new Thread() {
				@Override
				public void run() {
					System.out.println(getName() + " 실행");
				}
			};
			threadA.start();
		}
		
		Thread chatThread = new Thread() {
			@Override
			public void run() {
				System.out.println(getName() + " 실행");
			}
		};
		
		//스레드 이름 변경
		chatThread.setName("chat-thread");
		chatThread.start();
	}

}
