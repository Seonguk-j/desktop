/*
 * 1. 랜덤한 수를 입력받는다.
 * 2. 추측할 수를 입력받는다
 * 3. 랜덤한 수와 추측한 수의 일치여부를 확인한다.
 * 4. 랜덤한 수가 더 큰 경우 숫자가 너무 작다고 출력한다.
 * 5. 랜덤한 수가 더 큰 경우 숫자가 너무 크다고 출력한다.
 * 6. 일치할 경우 맞았다고 출력하고 종료한다.
 */
package java1208;

import java.util.Random;
import java.util.Scanner;

public class test8 {

	public static void main(String[] args) {
		int random, input;
		
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		random = generator.nextInt(10) + 1;
		
		System.out.print("추측한 숫자를 입력하세요 : ");
		input = scan.nextInt();
		while(random != input) {
			System.out.println("추측한 숫자가 틀렸습니다.");
			if(random < input) {
				System.out.println("추측한 숫자가 너무 큽니다.");
			}
			else {
				System.out.println("추측한 숫자가 너무 작습니다.");
			}
			System.out.print("추측한 숫자를 입력하세요 : ");
			input = scan.nextInt();
		}
		System.out.println("맞추셨습니다.");
		scan.close();
 	}

}
