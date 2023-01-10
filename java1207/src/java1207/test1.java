package java1207;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학점을 입력하세요 : ");
		double score = scan.nextDouble();
		String str;
		
		if(score >= 4.3) {
			str = "전액장학금";
		}
		else if(score >= 4.0) {
			str = "반액장학금";
		}
		else if(score >= 3.7) {
			str = "모범장학금";
		}
		else {
			str = "장학금 없음";
		}
		System.out.println(str);
		scan.close();
	}

}
