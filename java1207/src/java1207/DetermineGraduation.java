package java1207;

import java.util.Scanner;

public class DetermineGraduation {

	static int score, toeic;
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.print("총 이수학점을 입력하세요 : ");
		score = scan.nextInt();
		System.out.print("TOEIC점수를 입력하세요 : ");
		toeic = scan.nextInt();
		
		inputCheck();
		scan.close();
	}
	
	static void inputCheck() {
		
		if(score < 0 || score > 1000) {
			scoreError();
		}
		if(toeic < 0 || toeic > 990) {
			toeicError();
		}
		status();
	}
	
	static void scoreError() {
		System.out.println("이수학점이 잘못되었습니다.");
		System.out.print("이수학점을 다시 입력하세요 : ");
		score = scan.nextInt();
		if(score < 0 || score > 1000) {
			scoreError();
		}
	}
	
	static void toeicError() {
		System.out.println("TOEIC점수가 잘못되었습니다.");
		System.out.print("TOEIC점수를 다시 입력하세요 : ");
		toeic = scan.nextInt();
		if(toeic < 0 || toeic > 990) {
			toeicError();
		}
	}
	
	static void status() {
		System.out.print("이수학점 : " + score);
		System.out.println(", TOEIC점수 : " + toeic);
		if(score >= 140) {
			if(toeic >= 700) {
				System.out.println("졸업을 축하합니다!");
			}
			else {
				System.out.println("아쉽지만 수료하셨습니다.");
			}
		}
		else {
			System.out.println("졸업이 불가합니다.");
		}
	}

}
