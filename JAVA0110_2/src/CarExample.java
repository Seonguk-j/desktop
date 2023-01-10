
public class CarExample {

	public static void main(String[] args) {
		//Car 클래스를 이용하여 Car 객체 생성
		Car myCar = new Car();
		
		myCar.setGas(5);
		
		if(myCar.isLeftGas()) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		System.out.println("gas를 주입하세요.");
	}

}
