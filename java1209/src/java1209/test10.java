/*
 * 1. 보고할 구가 있는지 입력받는다.
 * 2-1. 있다면 후보들의 득표수를 입력받는다.
 * 2-2. while문을 벗어난다.
 * 3. 최종 득표율을 계산하고 당선자를 출력한다.
 */
package java1209;

import java.util.Scanner;

public class test10 {

	public static void main(String[] args) {
		int first, second;
		int firstTotal = 0, secondTotal = 0;
		double firstRatio, secondRatio;
		int total = 0;
		boolean check;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("보고할 구가 있나요(있으면 Yes 없으면 No를 입력하세요): ");
		String str = scan.next();
		if(str.equals("Yes")) check = true;
		else check = false;
		
		while(check) {
			System.out.print("첫번째 후보가 그 구에서 얻은 득표 수를 입력하세요: ");
			first = scan.nextInt();
			System.out.print("두번째 후보가 그 구에서 얻은 득표 수를 입력하세요: ");
			second = scan.nextInt();
			
			firstTotal += first;
			secondTotal += second;

			System.out.println();
			System.out.print("보고할 구가 있나요(있으면 Yes 없으면 No를 입력하세요): ");
			str = scan.next();
			if(str.equals("Yes")) check = true;
			else check = false;
		}
		total = firstTotal + secondTotal;
		
		firstRatio = (double)firstTotal * 100 / total;
		secondRatio = (double)secondTotal * 100 / total;
		System.out.println("첫 번째 후보가 얻은 총 투표수는 " + firstTotal + "이고 득표율은 " + String.format("%.1f", firstRatio) + "%이다.");
		System.out.println("두 번째 후보가 얻은 총 투표수는 " + secondTotal + "이고 득표율은 " + String.format("%.1f", secondRatio) + "%이다.");
		
		scan.close();
	}

}
