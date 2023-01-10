package java1207;

import java.util.Scanner;

public class test10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int womanLength, manLength;
		double womanWeight, manWeight;
		System.out.print("여성의 신장을 입력하세요 : ");
		womanLength = scan.nextInt();
		System.out.print("남성의 신장을 입력하세요 : ");
		manLength = scan.nextInt();
		
		if(womanLength > 150) {
			womanWeight = 37.8 + 0.75 * (womanLength - 150);
		}
		else {
			womanWeight = 37.8;
		}
		if(manLength > 150) {
			manWeight = 40 + 0.89 * (manLength - 150);
		}
		else {
			manWeight = 37.8;
		}
		
		System.out.println("여성의 이상적인 체중은 " + womanWeight + "이다.");
		System.out.println("남성의 이상적인 체중은 " + manWeight + "이다.");
		
		scan.close();
	}

}
