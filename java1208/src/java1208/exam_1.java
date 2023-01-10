package java1208;

import java.util.Scanner;

public class exam_1 {

	public static void main(String[] args) {
		//90이상 A, 80이상 B, 70이상 C, 60이상 D, 60미만 F
		//점수를 입력하세요(종료하려면 -1을 입력): 
		int A = 0;
		int B = 0;
		int C = 0;
		int D = 0;
		int F = 0;
		int total = 0;
		int score;
		
		Scanner scan = new Scanner(System.in);
		//점수를 입력받는다
		System.out.print("점수를 입력하세요(종료하려면 -1을 입력) : ");
		score = scan.nextInt();
		
		//score가 0보다 큰 동안 반복해서 점수를 입력받는다.
		while(score >= 0) {
			total++;
						
			if(score >= 90) A++;
			else if(score >= 80) B++;
			else if(score >= 70) C++;
			else if(score >= 60) D++;
			else F++;
			
			//다음 점수를 입력받는다.
			System.out.print("점수를 입력하세요(종료하려면 -1을 입력) : ");
			score = scan.nextInt();
		}
		
		System.out.println();
		System.out.println("점수의 총 수 : " + total);
		System.out.println("A를 받은 학생수 : " + A);
		System.out.println("B를 받은 학생수 : " + B);
		System.out.println("C를 받은 학생수 : " + C);
		System.out.println("D를 받은 학생수 : " + D);
		System.out.println("F를 받은 학생수 : " + F);
		
		scan.close();
	}

}
