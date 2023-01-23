import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		
		String regExp= "(02|010)-\\d{3,4}-\\d{4}";		//특수기호 사용시 \가 들어간 후에 특수기호를 입력해야함
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		}
		else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@mycompanycom";
		result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		}
		else {
			System.out.println("정규식과 일치하지 않습니다.");
		}

	}

}