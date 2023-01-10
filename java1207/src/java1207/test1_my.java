package java1207;

import java.util.Scanner;

public class test1_my {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("시험점수를 입력해주세요 : ");
		int testScore = scan.nextInt();
		System.out.print("면접점수를 입력해주세요 : ");
		int interviewScore = scan.nextInt();
		
		if(testScore >= 80 && interviewScore >=60) {
			System.out.println("합격입니다.");
		}
		else {
			System.out.println("불합격입니다.");
		}
		scan.close();
	}

}
