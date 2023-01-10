/*
 * 1. 손님의 이름이 "워드"일때까지 영업을 한다.
 * 2. 손님의 이름을 입력받는다.
 * 3. 요금을 입력받는다
 * 4. 요금을 합한다
 * 5. 총 수입을 출력한다.
 */
package java1208;

import java.util.Scanner;

public class test7 {

	public static void main(String[] args) {
		String name;
		int cost;
		int total = 0;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("손님의 이름을 입력하세요 : ");
			name = scan.next();
			System.out.print("요금을 입력하세요 : ");
			cost = scan.nextInt();
			
			total += cost;
		} while(!name.equals("워드"));
		
		System.out.println();
		System.out.println("총 수입은 " + total + "이다.");
		
		scan.close();
	}

}
