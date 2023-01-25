
public class ThreadA extends Thread {
	//ThreadA 스레드는 WorkObjet의 methodA를 10번 실행	
	private WorkObject workObject;
	
	public ThreadA(WorkObject workObject) {
		setName("ThreadA");
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			workObject.methodA();
		}
	}
}
