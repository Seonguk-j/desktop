/*
 * 1. 양의 정수를 입력받음
 * 2. 입력받은수를 역순으로 출력
 */
package java1209;

import java.util.Scanner;

public class test12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요: ");
		int input = scan.nextInt();
		int output = 0;
		
		while(input > 0) {
			output = output * 10 + input % 10;
			input = input / 10;
		}
		System.out.println("역순으로 표시한 입력 정수 = " + output);
		scan.close();
	}

}
