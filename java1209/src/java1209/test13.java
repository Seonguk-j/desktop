/*
 * 1. 0보다 큰 정수 n을 입력받음
 * 2. 1과 n사이 정수 쌍(i, j) 출력
 * 3. i는 j로 나누어 떨어져야함
 * 4. i != j
 */
package java1209;

import java.util.Scanner;

public class test13 {

	public static void main(String[] args) {
		int n;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("한 정수를 입력하세요: ");
		n = scan.nextInt();
		
		System.out.println("모든 나누어 떨어지는 정수들의 쌍은 다음과 같다.");
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j < i; j++) {
				if(j != i && i % j == 0) {
					System.out.println("(" + i + "," + j + ")");
				}
			}
		}
		scan.close();
	}

}
