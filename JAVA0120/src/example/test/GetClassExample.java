package example.test;

public class GetClassExample {

	public static void main(String[] args) throws Exception {
		//방법1 : 클래스로 가져오기
		Class clazz = Car.class;
		//방법2 : 클래스로 가져오기
//		Class clazz = Class.forName("example.test.Car");
		//방법3 : 객체로 부터 가져오기
//		Car car = new Car();
//		Class clazz = car.getClass();
		
		System.out.println("패키지 : " + clazz.getPackage().getName());
		System.out.println("클래스 간단 이름 : " + clazz.getSimpleName());
		System.out.println("클래스 전체 이름 : " + clazz.getName());

	}

}
