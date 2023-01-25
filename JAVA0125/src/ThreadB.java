
public class ThreadB extends Thread{
	//ThreadB 스레드는 WorkObjet의 methodB를 10번 실행	
	private WorkObject workObject;
	
	public ThreadB(WorkObject workObject) {
		setName("ThreadB");
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			workObject.methodB();
		}
	}
}
