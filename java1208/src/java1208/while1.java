package java1208;

import java.util.Scanner;

public class while1 {

	public static void main(String[] args) {
		//시험점수(0~100)를 입력 받아 점수를 출력
		int score;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("시험점수(0~100)를 입력하세요 : ");
		score = scan.nextInt();
		
		while(score < 0 || score > 100) {
			System.out.println("범위를 벗어난 시험 점수가 입력되었습니다.");
			System.out.print("시험점수(0~100)를 입력하세요 : ");
			score = scan.nextInt();
		}
		System.out.printf("시험점수 : %d", score);
		scan.close();
	}

}
