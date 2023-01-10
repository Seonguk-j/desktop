/*
 * 1. 점수들의 수 배열, 점수들 입력받음
 * 2. 반대순 배열, 오름차순 배열, 내림차순 배열
 * 3. for문을 이용하여 역순 정렬
 * 4. 이중for문 이용하여 오름차순 정렬
 * 5. for문을 이용하여 오름차순 역순 정렬
 * 6. 출력
 */
package java1209;

import java.util.Scanner;

public class Array_test5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr;
		System.out.print("입력할 점수들의 수를 입력하세요 : ");
		int n = scan.nextInt();
		
		arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print((i + 1) + "번째 점수를 입려하세요 : ");
			arr[i] = scan.nextInt();
		}
		
		System.out.println();
		System.out.println("본래 순서의 점수들");
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("반대 순서의 점수들");
		for(int i = n - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("오름 차순의 점수들");
		for(int i = 0; i < n - 1; i++) {
			for(int j = i + 1; j < n; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("내림 차순의 점수들");
		for(int i = n - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		scan.close();
	}

}
