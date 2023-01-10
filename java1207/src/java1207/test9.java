package java1207;

import java.util.Scanner;

public class test9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int income;
		int grade;
		double upgrade;
		double nextYear;
		double total;
		
		System.out.print("현 연봉을 입력하세요 : ");
		income = scan.nextInt();
		System.out.print("근무 평가등급을 입력하세요 : ");
		grade = scan.nextInt();
		
		if(grade <=3 && grade > 0) {
			if(grade == 1) {
				upgrade = 0.06;
			}
			else if(grade == 2) {
				upgrade = 0.04;
			}
			else {
				upgrade = 0.02;
			}
			nextYear = income * upgrade;
			total = income + nextYear;
			System.out.println("연봉 인상액 : " + nextYear);
			System.out.println("새 연봉 : " + total);
		}
		else {
			System.out.println("평가등급을 다시 입력해주세요.");
		}
		
		scan.close();
	}

}
