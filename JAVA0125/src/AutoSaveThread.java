
public class AutoSaveThread extends Thread {
	public void save() {
		System.out.println("작업 내용을 저장함.");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				break;
			}
			save();		//1초마다 save 실행해서 저장이 되게 만들어 줌.
		}
	}
}
