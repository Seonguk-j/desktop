/*
 * 1. 고객 요금 입력받음.
 * 2. 고객 요금 합
 * 3. 고객의 수가 10명이 되면 중단.
 */
package java1208;

import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {
		int money;
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + "번째 고객의 탑승요금을 입력하세요 : ");
			money = scan.nextInt();
			sum += money;
		}
		System.out.println("오늘의 수입 : " + sum + "원");
		
		scan.close();
	}

}
