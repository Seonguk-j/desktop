

public class PromotionExample1 {

	public static void main(String[] args) {
		// 자동 형변환
		byte byteValue = 10;			//1byte -> 4byte
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';			//char 2byte -> int 4byte
		intValue = charValue;
		System.out.println("가의 유니코드: " + intValue);
		
		intValue = 50;					//int 4byte -> long 8byte
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		
		longValue = 100;				//long 8byte 정수 -> float 4byte 실수
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F;			//float 4byte -> double 8byte 실수
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);
	}

}
