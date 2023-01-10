package java1213;

public class EmployeeDriver {

	public static void main(String[] args) {
    	Employee emp1;		// 첫 번째 Employee 객체 참조 변수
    	Employee emp2;		// 두 번째 Employee 객체 참조 변수

		emp1 = new Employee();		// Employee 객체를 생성하고 emp1이 가리키게 한다
		emp1.setName("이도령");		// emp1의 이름을 ‘이도령’으로 변경한다
		emp1.setNumber(100);		// emp1의 번호를 100으로 변경한다
		emp1.setAge(25);			// emp1의 나이를 25로 변경한다

		System.out.println(emp1.toString());	// emp1의 이름, 번호와 나이를 출력한다

		emp2 = new Employee();		// Employee 객체를 생성하고 emp2가 가리키게 한다
		emp2.setName("성춘향");		// emp2의 이름을 ‘성춘향’으로 변경한다
		emp2.setNumber(200);		// emp2의 번호를 200으로 변경한다
		emp2.setAge(18);			// emp2의 나이를 18로 변경한다

		System.out.println(emp2.toString());	// emp2의 이름, 번호와 나이를 출력한다

		emp2.setNumber(300);		// emp2의 번호를 300으로 변경한다
		
		System.out.println(emp2.toString());	// emp1의 이름, 번호와 나이를 출력한다

	}

}
