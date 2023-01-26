package hash;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

	public static void main(String[] args) {
		//Hashtable로 map 객체 생성
		Map<String, Integer> map = new Hashtable<>();
//		Map<String, Integer> map = new HashMap<>();		//총 Entry수가 2000개가 안나올수 있음
		
		//작업 스레드 A 객체 생성 1~1000까지 데이터 입력
		Thread threadA = new Thread() {
			@Override
			public void run() {
				for(int i = 1; i <= 1000; i++) {
					map.put(String.valueOf(i), i);
				}
			}
		};
		
		//작업 스레드 B 객체 생성 1001~2000까지 데이터 입력
		Thread threadB = new Thread() {
			@Override
			public void run() {
				for(int i = 1001; i <= 2000; i++) {
					map.put(String.valueOf(i), i);
				}
			}
		};
		
		//스레드 시작
		threadA.start();
		threadB.start();
		
		//스레드 작업 끝날때 까지 Main 스레드 양보
		try {
			threadA.join();
			threadB.join();
		}
		catch(Exception e) {}
		
		//저장된 총 Entry 수 출력
		int size = map.size();
		System.out.println("총 엔트리 수 : " + size);
		System.out.println();
		
	}

}
