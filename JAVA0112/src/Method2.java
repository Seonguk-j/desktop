class Area {
	static void manual() {		//정적 메소드(static) 생성 : 바로 사용 가능, void : 반환되는 값이 없다.
		System.out.println("현재 사용 가능한 함수 목록");
		System.out.println("triangle: 삼각형 넓이");
		System.out.println("rectangle: 사각형 넓이");
		System.out.println("입니다.");
	}
	
	double triangle(int a, int b) {
		return (double)a * b / 2;
	}
	int rectangle(int a, int b) {
		return a * b;
	}
}

public class Method2 {

	public static void main(String[] args) {
		Area.manual();
		
//		Area.triangle(3,5);		인스턴스 메소드 : 객체를 생성한 이후에 사용 가능
//		Area.rectangle(3,4);
		
		Area cal = new Area();
		cal.manual();
		
		System.out.println(cal.triangle(3,5));
		System.out.println(cal.rectangle(3,4));
	}

}
