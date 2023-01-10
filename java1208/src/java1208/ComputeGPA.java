/*
 * 각 과목에 대해 과목명과 평가 요소들의 점수들을 입력 받아 총점을 계산하고
 * 학점을 부여한다. 그 다음에 평점(학점 평균)을 계산한다.
 * 
 * 1. 평가요소(출석, 과제, 퀴즈, 중간, 기말)
 * 2. 총점계산 = 요소별 비율산정 후 합
 * 3. 총점에 따른 학점계산
 * 4. 평균점수 계산
 */

package java1208;

import java.util.Scanner;

public class ComputeGPA {

	public static void main(String[] args) {
		
		// 각 과목의 이름과 평가 요소들의 점수들을 저장하는 변수들을 선언한다.
	       String coursename;
	       int attendscore;

	       // 각 과목의 총점과 학점 그리고 평점을 저장하는 변수들과 그 밖에 필요한 변수들을 선언한다.
	       String flag;
	       double totalScore;
	       int report, quiz, midtermexam, finalexam;
	       char grade;
	       int score;
	       int cnt = 0;
	       double sum = 0;
	       double finalScore;

	       // 키보드로부터 입력하는 데이터를 읽기 위한 Scanner 객체를 만든다.
	       Scanner scan = new Scanner (System.in);

	       // 사용자가 계속하기를 원한다면 다음을 반복한다.
	       do {
		      		// 사용자로부터 과목의 이름과 각 평가 요소의 점수를 한 번에 하나씩 입력하라고 요청한다. 그리고 입력된 점수를 읽는다.
	              	System.out.print("과목의 이름을 입력하세요:\t");
	              	coursename = scan.next();
	              	System.out.print("출석 점수를 입력하세요:\t\t");
	              	attendscore = scan.nextInt();
	              	System.out.print("과제 점수를 입력하세요:\t\t");
	              	report = scan.nextInt();
	              	System.out.print("수시시험 점수를 입력하세요:\t\t");
	              	quiz = scan.nextInt();
	              	System.out.print("중간시험 점수를 입력하세요:\t\t");
	              	midtermexam = scan.nextInt();
	              	System.out.print("기말시험 점수를 입력하세요:\t\t");
	              	finalexam = scan.nextInt();

	              	// 과목의 총점을 계산하고 출력한다.
	              	totalScore = attendscore * 0.1 + report * 0.4 + quiz * 0.1 + midtermexam * 0.2 + finalexam * 0.2;

	              	// 과목의 학점을 결정한다.
	              	if(totalScore >= 90) {grade = 'A'; score = 4;}
	              	else if(totalScore >= 80) {grade = 'B'; score = 3;}
	              	else if(totalScore >= 70) {grade = 'C'; score = 2;}
	              	else if(totalScore >= 60) {grade = 'D'; score = 1;}
	              	else {grade = 'F'; score = 0;}

	              	// 과목의 이름과 학점을 출력한다.
	              	System.out.println("과목 " + coursename + "의 총점 :\t\t" + totalScore);
	              	System.out.println("과목 " + coursename + "의 학점 :\t\t" + grade);

	              	// 학점들의 누계를 계산한다.
	              	sum += score;
	              	cnt++;

	              	// 사용자가 계속하기를 원하는 지를 예(y) 혹은 아니오(n)로 입력하라고 요청한다. 그리고 입력된 값을 읽는다.
	       	      	System.out.print("계속하기를 원하세요? 그렇다면 y를 아니면 n를 입력하세요: ");
	       	     	flag = scan.next();
	        } while (flag.equals("y"));

	        // 평점을 계산하고 출력한다
	       finalScore = sum / cnt;
	       System.out.println("최종 학점 : " + finalScore);
	       scan.close();
	}

}
