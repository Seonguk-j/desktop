package java1212;

import java.util.Scanner;

public class test4 {

	public static int recursion(int num) {
		int cnt;
		
		if(num == 0) cnt = 0;
		else {
			if(num % 2 == 0) cnt = 1 + recursion(num / 10);
			else cnt = recursion(num / 10);
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		int num;
//		int count = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		num = scan.nextInt();
		System.out.println("재귀 결과 : " + recursion(num));
		
//		while(num > 0) {
//			if(num % 2 == 0) count++;
//			num = num / 10;
//		}
//		System.out.println("반복 결과 : " + count);
		
		scan.close();
	}

}
