
public class KoreanExample {

	public static void main(String[] args) {
		korean k1 = new korean("123456-1234567", "김자바");
		
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		//final 필드에는 값을 변경할 수 없다.
//		k1.nation = "USA";
//		k1.ssn = "123-123-123456";
		
		//인스턴스 멤버의 값 변경은 가능
		k1.name = "감자바";
		System.out.println(k1.name);
	}

}
