package WildCard;

public class GenericExample {

	public static void main(String[] args) {
		
		//모든 사람이 신청 가능
		Course.resisterCourse1(new Applicant<Person>(new Person()));
		Course.resisterCourse1(new Applicant<Worker>(new Worker()));
		Course.resisterCourse1(new Applicant<Student>(new Student()));
		Course.resisterCourse1(new Applicant<HighStudent>(new HighStudent()));
		Course.resisterCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		
		System.out.println();
		
		//학생만 신청 가능 : 일반인, 직장인 신청 불가
//		Course.resisterCourse2(new Applicant<Person>(new Person()));
//		Course.resisterCourse2(new Applicant<Worker>(new Worker()));
		Course.resisterCourse2(new Applicant<Student>(new Student()));
		Course.resisterCourse2(new Applicant<HighStudent>(new HighStudent()));
		Course.resisterCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		
		System.out.println();
		
		//일반인, 직장인만 신청 가능 : 학생 신청 불가
		Course.resisterCourse3(new Applicant<Person>(new Person()));
		Course.resisterCourse3(new Applicant<Worker>(new Worker()));
//		Course.resisterCourse3(new Applicant<Student>(new Student()));
//		Course.resisterCourse3(new Applicant<HighStudent>(new HighStudent()));
//		Course.resisterCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));

	}

}
