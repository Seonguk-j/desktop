package java1208;

import java.util.Scanner;

public class quiz1 {

	public static void main(String[] args) {
		/*
		 * 자바 프로그래밍 과목을 수강하는 학생들의 시험 점수들을 읽어 들여
		 * 통과 점수(60점 이상)를 받은 학생들의 수와
		 * 낙제 점수(60점 미만)를 받은 학생들의 수를 계산하여 출력하는 프로그램을 작성
		 * 수강 학생들의 수는 1 이상이라 가정
		 */
		int grade;
		int numStudents = 0;
		int numPass = 0;
		int numFail = 0;
		
		Scanner scan = new Scanner(System.in);
		
//		do {
//			System.out.print("점수(종료하려면 음수)를 입력하세요: ");
//			grade = scan.nextInt();
//			
//			numStudents++;
//			if(grade >= 60) numPass++;
//			else numFail++;
//		} while(grade >= 0);
		System.out.print("첫번째 점수(종료하려면 음수)를 입력하세요: ");
		grade = scan.nextInt();
		
		while(grade >= 0) {
			numStudents++;
			
			if(grade >= 60) numPass++;
			else numFail++;
			
			System.out.print("다음 점수(종료하려면 음수)를 입력하세요: ");
			grade = scan.nextInt();
		}
		
		System.out.println();
		System.out.println("학생들의 수 : " + numStudents);
		System.out.println("통과 학생들의 수 : " + numPass);
		System.out.println("낙제 학생들의 수 : " + numFail);
		
		scan.close();
	}

}
