
public class StringExample {

	public static void main(String[] args) {
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		String str = "나는 \"자바\"를 배웁니다.";
		System.out.println(str);
		
		str = "번호\t이름\t직업";
		System.out.println(str);
		
		System.out.print("나는\n");
		System.out.print("자바를\n");
		System.out.print("배웁니다.\n");
		
		//\r : 캐리지 리턴 CR : 커서의 위치를 현재 줄의 맨 앞으로 이동
		
		str = "abcde\nfghi";
		System.out.print(str);
		System.out.println();
		
		String str1 = "       abcd";
		String str2 = "       \rabcd";
		System.out.print(str1);
		System.out.print(str2);
		
		byte byteValue = 10;
		int intValue = byteValue;		//자동 타입 변환
		
		long longValue = 50000000000L;
		float floatValue = longValue;	//5.0E9f
		double doulbeValue = longValue;	//5.0E9
		
		char charValue = 'A';
		intValue = charValue;		//65
		
		byteValue = 65;			//1byte byte형은 char형에 대입 불가 자동 형변환X
		//charValue = byteValue;		//에러
	} 

}
