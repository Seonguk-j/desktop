package java1214;

import java.util.Scanner;

public class Exercise5_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("거스름돈을 입력하세요: ");
		int money = scan.nextInt();
		boolean out = true;
		
		System.out.println("money = " + money);
		
		int[] coinUnit = {500, 100, 50, 10};
		int[] coin = {5, 5, 5, 5};
		
		for(int i = 0; i < coinUnit.length; i++) {
			int coinNum = 0;
			coinNum = money / coinUnit[i];
			if(coinNum > coin[i]) {
				coinNum = coin[i];
			}
			coin[i] -= coinNum;
			money = money - coinNum * coinUnit[i];
			System.out.println(coinUnit[i] + "원: " + coinNum);
		}
		
		if(money > 0) {
			System.out.println("거스름돈이 부족합니다.");
			out =false;
		}
		if(out) {
			System.out.println("=남은 동전의 개수=");
			
			for(int i = 0; i < coinUnit.length; i++) {
				System.out.println(coinUnit[i] + "원: " + coin[i]);
			}
		}
		scan.close();
	}

}
