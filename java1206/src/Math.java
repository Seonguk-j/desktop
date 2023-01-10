

import java.util.Scanner;

public class Math {

	public static void main(String[] args) {
		int first, second;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력하세요: ");
		first = scan.nextInt();
		System.out.print("두 번째 정수를 입력하세요: ");
		second = scan.nextInt();
		System.out.println("합 = " + (first + second));
		System.out.println("차 = " + (first - second));
		System.out.println("곱 = " + (first * second));
	}

}
