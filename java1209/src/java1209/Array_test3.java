package java1209;

import java.util.Scanner;

public class Array_test3 {

	
	public static void main(String[] args) {
		int max = 0, sum = 0, num;
		double avg;
		boolean out = true;
		int[] score = null;

		
		Scanner scan = new Scanner(System.in);
		
		while(out) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");
			num = scan.nextInt();
			switch(num) {
			case 1:
				System.out.print("학생수> ");
				int studentNum = scan.nextInt();
				score = new int[studentNum];
			break;
			case 2:
				for(int i = 0; i < score.length; i++) {
					System.out.print("score[" + i + "] : ");
					score[i] = scan.nextInt();
				}
			break;
			case 3:
				for(int i = 0; i < score.length; i++) {
					System.out.println("score[" + i + "] : " + score[i]);
				}
			break;
			case 4:
				for(int i = 0; i <score.length; i++) {
					max = Math.max(max, score[i]);
					sum += score[i];
				}
				avg = sum / (double)score.length;
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);
			break;
			case 5:
				out = false;
			break;
			default:
				System.out.println("숫자를 다시 입력해 주세요(1 ~ 5)");
			}
		}
		scan.close();
	}

}
