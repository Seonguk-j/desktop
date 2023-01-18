
public class ExceptionHandlingExample2 {
	
	public static void printLength(String data) {
		try {
			int result = data.length();
			System.out.println("문자 수 : " + result);
		} catch(NullPointerException e) {			//e 이벤트
			System.out.println("null 값은 입력하시면 안됩니다.");
//			System.out.println(e.getMessage());		//간단하게 예외 출력 : 이유
//			System.out.println(e.toString());		//어떤 예외가 발생한지를 출력 : 예외 종류
//			e.printStackTrace();					//예외 상세 출력 : 예외발생 위치
		} finally {
			System.out.println("[마무리 실행]\n");
		}
	}

	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("[프로그램 종료]");
	}

}
