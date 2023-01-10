/*
 * 1. 거스름돈의 종류 선언
 * 2. 거스름돈의 갯수n 입력받음.
 * 3. while문을 통해 거스름돈이 한 종류라도 못바꿔주게 되는 경우 영업종료
 * 4. 돌려 줄 수 있는 경우 마지막 손님은 포함
 * 		아닌 경우 마지막손님 제외
 * 5. 그 전까지의 총 수입 합 출력.
 */
package java1208;

import java.util.Scanner;

public class self_test {
	
	static int r100, r500, r1000, r5000, r10000, n;

	public static void main(String[] args) {
		int exchange;
		int cost, total = 0, cnt = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("거스름돈의 갯수를 입력하세요 : ");
		n = scan.nextInt();
		r100 = n;
		r500 = n;
		r1000 = n;
		r5000 = n;
		r10000 = n;
		
		while(true) {
			System.out.print("탑승요금을 입력하세요(요금은 50,000원 이하입니다) :");
			cost = scan.nextInt();
			
			total += cost;
			cnt++;
			
			if(cost >= 10000) {
				exchange = 50000 - cost;
				remain(exchange);
			}
			else {
				exchange = 10000 - cost;
				remain(exchange);
			}
			System.out.println("거스름돈 : " + exchange);
			if(r100 <= 0 || r500 <= 0 || r1000 <= 0 || r5000 <= 0 || r10000 <= 0) {
				break;
			}
		}
		
		System.out.println();
		System.out.println("총 수입 : " + total);
		System.out.println("탑승객 수 : " + cnt);
		System.out.println("잔돈 ");
		System.out.println("100원 : " + r100);
		System.out.println("500원 : " + r500);
		System.out.println("1000원 : " + r1000);
		System.out.println("5000원 : " + r5000);
		System.out.println("10000원 : " + r10000);
		
		scan.close();
	}
	
	static void remain(int exchange) {
		while(exchange != 0) {
			if(exchange >= 10000) {
				r10000 -= exchange / 10000;
				exchange %= 10000;
			}
			else if(exchange >= 5000) {
				r5000 -= exchange / 5000;
				exchange %= 5000;
			}
			else if(exchange >= 1000) {
				r1000 -= exchange / 1000;
				exchange %= 1000;
			}
			else if(exchange >= 500) {
				r500 -= exchange / 500;
				exchange %= 500;
			}
			else {
				r100 -= exchange / 100;
				exchange %= 100;
			}
		}
	}

}
