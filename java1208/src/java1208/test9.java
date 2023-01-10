/*
 * while안에 랜덤을 돌려야함.
 * 1. 프로그램 1-100사이 숫자 랜덤선택
 * 2. 사용자가 추측
 * 3. 사용자가 추측한 값이 큰지 작은지 알려줌
 * 4. 사용자가 그만두기를 원하면 -1을 입력
 * 5. 맞출 때까지 추측한 횟수 카운트
 * 6. 맞을 경우 카운트값 출력 후
 * 7. 게임이 끝난 후 게임을 다시 하고싶으면 y 아니면 n
 */
package java1208;

import java.util.Random;
import java.util.Scanner;

public class test9 {

	public static void main(String[] args) {
		int random, input, cnt;
		boolean retry = true;
		
		Scanner scan = new Scanner(System.in);
		
		while(retry) {
			cnt = 0;
			Random generator = new Random();
			random = generator.nextInt(100) + 1;
			
			System.out.print("추측한 숫자를 입력하세요 : ");
			input = scan.nextInt();
			
			while(true) {
				cnt++;
				if(random != input && input >= 0) {
					System.out.println("추측한 숫자가 틀렸습니다.");
					if(random < input) {
						System.out.println("추측한 숫자가 너무 큽니다.");
					}
					else if(random > input){
						System.out.println("추측한 숫자가 너무 작습니다.");
					}
					else 
						break;
					System.out.print("추측한 숫자를 입력하세요 : ");
					input = scan.nextInt();
				}
				else if(input < 0) {
					break;
				}
				else {
					System.out.println("맞추셨습니다.");
					System.out.println("추측 횟수 : " + cnt);
					break;
				}
			}
			System.out.print("한번 더 게임을 하시겠습니까?(y/n) :");
			String temp = scan.next();
			if(temp.equals("y")) {
				retry = true;
			}
			else {
				retry = false;
			}
		}
		scan.close();
	}

}
