
public class ValueCompareExample {

	public static void main(String[] args) {
		
		//포장 객체에서 값이 공유가 되는 범위
		//boolean				true, false
		//char					\u0000 ~ \u007f
		//byte, short, int		-128 ~ 127
		//-128 ~ 127 초과일 경우 int : -128 ~ 127
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("== : " + (obj1 == obj2));				//
		System.out.println("equals() : " + obj1.equals(obj2));		//객체안의 데이터 값을 비교
		System.out.println();
		
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("== : " + (obj3 == obj4));				//
		System.out.println("equals() : " + obj3.equals(obj4));		//객체안의 데이터 값을 비교

	}

}
