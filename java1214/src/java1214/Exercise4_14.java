package java1214;

import java.util.Random;
import java.util.Scanner;

public class Exercise4_14 {

	public static void main(String[] args) {
		Random random = new Random();
		
		int answer = random.nextInt(100) + 1; 
		int input = 0;
		int count = 0;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요 : ");
			input = scan.nextInt();
			if(answer == input) {
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는 " + count + "번 입니다.");
				break;
			}
			else {
				if(answer > input) {
					System.out.println("더 큰 수를 입력하세요.");
				}
				else{
					System.out.println("더 작은 수를 입력하세요.");
				}
			}
		} while(true);
		
		scan.close();
	}

}