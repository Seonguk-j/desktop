import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

	public static void main(String[] args) {
		//스레드 풀 생성
		ExecutorService executorService = Executors.newFixedThreadPool(5);		//최대 스레드 개수 5개 고정
		
//		ExecutorService executorService = new ThreadPoolExecutor();				
		//생성된 스레드풀의 초기 수와 코어 수는 0개 이고, 작업 개수가 많아지면 새 스레드를 생성시켜
		//작업을 처리한다. 60초 동안 스레드가 아무 작업을 하지 않으면 스레드를 풀 에서 제거한다.
		
//		ExecutorService executorService = new ThreadPoolExecutor(
//			3,									//코어 스레드 개수
//			100,								//최대 스레드 개수
//			120L,								//놀고 있는 시간 : 기본(60초)
//			TimeUnit.SECONDS,					//놀고 있는 시간 단위
//			new SynchronousQueue<Runnable>()	//작업 큐
//		);
		
		
		
		//작업 생성과 처리 요청
		
		//스레드풀 종료
		executorService.shutdown();
	}

}
