import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		
		String data1 = "홍길동&이수홍,박연수";	//구분자가 혼재가 된 경우
		String[] arr = data1.split("&|,");
		for(String token : arr) {			//arr배열에 들어 있는 값을 순서대로 token에 대입
			System.out.println(token);		//배열에 들어 있는 값을 차례로 출력
		}
		
		System.out.println();
		
		String data2 = "홍길동/이수홍/박연수";	//구분자가 하나의 종류일 경우
		StringTokenizer st = new StringTokenizer(data2, "/");
		while(st.hasMoreTokens()) {			//남아있는 문자열이 있는지 확인
			String token = st.nextToken();	//문자열을 하나씩 가져옴
			System.out.println(token);
		}

	}

}
