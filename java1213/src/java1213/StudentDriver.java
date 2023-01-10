package java1213;

import java.util.Scanner;

public class StudentDriver {

	public static void main(String[] args) {
		//첫 번째 학생을 나타내는 객체를 만든다.
//		Student stud1 = new Student();
//		Student stud2 = new Student();
//		
//		stud1.name = "선남";						//첫 번째 학생의 이름을 정한다.
//		stud1.assignmentScore = 91;				//첫 번째 학생의 과제 점수를 정한다.
//		stud1.examScore = 84;					//첫 번째 학생의 시험 점수를 정한다.
//		System.out.println(stud1.toString());	//첫 번째 학생의 이름, 점수들과 학점을 출력한다.
//		
//		stud2.name = "선녀";						//두 번째 학생의 이름을 정한다.
//		stud2.assignmentScore = 86;				//두 번째 학생의 과제 점수를 정한다.
//		stud2.examScore = 95;					//두 번째 학생의 시험 점수를 정한다.
//		System.out.println(stud2.toString());	//두 번째 학생의 이름, 점수들과 학점을 출력한다.
		
		Scanner scan = new Scanner(System.in);
		
		Student stud = new Student();
		System.out.print("학생의 이름을 입력하세요: ");
		stud.name = scan.next();
		System.out.print("학생의 과제 점수를 입력하세요: ");
		stud.assignmentScore = scan.nextInt();
		System.out.print("학생의 시험 점수를 입력하세요: ");
		stud.examScore = scan.nextInt();
		System.out.println();
		System.out.println(stud.toString());
		
		scan.close();
	}

}
