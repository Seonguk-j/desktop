/*
 * 1. 숫자 입력받음
 * 2. 입력받은 수를 10으로 나눈 나머지 값이 홀수인지 짝수인지 판멸
 * 3. 입력받은 수를 10으로 나눠줌
 * 4. count한 수 출력
 */
package java1209;

import java.util.Scanner;

public class test14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int oddCnt = 0, evenCnt = 0;
		System.out.print("숫자를 입력하세요 : ");
		int input = scan.nextInt();
		
		while(input != 0) {
			int temp = input % 10;
			if(temp % 2 == 0) {
				evenCnt++;
			}
			else {
				oddCnt++;
			}
			input /= 10;
		}
		
		System.out.println("짝수의 갯수 : " + evenCnt);
		System.out.println("홀수의 갯수 : " + oddCnt);
		scan.close();
	}

}
