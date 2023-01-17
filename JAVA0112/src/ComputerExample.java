
public class ComputerExample {

	public static void main(String[] args) {
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("원 면적 : " + calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("원 면적 : " + computer.areaCircle(r));
		//자식 클래스에서 부모메서드인 areaCircle()이 있지만 자식클래스에서 areaCircle()에 대한 메소드를 수정했다면
		//자식 클래스에서 수정한 areaCircle()만 실행이 가능하다.	오버라이딩 특징
		
	}

}
