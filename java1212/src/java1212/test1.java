package java1212;

import java.util.Scanner;

public class test1 {
	public static int getNumberOfZerosIter(int num) {
		int cnt = 0;		//숫자 0의 개수
		
		//N이 0보다 큰 동안 반복해준다
		while(num > 0) {
			//마지막 숫자가 0이면 숫자 0의 개수를 1만큼 증가시킨다.
			if(num % 10 == 0) cnt++;
			
			//마지막 숫자를 제거한 나머지 정수를 구한다.
			num /= 10;
		}
		return cnt;
	}

	public static int getNumberOfZerosRecur(int num) {
		if(num < 10)
			return 0;		//마지막 숫자가 0이 아니다.
		else if(num % 10 == 0)
			return getNumberOfZerosRecur(num / 10) + 1;
			//마지막 숫자가 0이라면 마지막 숫자를 제거한 나머지 정수내의 숫자 0의 개수에 1을 더한다.
		else
			return getNumberOfZerosRecur(num / 10);
			//마지막 숫자가 0이 아니면 마지막 숫자를 제거한 나머지 정수내의 숫자 0의 개수를 구한다.
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요 : ");
		int num = scan.nextInt();
		
		System.out.println("반복 결과 : " + getNumberOfZerosIter(num));
		System.out.println("재귀 결과 : " + getNumberOfZerosRecur(num));
		scan.close();
	}

}
