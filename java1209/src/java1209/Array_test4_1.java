/*
 * 1. 10명 학생들의 점수를 배열에 입력받는다.
 * 2. for문을 이용하여 점수합을 구한다.
 * 3. 나누어 평균을 구한다.
 * 4. for문을 이용하여 평균과 비교한다.
 */
package java1209;

import java.util.Scanner;

public class Array_test4_1 {

	public static void main(String[] args) {
		int sum = 0;
		double avg;
		int[] arr = new int[10];
		
		Scanner scan = new Scanner(System.in);
		System.out.print(arr.length + "명의 학생들의 점수를 입력하세요 : ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			sum += arr[i];
		}
		
		avg = (double)sum / arr.length;
		System.out.println("평균 = " + avg);
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= avg)
				System.out.println("점수 " + arr[i] + "점은 평균 이상이다.");
			else
				System.out.println("점수 " + arr[i] + "점은 평균보다 작다.");
		}
		scan.close();
	}

}
