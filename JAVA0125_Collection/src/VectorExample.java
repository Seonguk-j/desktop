import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		//Vector 컬렉션 생성
		List<Board> list = new Vector<>();
//		List<Board> list = new ArrayList<>();		//스레드 형태로 작업할때는 ArrayList로 하는것은 좋지않다. 동시작업중 충돌이 일어나 데이터 손실 발생 가능성 있음
		
		//작업 스레드 객체 생성
		Thread threadA = new Thread() {
			@Override
			public void run() {
				for(int i = 1; i <= 1000; i++) {
					list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
				}
			}
		};
		
		//작업 스레드 객체
		Thread threadB = new Thread() {
			@Override
			public void run() {
				for(int i = 1001; i <= 2000; i++) {
					list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
				}
			}
		};
		
		//작업 스레드 실행
		threadA.start();
		threadB.start();
		
		//작업 스레드들이 모두 종료될 때까지 메인 스레드 기다리기
		try {
			threadA.join();		//threadA가 종료 될때 까지 main 스레드 일시 정지
			threadB.join();		//threadB가 종료 될때 까지 main 스레드 일시 정지
		}
		catch(Exception e) {}
		
		//저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println("총 객체 수 : " + size);
		System.out.println();
		
	}

}
