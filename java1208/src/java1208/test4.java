package java1208;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		int buyAmount;
		int leftover;
		int numcoin;
		int coinvalue = 100;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("구매 금액을 입력하세요 [0-500]: ");
		buyAmount = scan.nextInt();
		leftover = 500 - buyAmount;
		
		System.out.println(leftover + "원의 거스름돈은 다음과 같다");
		while(leftover > 0) {
			numcoin = leftover / coinvalue;
			System.out.println(coinvalue + "원짜리 동전" + numcoin + "개");
			leftover = leftover % coinvalue;
			coinvalue = coinvalue / 10;
		}
		
		
		scan.close();
	}

}
