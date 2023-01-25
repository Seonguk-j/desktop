
public class DaemonExample {

	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true);		//AutoSaveThread를 데몬스레드(보조스레드)로 만듦
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e) {}
		
		System.out.println("메인 스레드 종료");
		//메인 스레드 종료시 데몬스레드(보조스레드) 같이 종료
	}

}
