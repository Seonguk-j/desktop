package java1207;

import java.util.Scanner;

public class ComputerGrade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int attendScore;
		int assignmentScore;
		int quizScore;
		int midtermexamScore;
		int finalexamScore;
		
		double totalScore;
		char grade;
		
		System.out.print("출석 점수를 입력하세요 :\t\t");
		attendScore = scan.nextInt();
		System.out.print("과제 점수를 입력하세요 :\t\t");
		assignmentScore = scan.nextInt();
		System.out.print("수시시험 점수를 입력하세요 :\t\t");
		quizScore = scan.nextInt();
		System.out.print("중간시험 점수를 입력하세요 :\t\t");
		midtermexamScore= scan.nextInt();
		System.out.print("기말시험 점수를 입력하세요 :\t\t");
		finalexamScore = scan.nextInt();
		
		totalScore = attendScore * 0.1 + assignmentScore * 0.4 + quizScore * 0.1 + midtermexamScore * 0.2 + finalexamScore * 0.2;
		
		if(totalScore >= 90) {
			grade = 'A';
		}
		else if(totalScore >= 80) {
			grade = 'B';
		}
		else if(totalScore >= 70) {
			grade = 'C';
		}
		else if(totalScore >= 60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		System.out.println("총점 :\t" + totalScore);
		System.out.println("학점 :\t" + grade);
		scan.close();
	}

}
