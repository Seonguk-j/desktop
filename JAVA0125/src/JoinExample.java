
public class JoinExample {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread();	//1~100까지의 합 구하기
		sumThread.start();
		try {
			sumThread.join();					//sumThread가 동작완료 될때까지 main 일시정지
		}
		catch(InterruptedException e) {}
		
		System.out.println("1~100까지의 합 : " + sumThread.getSum());
	}

}
