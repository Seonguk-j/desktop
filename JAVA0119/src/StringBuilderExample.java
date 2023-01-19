
public class StringBuilderExample {

	public static void main(String[] args) {
		
		String data = new StringBuilder()
				.append("DEF")
				.insert(0, "ABC")
				.delete(3, 4)
				.toString();
		System.out.println(data);
		
	}

}
/*
data : DEF
data : ABCDEF
data : ABCEF

delete(시작위치인덱스, 끝위치 4번째)
*/