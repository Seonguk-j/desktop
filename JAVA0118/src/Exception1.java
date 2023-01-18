
public class Exception1 {

	public static void main(String[] args) {
		
//		try {
//			int[] a = {2,0};
//			int b = 4;
//			int c = b / a[2];		//인덱스의 범위 초과
//			System.out.println(c);
//		} catch(ArithmeticException e) {
//			System.out.println("산술 오류 발생");
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("배열 길이 오류 발생");
//		}
//		
//		System.out.println("예외 처리 공부 중");
		
		int a = 0;
		int b = 2;
		
		try {
			System.out.println("외부로 접속");
			int c = b/a;
//			System.out.println("연결해제");
		} catch(ArithmeticException e) {
			System.out.println("오류 발생하였습니다.");
//			System.out.println("연결해제");
		} finally {						//반드시 실행 해야 되는 구문
			System.out.println("연결해제");
		}

	}

}
