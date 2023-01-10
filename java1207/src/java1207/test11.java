package java1207;

import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int year;
		System.out.print("연도를 입력하세요 : ");
		year = scan.nextInt();
		
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					System.out.println(year + "는 윤년입니다.");
				}
				else {
					System.out.println(year + "는 윤년이 아닙니다.");
				}
			}
			else {
				System.out.println(year + "는 윤년입니다.");
			}
		}
		else {
			System.out.println(year + "는 윤년이 아닙니다.");
		}
		
		scan.close();
	}

}
