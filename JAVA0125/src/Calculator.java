
public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	//동기화 메소드 : 매개값을 메모리에 저장 후 일시정지 2초뒤 출력
	public synchronized void setMemory1(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
	
	public void setMemory2(int memory) {
		synchronized(this) {							//동기화 블록 : 매개값을 메모리에 저장 후 일시정지 2초 뒤 출력
			this.memory = memory;
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {}
			System.out.println(Thread.currentThread().getName() + " : " + this.memory);
		}
	}
}
