package java1207;

import java.util.Scanner;

public class test8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("온도를 입력하세요 : ");
		int temp = scan.nextInt();
		String sport;
		
		if(temp >= 5) {
			if(temp >= 15) {
				if(temp >= 25) {
					sport = "수영";
				}
				else {
					sport = "테니스";
				}
			}
			else {
				sport = "골프";
			}
		}
		else {
			sport = "스키";
		}
		System.out.println(sport + "를 하기에 적절한 날씨 입니다.");
		
		scan.close();
	}

}
