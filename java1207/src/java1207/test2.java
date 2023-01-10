package java1207;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean cheat;
		int attendScore;
		int totalScore;
		char grade;
		
		
		System.out.print("부정행위 여부(true 혹은 false) : ");
		cheat = scan.nextBoolean();
		System.out.print("출석률(0 ~ 100사이의 정수값) : ");
		attendScore = scan.nextInt();
		System.out.print("총점(0 ~ 100사이의 정수값) : ");
		totalScore = scan.nextInt();
		
		if(!cheat && attendScore >= 80 && totalScore >= 60) {
			if(totalScore >= 90) {
				grade = 'A';
			}
			else if(totalScore >= 80) {
				grade = 'B';
			}
			else if(totalScore >= 70) {
				grade = 'C';
			}
			else{
				grade = 'D';
			}
		}
		else {
			grade = 'F';
		}
		
		System.out.print("학점 = " + grade);
		scan.close();
	}

}
