package java1207;

import java.util.Scanner;

public class If_elseif_grade {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("점수를 입력하세요 : ");
		int score = scan.nextInt();
		area(score);
		System.out.println("계산이 완료되었습니다.");
		scan.close();
	}
	
	static void area(int score) {
		if(score >= 0 && score <= 100) {
			grade(score);
		}
		else {
			reinput();
		}
	}
	
	static void grade(int score) {
		if(score >= 95) {
			System.out.println("학점은 A+입니다.");
		}
		else if(score >= 90) {
			System.out.println("학점은 A입니다.");
		}
		else if(score >= 85) {
			System.out.println("학점은 B+입니다.");
		}
		else if(score >= 80) {
			System.out.println("학점은 B입니다.");
		}
		else if(score >= 75) {
			System.out.println("학점은 C+입니다.");
		}
		else if(score >= 70) {
			System.out.println("학점은 C입니다.");
		}
		else if(score >= 65) {
			System.out.println("학점은 D+입니다.");
		}
		else if(score >= 60) {
			System.out.println("학점은 D입니다.");
		}
		else {
			System.out.println("학점은 F입니다.");
		}
	}
	
	static void reinput() {

		System.out.print("점수를 다시입력해 주세요 : ");
		int Score = scan.nextInt();
		area(Score);
	}

}
