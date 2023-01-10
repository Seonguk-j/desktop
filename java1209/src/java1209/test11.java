/*
 * 1. 원금 입력받음
 * 2. 연이율 입력받음
 * 3. while반복문 작성(원리금이 원금 2배 초과시 종료)
 * 4. 반복되는 매년마다 원리금 출력
 * 5. 최종 필요 년도 출력
 */
package java1209;

import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		double money, total;
		double interest;
		int year = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("원금을 입력하세요: ");
		money = scan.nextDouble();
		total = money;
		System.out.print("연 이율을 입력하세요: ");
		interest = scan.nextDouble();
		
		System.out.println("연도수\t원리금");
		while(total < 2 * money) {
			year++;
			total = total * (1 + interest/100);
			System.out.println(year + "\t" + total);
		}
		System.out.println();
		System.out.println("필요한 연도수 = " + year);
		scan.close();
	}

}
